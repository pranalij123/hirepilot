package com.erp.HirePilot.admindashboard.applications;






import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobApplicationRequest {
    private String jobTitle;
    private String employer;
    private String status;     // Optional, default = APPLIED
}
