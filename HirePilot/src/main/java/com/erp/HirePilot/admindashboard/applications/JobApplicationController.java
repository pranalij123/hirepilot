package com.erp.HirePilot.admindashboard.applications;




import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/application")
@RequiredArgsConstructor
public class JobApplicationController {

    private final JobApplicationService service;

    // ✅ Add new application with userId from header
    @PostMapping("/add")
    public ResponseEntity<JobApplicationResponse> addApplication(
            @RequestBody JobApplicationRequest req,
            @RequestHeader("X-User-Id") long userId) {
        return ResponseEntity.ok(service.addApplication(req, userId));
    }

    // ✅ Get all applications
    @GetMapping
    public ResponseEntity<List<JobApplicationResponse>> getAllApplications() {
        return ResponseEntity.ok(service.getAllApplications());
    }

    // ✅ Update application status (Applied / Shortlisted / Hired / Rejected)
    @PutMapping("/status/{appId}")
    public ResponseEntity<JobApplicationResponse> updateStatus(
            @PathVariable Long appId,
            @RequestParam String status) {
        return ResponseEntity.ok(service.updateStatus(appId, status));
    }

    // ✅ Delete application
    @DeleteMapping("/delete/{appId}")
    public ResponseEntity<Void> deleteApplication(@PathVariable Long appId) {
        service.deleteApplication(appId);
        return ResponseEntity.noContent().build();
    }
}
