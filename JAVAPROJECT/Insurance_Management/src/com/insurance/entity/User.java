package com.insurance.entity;

public class User {
	
	private int userId;
    private String username;
    private String password;
    private String role;

    public User() {} //constructor

    public User(int userId, String username, String password, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters - setters Method
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    
    //print methods
    public void printUserDetails() {
        System.out.println("User Details: ");
        System.out.println("userId: " + userId);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("role: " + role);
    }
    
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
