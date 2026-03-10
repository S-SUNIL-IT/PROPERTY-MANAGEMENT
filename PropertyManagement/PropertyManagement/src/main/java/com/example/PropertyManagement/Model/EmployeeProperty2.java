package com.example.PropertyManagement.Model;

public class EmployeeProperty2 {

    private Long EmployeeID;
    private String FirstName;
    private String Email;

    public EmployeeProperty2(Long employeeID, String firstName, String email) {
        EmployeeID = employeeID;
        FirstName = firstName;
        Email = email;
    }

    public Long getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(Long employeeID) {
        EmployeeID = employeeID;
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
