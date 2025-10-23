package com.erp.HirePilot.admindashboard.applications;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobApplicationService {

    private final JobApplicationRepository repository;

    public JobApplicationResponse addApplication(JobApplicationRequest req) {
        JobApplication job = JobApplication.builder()
                .jobTitle(req.getJobTitle())
                .companyName(req.getCompanyName())
                .build();

        JobApplication saved = repository.save(job);

        return new JobApplicationResponse(
                saved.getId(),
                saved.getJobTitle(),
                saved.getCompanyName(),
                "Job application saved successfully"
        );
    }
}
