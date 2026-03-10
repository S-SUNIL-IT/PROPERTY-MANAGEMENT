package com.example.PropertyManagement.Model;

public class Searchcustomerproperty {

    private String propertyname;
    private String firstname;
    private String mobile;
    private String propertytypename;
    private String subtypename;
    private String sizename;
    private String purposename;
    private String propertyaddress;
    private String countryname;
    private String statename;

    public Searchcustomerproperty(String propertyname, String firstname, String mobile, String propertytypename, String subtypename, String sizename, String purposename, String propertyaddress, String countryname, String statename) {
        this.propertyname = propertyname;
        this.firstname = firstname;
        this.mobile = mobile;
        this.propertytypename = propertytypename;
        this.subtypename = subtypename;
        this.sizename = sizename;
        this.purposename = purposename;
        this.propertyaddress = propertyaddress;
        this.countryname = countryname;
        this.statename = statename;
    }

    public String getPropertyname() {
        return propertyname;
    }

    public void setPropertyname(String propertyname) {
        this.propertyname = propertyname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPropertytypename() {
        return propertytypename;
    }

    public void setPropertytypename(String propertytypename) {
        this.propertytypename = propertytypename;
    }

    public String getSubtypename() {
        return subtypename;
    }

    public void setSubtypename(String subtypename) {
        this.subtypename = subtypename;
    }

    public String getSizename() {
        return sizename;
    }

    public void setSizename(String sizename) {
        this.sizename = sizename;
    }

    public String getPurposename() {
        return purposename;
    }

    public void setPurposename(String purposename) {
        this.purposename = purposename;
    }

    public String getPropertyaddress() {
        return propertyaddress;
    }

    public void setPropertyaddress(String propertyaddress) {
        this.propertyaddress = propertyaddress;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }
}