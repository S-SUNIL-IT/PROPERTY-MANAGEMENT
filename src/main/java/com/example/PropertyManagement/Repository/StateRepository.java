package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.AdminProperty;
import com.example.PropertyManagement.Model.ModelState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StateRepository extends JpaRepository<ModelState,Long> {

    @Query(value = "CALL FindCountry(:ConID)", nativeQuery = true)
    List<ModelState> findByState(@Param("ConID") Long CountryID);

}
