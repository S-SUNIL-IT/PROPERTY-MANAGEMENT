package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.ModelTenantMapProperty;
import com.example.PropertyManagement.Model.RentFollowUpDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RentFollowUpRepository extends JpaRepository<ModelTenantMapProperty,Long> {

    @Query(value = "CALL RentFollowUp(:propertyName)", nativeQuery = true)
    List<RentFollowUpDTO> rentFollowUp(@Param("propertyName") String propertyName);

}
