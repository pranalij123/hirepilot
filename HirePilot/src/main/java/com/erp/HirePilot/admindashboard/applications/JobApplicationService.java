package com.erp.HirePilot.admindashboard.applications;

import com.erp.HirePilot.entity.User;
import com.erp.HirePilot.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobApplicationService {

    private final JobApplicationRepository repository;
    private final UserRepo userRepository;

    // ➕ Add application
    public JobApplicationResponse addApplication(JobApplicationRequest req, Long userId) {
        // Convert Long to Integer to match User entity ID
        Integer userIdInt = userId.intValue();
        User user = userRepository.findById(userIdInt)
                .orElseThrow(() -> new RuntimeException("User not found"));

        JobApplication application = new JobApplication();
        application.setApplicant(user);
        application.setJobTitle(req.getJobTitle());
        application.setEmployer(req.getEmployer());
        application.setStatus(req.getStatus() != null
                ? ApplicationStatus.valueOf(req.getStatus().toUpperCase())
                : ApplicationStatus.APPLIED);

        JobApplication saved = repository.save(application);
        return toResponse(saved);
    }

    // 📋 Get all applications
    public List<JobApplicationResponse> getAllApplications() {
        return repository.findAll()
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    // 🔁 Update status
    public JobApplicationResponse updateStatus(Long appId, String status) {
        JobApplication app = repository.findById(appId)
                .orElseThrow(() -> new RuntimeException("Application not found"));
        app.setStatus(ApplicationStatus.valueOf(status.toUpperCase()));
        repository.save(app);
        return toResponse(app);
    }

    // ❌ Delete application
    public void deleteApplication(Long appId) {
        repository.deleteById(appId);
    }

    // 🧩 Convert entity to response
    private JobApplicationResponse toResponse(JobApplication app) {
        return new JobApplicationResponse(
                app.getId(),
                app.getApplicant().getId().longValue(), // convert Integer to Long
                app.getApplicant().getName(),
                app.getJobTitle(),
                app.getEmployer(),
                app.getStatus().name()
        );
    }
}
