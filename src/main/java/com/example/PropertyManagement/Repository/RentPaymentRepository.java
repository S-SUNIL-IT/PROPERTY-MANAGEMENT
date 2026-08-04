package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.EmployeeProperty2;
import com.example.PropertyManagement.Model.ModelRentPayment;
import com.example.PropertyManagement.Model.RentHistoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RentPaymentRepository extends JpaRepository<ModelRentPayment,Long> {

    @Query(value = "call RentHistory(:propertyName,:startMonth,:endMonth);",nativeQuery = true)
    List<ModelRentPayment> searchRentHistory(@Param("propertyName") String propertyName, @Param("startMonth") String startMonth, @Param("endMonth") String endMonth);
}
