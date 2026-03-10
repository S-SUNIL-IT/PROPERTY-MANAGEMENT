package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.ModelCountry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<ModelCountry,Long> {

}
