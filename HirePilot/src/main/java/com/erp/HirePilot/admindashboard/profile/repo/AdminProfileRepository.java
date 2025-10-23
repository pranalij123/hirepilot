package com.erp.HirePilot.admindashboard.profile.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.HirePilot.admindashboard.profile.entity.AdminProfile;

public interface AdminProfileRepository extends JpaRepository<AdminProfile, Long> {
}
