package com.erp.HirePilot.CandidateDashboard.settings.general.repo;


import com.erp.HirePilot.CandidateDashboard.profile.entity.CandidateProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CandidateProfileRepository extends JpaRepository<CandidateProfile, Long> {
    Optional<CandidateProfile> findByUserId(Long userId);
}
