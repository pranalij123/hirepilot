package com.erp.HirePilot.dto;

public class ResetPasswordDto {
    private String email;
    private String newPassword;
    
    // Getters & Setters
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNewPassword() {
        return newPassword;
    }
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
