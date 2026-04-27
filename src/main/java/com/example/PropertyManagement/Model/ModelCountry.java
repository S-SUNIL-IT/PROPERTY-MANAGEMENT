package com.example.PropertyManagement.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "countries")
public class ModelCountry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CountryID;

    @Column(name = "CountryName")
    private String CountryName;

    public Long getCountryID() {
        return CountryID;
    }

    public void setCountryID(Long countryID) {
        CountryID = countryID;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }
}