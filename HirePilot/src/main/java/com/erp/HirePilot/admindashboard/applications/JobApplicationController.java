package com.erp.HirePilot.admindashboard.applications;





import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/job-applications")
@RequiredArgsConstructor
public class JobApplicationController {

    private final JobApplicationService service;

    @PostMapping("/apply")
    public ResponseEntity<JobApplicationResponse> addJobApplication(
            @RequestBody JobApplicationRequest request
    ) {
        JobApplicationResponse response = service.addApplication(request);
        return ResponseEntity.ok(response);
    }
}
