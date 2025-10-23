package com.erp.HirePilot.CandidateDashboard.jobsearch.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.erp.HirePilot.CandidateDashboard.jobsearch.dto.JobResponse;
import com.erp.HirePilot.CandidateDashboard.jobsearch.dto.JobSearchRequest;
import com.erp.HirePilot.CandidateDashboard.jobsearch.service.JobSearchService;

import java.util.List;

@RestController
@RequestMapping("/candidate")
public class JobSearchController {

    private final JobSearchService jobSearchService;

    public JobSearchController(JobSearchService jobSearchService) {
        this.jobSearchService = jobSearchService;
    }

    @PostMapping("/search")
    public ResponseEntity<List<JobResponse>> searchJobs(@RequestBody JobSearchRequest req) {
        List<JobResponse> response = jobSearchService.searchJobs(req);
        return ResponseEntity.ok(response);
    }
}

