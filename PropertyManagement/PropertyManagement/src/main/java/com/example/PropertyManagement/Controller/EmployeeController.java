package com.example.PropertyManagement.Controller;

import com.example.PropertyManagement.Model.*;
import com.example.PropertyManagement.Repository.TenantMapProperty;
import com.example.PropertyManagement.Service.EmployeeService;
import jakarta.persistence.Access;
import jakarta.persistence.GeneratedValue;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService EService;

    @GetMapping("/EmployeeLogin")
    public String EmployeeLogin() {
        return "EmployeeLogin";
    }

    @PostMapping("/EmployeeForm")
    public String EmployeeL(Model model, @RequestParam String Password, @RequestParam String Email, @RequestParam String FirstName, HttpSession session) {
        EmployeeProperty2 Employee = EService.Store(Password, Email, FirstName);

        if (Employee == null) {
            model.addAttribute("Error", "Invalid Employee");
            return "EmployeeLogin";
        } else {
            session.setAttribute("LoginEmployee",Employee);
            return "Employee";
        }
    }

    @PostMapping("/Find")
    public String Search(Model model, @RequestParam String mobiles) {
        List<EmployeeProperty> search = EService.SearchMob(mobiles);

        if (search.isEmpty()) {
            model.addAttribute("Error", "Employee not found");
            return "Employee";

        } else {
            model.addAttribute("Data", search);
            return "Employee";
        }


    }

    @GetMapping("/Update/{EmployeeID}")
    public String Edit(Model model, @PathVariable Long EmployeeID) {
        EmployeeProperty data = EService.Edit(EmployeeID);

        if (data != null) {
            model.addAttribute("FirstName", data.getFirstName());
            model.addAttribute("LastName", data.getLastName());
            model.addAttribute("Mail", data.getEmail());
            model.addAttribute("DOB", data.getDateOfBirth());
            model.addAttribute("Mob", data.getMobile());
            model.addAttribute("Password", data.getPassword());
            model.addAttribute("Salary", data.getSalary());

            return "EmployeeRegister";
        }

        return "Employee";
    }

    @GetMapping("/Remove/{EmployeeID}")
    public String Delete(@PathVariable Long EmployeeID) {
        EService.Delete(EmployeeID);
        return "Employee";
    }

    @GetMapping("/CountryPage")
    public String country() {
        return "CountryFom";
    }


    @PostMapping("/country")
    public String Country(ModelCountry value) {
        EService.addCountry(value);
        return "Employee";
    }

    @GetMapping("/StatePage")
    public String state(Model model) {
        List<ModelCountry> Country = EService.findAll();
        model.addAttribute("Countries", Country);
        return "StateForm";
    }

    @PostMapping("/States")
    public String State(ModelState data) {
        EService.addState(data);
        return "Employee";
    }

    @GetMapping("/Customer")
    public String CustomerRegister(Model model,@RequestParam(required = false, defaultValue = "") Long CountryID) {
        model.addAttribute("Countries",EService.findAll());
        return "CustomerRegister";
    }

    @GetMapping("/api/States/{CountryID}")
    @ResponseBody
    public List<ModelState> getStates(@PathVariable Long CountryID) {
        return EService.findS(CountryID);
    }

    @PostMapping("/RegisterCustomer")
    public String Register(ModelCustomer Add,HttpSession session) {
        EmployeeProperty2 emp = (EmployeeProperty2) session.getAttribute("LoginEmployee");
        Add.setCreatedBy(emp.getEmployeeID());
        EService.AddCustomer(Add);
        return "Employee";
    }

    @GetMapping("/PropertyTypes")
    public String propertyType() {
        return "PropertyType";
    }

    @PostMapping("/PropertyTypess")
    public String Add(ModelPropertyType PType,HttpSession session) {
        EmployeeProperty2 emp = (EmployeeProperty2) session.getAttribute("LoginEmployee");
        PType.setCreatedBy(emp.getEmployeeID());
        EService.AddPropertyType(PType);
        return "Employee";
    }
    @GetMapping("/PropertySubTypes")
    public String PSubT (Model model) {
        List<ModelPropertyType> PType = EService.getAll();
        model.addAttribute("properties",PType);
        return "PropertySubType";
    }

    @PostMapping("/subtypes")
    public String subtype(ModelPropertySubType Subtype,HttpSession session) {
        EmployeeProperty2 emp = (EmployeeProperty2) session.getAttribute("LoginEmployee");
        Subtype.setCreatedBy(emp.getEmployeeID());
        EService.AddPropertySubType(Subtype);
        return "Employee";
    }

    @GetMapping("/PropertySizes")
    public String show(Model model) {
        List<ModelPropertySubType> Size = EService.ShowAll();
        model.addAttribute("PropertyST",Size);
        return "PropertySize";
    }

    @PostMapping("/PSize")
    public String Size(ModelPropertySize size,HttpSession session) {
        EmployeeProperty2 emp = (EmployeeProperty2)  session.getAttribute("LoginEmployee");
        size.setCreatedBy(emp.getEmployeeID());
        EService.AddPropertySize(size);
        return "Employee";
    }

    @GetMapping("/PropertyPurposes")
    public String Purpose() {
        return "PropertyPurpose";
    }

    @PostMapping("/PPurpose")
    public String SSave (ModelPropertyPurpose Purpose,HttpSession session) {
        EmployeeProperty2 emp = (EmployeeProperty2) session.getAttribute("LoginEmployee");
        Purpose.setCreatedBy(emp.getEmployeeID());
        EService.AddPropertyPurpose(Purpose);
        return "Employee";
    }

    @GetMapping("/MainEmployee")
    public String ShowEmployee() {
        return "Employee";
    }

    @GetMapping("/Property")
    public String RegisterProperty(Model model) {
        List<ModelCustomer> Customer = EService.AllCustomer();
        List<ModelPropertyType> PType = EService.PTAll();
        List<ModelPropertyPurpose> Purpose = EService.PurposeAll();
        List<ModelCountry> AllCountries = EService.findAll();

        model.addAttribute("customers",Customer);
        model.addAttribute("types",PType);
        model.addAttribute("purposes",Purpose);
        model.addAttribute("Countries",AllCountries);
        return "Property";
    }

    @GetMapping("/api/PSubT/{PropertyTypeID}")
    @ResponseBody
    public List<ModelPropertySubType> getSub(@PathVariable Long PropertyTypeID) {
        return EService.getPropertySubT(PropertyTypeID);
    }

    @GetMapping("/api/PropertySize/{PropertySubTypeID}")
    @ResponseBody
    public List<ModelPropertySize> getSizes(@PathVariable Long PropertySubTypeID) {
        return EService.getAllPropertySizes(PropertySubTypeID);
    }

    @GetMapping("/api/PStates/{CountryID}")
    @ResponseBody
    public List<ModelState> StateAll(@PathVariable Long CountryID) {
        return EService.findS(CountryID);

    }

    @PostMapping("/saveProperty")
    public String RegisterProperty(ModelProperty Property,HttpSession session) {
        EmployeeProperty2 emp = (EmployeeProperty2) session.getAttribute("LoginEmployee");
        Property.setCreatedBy(emp.getEmployeeID());
        EService.AddProperty(Property);
        return "Employee";
    }

 @GetMapping("/ajaxSearchCustomer")
    @ResponseBody
    public List<Searchcustomerproperty> searchC (@RequestParam String firstname) {
        return EService.findProperty(firstname);
 }

 @GetMapping("/Tenant")
    public String tenants(Model model) {
        List<ModelCountry> country = EService.findAll();
        model.addAttribute("Countries",country);
        return "TenantRegister";
 }

 @PostMapping("/RegisterTenant")
    public String TenantRegister(ModelTenant tenant,HttpSession session) {
        EmployeeProperty2 emp = (EmployeeProperty2) session.getAttribute("LoginEmployee");
        tenant.setCreatedBy(emp.getEmployeeID());
        EService.AddTenant(tenant);
        return "Employee";
 }

 @GetMapping("/All")
    public String getp(Model model) {
        model.addAttribute("get",EService.getallp());
        model.addAttribute("Tenants",EService.gettenant());
        return "Employee";
 }


}


