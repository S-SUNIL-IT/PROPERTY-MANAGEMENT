package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.ModelCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<ModelCustomer,Long> {

}
