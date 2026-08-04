package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.Customerlist;
import com.example.PropertyManagement.Model.ModelCustomer;
import com.example.PropertyManagement.Model.Tenantlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<ModelCustomer,Long> {
    @Query(value = "CALL customerlist()", nativeQuery = true)
    List<Customerlist> customerlist();

    @Query(value = "CALL searchCustomer(:Value)", nativeQuery = true)
    List<Customerlist> searchCustomer(@Param("Value") String Value);

    ModelCustomer findByEmail(String email);
}
