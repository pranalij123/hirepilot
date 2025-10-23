package com.erp.HirePilot.admindashboard.applications;




import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobApplicationResponse {
    private Long id;
    private String jobTitle;
    private String companyName;
    private String message;
}
