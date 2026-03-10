package com.example.PropertyManagement.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class ModelCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CustomerID;

    private String FirstName;
    private String LastName;
    private String Email;
    private String DateOfBirth;
    private String Mobile;
    private String AlternativeMobile;
    private String Address;
    private String Address2;
    private String MaritalStatus;
    private String WorkType;
    private String WorkAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CountryID")
    private ModelCountry country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StateID")
    private ModelState state;

    private  Long CreatedBy;

    public Long getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Long customerID) {
        CustomerID = customerID;
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

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getAlternativeMobile() {
        return AlternativeMobile;
    }

    public void setAlternativeMobile(String alternativeMobile) {
        AlternativeMobile = alternativeMobile;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String address2) {
        Address2 = address2;
    }

    public String getMaritalStatus() {
        return MaritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        MaritalStatus = maritalStatus;
    }

    public String getWorkType() {
        return WorkType;
    }

    public void setWorkType(String workType) {
        WorkType = workType;
    }

    public String getWorkAddress() {
        return WorkAddress;
    }

    public void setWorkAddress(String workAddress) {
        WorkAddress = workAddress;
    }

    public ModelCountry getCountry() {
        return country;
    }

    public void setCountry(ModelCountry country) {
        this.country = country;
    }

    public ModelState getState() {
        return state;
    }

    public void setState(ModelState state) {
        this.state = state;
    }

    public Long getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Long createdBy) {
        CreatedBy = createdBy;
    }
}
