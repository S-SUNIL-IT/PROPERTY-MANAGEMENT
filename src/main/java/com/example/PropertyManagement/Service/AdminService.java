package com.example.PropertyManagement.Service;

import com.example.PropertyManagement.Model.AdminProperty;
import com.example.PropertyManagement.Model.AdminProperty2;
import com.example.PropertyManagement.Model.EmployeeProperty;
import com.example.PropertyManagement.Repository.EmployeeRepository;
import com.example.PropertyManagement.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository Rep;

    @Autowired
    EmployeeRepository ERep;


    public AdminProperty2 Login(String Password, String Email, String FirstName) {
        return Rep.Login(Password,Email,FirstName);
    }


    public void addAdmin(AdminProperty admin) {
        Rep.save(admin);
    }

    public void addEmployee(EmployeeProperty detail) {
        ERep.save(detail);
    }

    public List<AdminProperty> Search(String mobile) {
        return Rep.findByMobile(mobile);
    }

    public AdminProperty get(Long AdminID) {
        return Rep.findById(AdminID).orElse(null);
    }

    public void Delete(Long AdminID) {
        Rep.deleteById(AdminID);
    }
}
