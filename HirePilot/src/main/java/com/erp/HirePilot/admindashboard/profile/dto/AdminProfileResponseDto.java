package com.erp.HirePilot.admindashboard.profile.dto;

import java.time.LocalDate;

public class AdminProfileResponseDto {
    private String name;
    private String email;
    private String adminRole;
    private LocalDate joiningDate;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAdminRole() {
        return adminRole;
    }
    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }
    public LocalDate getJoiningDate() {
        return joiningDate;
    }
    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }
}
