package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.AdminProperty2;
import com.example.PropertyManagement.Model.EmployeeProperty;
import com.example.PropertyManagement.Model.EmployeeProperty2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeProperty,Long> {
    @Query(value = "call ELogin(:Passwords,:Emails,:FName);",nativeQuery = true)
    EmployeeProperty2 ELogin(@Param("Passwords") String Password, @Param("Emails") String Email, @Param("FName") String FirstName);

    @Query(value = "call FindMobile(:Mobiles);",nativeQuery = true)
    List<EmployeeProperty> FindByMobile(@Param("Mobiles") String mobiles);
}
