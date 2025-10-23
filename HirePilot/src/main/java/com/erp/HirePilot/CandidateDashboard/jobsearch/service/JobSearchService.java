package com.erp.HirePilot.CandidateDashboard.jobsearch.service;


import org.springframework.stereotype.Service;

import com.erp.HirePilot.CandidateDashboard.jobsearch.dto.JobResponse;
import com.erp.HirePilot.CandidateDashboard.jobsearch.dto.JobSearchRequest;
import com.erp.HirePilot.CandidateDashboard.jobsearch.repo.JobSearchtRepository;
import com.erp.HirePilot.admindashboard.jobpost.entity.JobPost;
import com.erp.HirePilot.admindashboard.jobpost.repo.JobPostRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobSearchService {

    private final JobSearchtRepository jobPostRepository;

    public JobSearchService(JobSearchtRepository jobPostRepository) {
        this.jobPostRepository = jobPostRepository;
    }

    public List<JobResponse> searchJobs(JobSearchRequest req) {
        List<JobPost> jobs = jobPostRepository.searchJobs(req.getLanguage(), req.getLocation());
        return jobs.stream()
                .map(job -> new JobResponse(
                        job.getJobTitle(),
                        job.getDescription(),
                        job.getJobLocation(),
                        job.getEligibilityCriteria(),
                        job.getPackageOffered()
                ))
                .collect(Collectors.toList());
    }
}

