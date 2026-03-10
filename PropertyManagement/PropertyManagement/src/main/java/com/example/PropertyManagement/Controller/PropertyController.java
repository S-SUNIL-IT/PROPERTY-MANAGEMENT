package com.example.PropertyManagement.Controller;

import com.example.PropertyManagement.Model.AdminProperty;
import com.example.PropertyManagement.Model.AdminProperty2;
import com.example.PropertyManagement.Model.EmployeeProperty;
import com.example.PropertyManagement.Service.AdminService;
import com.example.PropertyManagement.Service.EmployeeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PropertyController {
    @Autowired
    AdminService Service;


    @PostMapping("/Register")
    public String Register(Model model, AdminProperty admin, @RequestParam String Password,@RequestParam String ConfirmPassword) {
        if (Password.equals(ConfirmPassword)) {
            Service.addAdmin(admin);
        }
        return "Admin";
    }

    @GetMapping("/AdminLogin")
    public String Admin() {
        return "AdminLogin";
    }

    @PostMapping("/Admin")
    public String AdminLogin(Model model, @RequestParam String Email, @RequestParam String Password, @RequestParam String FirstName, HttpSession session) {

        AdminProperty2 Get = Service.Login(Password, Email,FirstName);

        if (Get == null) {
            model.addAttribute("Invalid", "Invalid Admin");
            return "AdminLogin";
        }

        else {

            AdminProperty2 Store = (AdminProperty2) session.getAttribute("Session");

            return "Admin";
        }

    }

    @GetMapping("/SignUp")
    public String AdminSignup() {
        return "AdminRegister";
    }


    @GetMapping("/RegisterEmployee")
    public String Register() {
            return "EmployeeRegister";
    }

    @PostMapping("/registersE")
    public String ERegister(EmployeeProperty detail) {
        Service.addEmployee(detail);
        return "Admin";
    }

    @PostMapping("/Search")
    public String Search(Model model,@RequestParam String mobile) {
        List<AdminProperty> information = Service.Search(mobile);

        if (information.isEmpty()) {
           model.addAttribute("Errors","Admin not found");
           return "Admin";
        }
        else {
            model.addAttribute("Text",information);
            return "Admin";
        }

    }

    @GetMapping("/Edit/{AdminID}")
    public String Edit(@PathVariable Long AdminID,Model model) {

        AdminProperty data = Service.get(AdminID);

        if (data != null) {
            model.addAttribute("AdminID",data.getAdminID());
            model.addAttribute("FName", data.getFirstName());
            model.addAttribute("LName", data.getLastName());
            model.addAttribute("Mail", data.getEmail());
            model.addAttribute("DOB", data.getDateOfBirth());
            model.addAttribute("Pass", data.getPassword());
            model.addAttribute("CPass", data.getConfirmPassword());
            model.addAttribute("Mob", data.getMobile());

            return "AdminRegister";
        }
        return "Admin";
    }


    @GetMapping("/Delete/{AdminID}")
    public String Delete(@PathVariable Long AdminID) {
        Service.Delete(AdminID);
        return "Admin";
    }



}
