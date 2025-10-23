package com.erp.HirePilot.admindashboard.applications;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

import com.erp.HirePilot.entity.User;

@Entity
@Table(name = "job_applications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Link to existing user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User applicant;

    private String jobTitle;
    private String employer;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status = ApplicationStatus.APPLIED;

    private LocalDateTime appliedAt = LocalDateTime.now();
}
