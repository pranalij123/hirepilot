package com.erp.HirePilot.dto;

public class AuthResponseDto {
	private String name;
    private String email;
    private String role;
    private String token;

    public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}

	

	public AuthResponseDto(String name, String email, String role,String token) {
        this.token = token;
        this.role = role;
        this.name=name;
        this.email=email;
    }

    // Getters and Setters
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
