package com.erp.HirePilot.CandidateDashboard.jobsearch.dto;


public class JobResponse {
    private String jobTitle;
    private String description;
    private String jobLocation;
    private String eligibilityCriteria;
    private String packageDetails;

    // Constructor
    public JobResponse(String jobTitle, String description, String jobLocation, String eligibilityCriteria, String packageDetails) {
        this.jobTitle = jobTitle;
        this.description = description;
        this.jobLocation = jobLocation;
        this.eligibilityCriteria = eligibilityCriteria;
        this.packageDetails = packageDetails;
    }

    // Getters & Setters
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }

    public void setEligibilityCriteria(String eligibilityCriteria) {
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public String getPackageDetails() {
        return packageDetails;
    }

    public void setPackageDetails(String packageDetails) {
        this.packageDetails = packageDetails;
    }
}
