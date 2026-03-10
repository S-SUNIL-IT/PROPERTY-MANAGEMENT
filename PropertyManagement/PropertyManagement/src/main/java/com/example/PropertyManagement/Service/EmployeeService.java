package com.example.PropertyManagement.Service;

import com.example.PropertyManagement.Model.*;
import com.example.PropertyManagement.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired EmployeeRepository ERep;

    @Autowired CountryRepository CRep;

    @Autowired StateRepository SRep;

    @Autowired CustomerRepository CusRep;

    @Autowired PropertyType PropertyTypeRep;

    @Autowired PropertySubType PropertySubTypeRep;

    @Autowired PropertySizeRepository PropertySizeRep;

    @Autowired PropertyPurposeRepository PropertyPurposeRep;

    @Autowired PropertyRepository PropertyRep;

    @Autowired TenantRepository TenantRep;

    @Autowired TenantMapProperty TenantPrep;



    public EmployeeProperty2 Store(String Password,String Email,String FirstName) {
        return ERep.ELogin(Password, Email, FirstName);
    }

    public EmployeeProperty Edit(Long EmployeeID) {
        return ERep.findById(EmployeeID).orElse(null);
    }

    public List<EmployeeProperty> SearchMob(String mobiles) {
        return ERep.FindByMobile(mobiles);
    }

    public void Delete(Long EmployeeID) {
        ERep.deleteById(EmployeeID);
    }

    public void addCountry(ModelCountry country) {
        CRep.save(country);
    }

    public List<ModelCountry> findAll() {
        return CRep.findAll();
    }

    public void addState(ModelState state) {
        SRep.save(state);
    }

    public List<ModelState> findS(Long CountryID) {
        return SRep.findByState(CountryID);
    }

   public void AddCustomer(ModelCustomer Add) {
        CusRep.save(Add);
    }

    public void AddPropertyType(ModelPropertyType PType) {
        PropertyTypeRep.save(PType);

    }

    public List<ModelPropertyType> getAll() {
        return PropertyTypeRep.findAll();
    }

    public void AddPropertySubType(ModelPropertySubType Subtype) {
        PropertySubTypeRep.save(Subtype);
    }

    public List<ModelPropertySubType> ShowAll() {
        return PropertySubTypeRep.findAll();
    }

    public void AddPropertySize(ModelPropertySize size) {
        PropertySizeRep.save(size);
    }

    public void AddPropertyPurpose(ModelPropertyPurpose PData) {
        PropertyPurposeRep.save(PData);
    }

    public List<ModelCustomer> AllCustomer() {
        return CusRep.findAll();
    }

    public List<ModelPropertyType> PTAll() {
        return PropertyTypeRep.findAll();
    }

    public List<ModelPropertyPurpose> PurposeAll() {
        return PropertyPurposeRep.findAll();
    }

    public List<ModelPropertySubType> getPropertySubT(Long PropertyTypeID) {
        return PropertySubTypeRep.findByPropertyID(PropertyTypeID);
    }

    public List<ModelPropertySize> getAllPropertySizes(Long PropertySubTypeID) {
        return PropertySizeRep.findByPropertySubTypeID(PropertySubTypeID);
    }

    public void AddProperty(ModelProperty Property) {
        PropertyRep.save(Property);
    }

    public List<Searchcustomerproperty> findProperty(String firstname) {
        return PropertyRep.FindByCProperty(firstname);
    }

    public void AddTenant(ModelTenant tenant) {
        TenantRep.save(tenant);
    }

    public List<ModelProperty> getallp() {
        return PropertyRep.findAll();
    }

    public List<ModelTenant> gettenant() {
        return TenantRep.findAll();
    }

    public void AddTenantProperty(ModelTenantMapProperty TenantPData) {
        TenantPrep.save(TenantPData);
    }



}
