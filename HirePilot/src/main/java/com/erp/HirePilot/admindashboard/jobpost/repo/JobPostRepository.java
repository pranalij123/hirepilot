package com.erp.HirePilot.admindashboard.jobpost.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.erp.HirePilot.admindashboard.jobpost.entity.JobPost;


public interface JobPostRepository extends JpaRepository<JobPost, Long> {
}
