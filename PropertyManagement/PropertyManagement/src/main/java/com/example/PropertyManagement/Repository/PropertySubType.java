package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.ModelPropertySubType;
import com.example.PropertyManagement.Model.ModelState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PropertySubType extends JpaRepository<ModelPropertySubType,Long> {

    @Query(value = "CALL FindPSubType(:PTypeID)", nativeQuery = true)
    List<ModelPropertySubType> findByPropertyID(@Param("PTypeID") Long PropertyTypeID);
}
