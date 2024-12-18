package com.example.demo;

public class User {
    private String name;
    private String email;
    private String address;
    private String mobile;

    // Constructor
    public User(String name, String email, String address, String mobile) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.mobile = mobile;
    }

    // Getters and Setters
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    // Override toString method to display user info easily
    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "', address='" + address + "', mobile='" + mobile + "'}";
    }
}
