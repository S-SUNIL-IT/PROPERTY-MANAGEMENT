package com.example.PropertyManagement.Model;

public class AdminProperty2 {

    private Long AdminID;
    private String FirstName;
    private String Email;

    public AdminProperty2(Long adminID, String firstName, String email) {
        AdminID = adminID;
        FirstName = firstName;
        Email = email;
    }

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



    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


}
