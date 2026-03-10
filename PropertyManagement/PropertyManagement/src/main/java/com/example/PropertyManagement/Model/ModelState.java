package com.example.PropertyManagement.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "states")
public class ModelState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StateID;

    @ManyToOne
    @JoinColumn(name = "CountryID")
    private  ModelCountry country;

    @Column(name = "StateName")
    private String StateName;

    public ModelState(Long stateID, ModelCountry country, String stateName) {
        StateID = stateID;
        this.country = country;
        StateName = stateName;
    }

    public ModelState() {

    }

    public Long getStateID() {
        return StateID;
    }

    public void setStateID(Long stateID) {
        StateID = stateID;
    }

    public ModelCountry getCountry() {
        return country;
    }

    public void setCountry(ModelCountry country) {
        this.country = country;
    }

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String stateName) {
        StateName = stateName;
    }
}