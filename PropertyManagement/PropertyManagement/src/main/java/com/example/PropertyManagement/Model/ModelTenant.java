package com.example.PropertyManagement.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Tenant")
public class ModelTenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TenantID;

    private String firstname;
    private String lastname;
    private String email;
    private String date0fbirth;
    private String mobile;
    private String alternativemobile;
    private String address;
    private String address2;
    private String maritalstatus;
    private String worktype;
    private String workaddress;
    private String income;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CountryID")
    private ModelCountry country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StateID")
    private ModelState state;

    private Long CreatedBy;

    public Long getTenantID() {
        return TenantID;
    }

    public void setTenantID(Long tenantID) {
        TenantID = tenantID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate0fbirth() {
        return date0fbirth;
    }

    public void setDate0fbirth(String date0fbirth) {
        this.date0fbirth = date0fbirth;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAlternativemobile() {
        return alternativemobile;
    }

    public void setAlternativemobile(String alternativemobile) {
        this.alternativemobile = alternativemobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype;
    }

    public String getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(String workaddress) {
        this.workaddress = workaddress;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
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