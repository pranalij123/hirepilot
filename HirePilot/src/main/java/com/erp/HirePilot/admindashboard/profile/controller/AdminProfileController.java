package com.erp.HirePilot.admindashboard.profile.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.erp.HirePilot.admindashboard.profile.dto.AdminProfileRequestDto;
import com.erp.HirePilot.admindashboard.profile.service.AdminProfileService;

@RestController
@RequestMapping("/admin/profile")
@CrossOrigin(origins = "*")
public class AdminProfileController {

    private final AdminProfileService service;

    public AdminProfileController(AdminProfileService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> getProfile(@RequestHeader("X-User-Id") Long userId) {
        return ResponseEntity.ok(service.getProfile(userId));
    }

    @PutMapping
    public ResponseEntity<?> updateProfile(@RequestHeader("X-User-Id") Long userId,
                                           @RequestBody AdminProfileRequestDto dto) {
        return ResponseEntity.ok(service.updateProfile(userId, dto));
    }
}
