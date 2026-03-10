package com.example.PropertyManagement.Model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Admin")
public class AdminProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long AdminID;

    @Column(name = "FirstName")
    private String FirstName;

    @Column(name = "LastName")
    private String LastName;


    @Column(name = "Email")
    private String Email;

    @Column(name = "DateOfBirth")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate DateOfBirth;

    @Column(name = "Password")
    private String Password;

    @Column(name = "ConfirmPassword")
    private String ConfirmPassword;

    @Column(name = "Mobile")
    private String Mobile;

    public Long getAdminID() {
        return AdminID;
    }

    public void setAdminID(Long adminID) {
        AdminID = adminID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }
}