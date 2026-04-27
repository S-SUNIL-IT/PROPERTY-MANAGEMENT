package com.example.PropertyManagement.Model;

import jakarta.persistence.*;

import java.text.DateFormat;
import java.util.Date;

@Entity
@Table(name = "PropertyAgreement")
public class PropertyAgreement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PropertyAgreementID;

    private Long PropertyID;
    private Long CustomerID;
    private Date StartDate;
    private Date EndDate;
    private String Status;
    private Long CreatedBy;

}
