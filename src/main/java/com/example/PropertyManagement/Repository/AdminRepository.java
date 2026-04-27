package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.AdminProperty;
import com.example.PropertyManagement.Model.AdminProperty2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdminRepository extends JpaRepository<AdminProperty,Long> {

    @Query(value = "call AdminLogin(:Passwords,:Emails,:FName);",nativeQuery = true)
    AdminProperty2 Login(@Param("Passwords") String Password, @Param("Emails") String Email, @Param("FName") String FirstName);

    @Query(value = "CALL searchMobile(:Mobiles)", nativeQuery = true)
    List<AdminProperty> findByMobile(@Param("Mobiles") String mobile);


}




