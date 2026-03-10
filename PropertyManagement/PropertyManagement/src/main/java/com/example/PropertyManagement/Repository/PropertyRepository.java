package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.EmployeeProperty;
import com.example.PropertyManagement.Model.ModelProperty;
import com.example.PropertyManagement.Model.Searchcustomerproperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PropertyRepository extends JpaRepository<ModelProperty,Long> {

    @Query(value = "call FindCustomerProperty(:firstname);",nativeQuery = true)
    List<Searchcustomerproperty> FindByCProperty(@Param("firstname") String firstname);
}
