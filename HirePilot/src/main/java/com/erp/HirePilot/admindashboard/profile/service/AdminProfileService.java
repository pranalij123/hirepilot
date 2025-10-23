package com.erp.HirePilot.admindashboard.profile.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.HirePilot.admindashboard.profile.dto.AdminProfileRequestDto;
import com.erp.HirePilot.admindashboard.profile.dto.AdminProfileResponseDto;
import com.erp.HirePilot.admindashboard.profile.entity.AdminProfile;
import com.erp.HirePilot.admindashboard.profile.repo.AdminProfileRepository;
import com.erp.HirePilot.entity.User;
import com.erp.HirePilot.repo.UserRepo;

@Service
public class AdminProfileService {

    private final UserRepo userRepository;
    private final AdminProfileRepository adminProfileRepository;

    public AdminProfileService(UserRepo userRepository, AdminProfileRepository adminProfileRepository) {
        this.userRepository = userRepository;
        this.adminProfileRepository = adminProfileRepository;
    }

    public AdminProfileResponseDto getProfile(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        AdminProfileResponseDto response = new AdminProfileResponseDto();
        response.setName(user.getName());
        response.setEmail(user.getEmail());

        adminProfileRepository.findById(userId).ifPresent(profile -> {
            response.setAdminRole(profile.getAdminRole());
            response.setJoiningDate(profile.getJoiningDate());
        });

        return response;
    }

    @Transactional
    public AdminProfileResponseDto updateProfile(Long userId, AdminProfileRequestDto dto) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setName(dto.getName());
        userRepository.save(user);

        AdminProfile profile = adminProfileRepository.findById(userId)
                .orElse(new AdminProfile());

        profile.setUser(user);
        profile.setAdminRole(dto.getAdminRole());
        profile.setJoiningDate(dto.getJoiningDate());

        adminProfileRepository.save(profile);
        return getProfile(userId);
    }
}
