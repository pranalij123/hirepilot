package com.erp.HirePilot.admindashboard.applications;




import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobApplicationResponse {
    private Long id;
    private Integer userId;
    private String applicantName;
    private String jobTitle;
    private String employer;
    private String status;

    public JobApplicationResponse() {}

    public JobApplicationResponse(Long id, Integer userId, String applicantName,
                                  String jobTitle, String employer, String status) {
        this.id = id;
        this.userId = userId;
        this.applicantName = applicantName;
        this.jobTitle = jobTitle;
        this.employer = employer;
        this.status = status;
    }
}
