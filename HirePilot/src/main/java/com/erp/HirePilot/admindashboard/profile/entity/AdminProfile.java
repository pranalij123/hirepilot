package com.erp.HirePilot.admindashboard.profile.entity;


import jakarta.persistence.*;
import java.time.LocalDate;
import com.erp.HirePilot.entity.User;

@Entity
@Table(name = "admin_profile")
public class AdminProfile {

    @Id
    private Integer id;;  // Same as User Table ID

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    private String adminRole;
    private LocalDate joiningDate;

   
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
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
