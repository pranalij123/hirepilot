package com.erp.HirePilot.CandidateDashboard.settings.resetpass.dto;

public class ResetPasswordRequest {

    private String currentPassword;
    private String newPassword;
    private String confirmNewPassword;

    // Getters & Setters
    public String getCurrentPassword() {
        return currentPassword;
    }
    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }
    public String getNewPassword() {
        return newPassword;
    }
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    public String getConfirmNewPassword() {
        return confirmNewPassword;
    }
    public void setConfirmNewPassword(String confirmNewPassword) {
        this.confirmNewPassword = confirmNewPassword;
    }
}
