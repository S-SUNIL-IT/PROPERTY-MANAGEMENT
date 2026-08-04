package com.example.PropertyManagement.Service;

import com.example.PropertyManagement.Model.*;
import com.example.PropertyManagement.Repository.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired RentPaymentRepository rentpayrep;

    @Autowired RentFollowUpRepository RentFUp;



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

    public String AddCustomer(ModelCustomer add){

        if(CusRep.findByEmail(add.getEmail()) != null){
            return "Email already exists";
        }

        CusRep.save(add);
        return "Customer Registered Successfully";
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

    public String AddTenant(ModelTenant add){

        if(TenantRep.findByEmail(add.getEmail()) != null){
            return "Email already exists";
        }

        TenantRep.save(add);
        return "Tenant Registered Successfully";
    }

    public List<ModelProperty> getallp() {
        return PropertyRep.findAll();
    }

    public List<ModelTenant> gettenant() {
        return TenantRep.findAll();
    }

    public boolean savetenantproperty(Long TenantID,Long PropertyID,Long CreatedBy,Double rentAmount) {

        ModelTenant tenant = TenantRep.findById(TenantID).orElse(null);
        ModelProperty property = PropertyRep.findById(PropertyID).orElse(null);


        if (TenantPrep.existsByPropertyAndDeletedFalse(property)) {
            return false;
        }

        ModelTenantMapProperty Map = new ModelTenantMapProperty();

        Map.setTenant(tenant);
        Map.setProperty(property);
        Map.setRentAmount(rentAmount);
        Map.setStartDate(LocalDate.now());
        Map.setCreatedBy(CreatedBy);
        Map.setStatus("Active");
        Map.setDeleted(false);
        TenantPrep.save(Map);

        return true;

    }

    public List<TenantTreeView> tenantlist() {

        List<Tenantlist> rows = TenantRep.tenantlist();

        Map<Long, TenantTreeView> map = new LinkedHashMap<>();

        for (Tenantlist row : rows) {

            TenantTreeView tenant =
                    map.computeIfAbsent(row.getTenantId(), k -> {

                        TenantTreeView t = new TenantTreeView();
                        t.setTenantId(row.getTenantId());
                        t.setFirstName(row.getFirstName());
                        t.setEmail(row.getEmail());
                        t.setMobile(row.getMobile());
                        t.setAddress(row.getAddress());
                        t.setStateName(row.getStateName());
                        t.setCountryName(row.getCountryName());

                        return t;
                    });

            PropertyNode property = new PropertyNode();
            property.setPropertyName(row.getPropertyName());
            property.setPropertyAddress(row.getPropertyAddress());

            tenant.getProperties().add(property);
        }

        return new ArrayList<>(map.values());
    }

    public List<CustomerTreeView> customerlist() {

        List<Customerlist> rows = CusRep.customerlist();

        Map<Long, CustomerTreeView> map = new LinkedHashMap<>();

        for (Customerlist row : rows) {

            CustomerTreeView customer =
                    map.computeIfAbsent(row.getCustomerId(), k -> {

                        CustomerTreeView c = new CustomerTreeView();
                        c.setCustomerId(row.getCustomerId());
                        c.setFirstName(row.getFirstName());
                        c.setEmail(row.getEmail());
                        c.setMobile(row.getMobile());
                        c.setAddress(row.getAddress());
                        c.setStateName(row.getStateName());
                        c.setCountryName(row.getCountryName());

                        return c;
                    });

            PropertyNode property = new PropertyNode();
            property.setPropertyName(row.getPropertyName());
            property.setPropertyAddress(row.getPropertyAddress());

            customer.getProperties().add(property);
        }

        return new ArrayList<>(map.values());
    }

    public List<TenantTreeView> searchTenant(String keyword) {

        List<Tenantlist> rows = TenantRep.searchTenant(keyword);

        Map<Long, TenantTreeView> map = new LinkedHashMap<>();

        for (Tenantlist row : rows) {

            TenantTreeView tenant =
                    map.computeIfAbsent(row.getTenantId(), k -> {

                        TenantTreeView t = new TenantTreeView();
                        t.setTenantId(row.getTenantId());
                        t.setFirstName(row.getFirstName());
                        t.setEmail(row.getEmail());
                        t.setMobile(row.getMobile());
                        t.setAddress(row.getAddress());
                        t.setStateName(row.getStateName());
                        t.setCountryName(row.getCountryName());

                        return t;
                    });

            PropertyNode property = new PropertyNode();
            property.setPropertyId(row.getPropertyId());
            property.setPropertyName(row.getPropertyName());
            property.setPropertyAddress(row.getPropertyAddress());

            tenant.getProperties().add(property);
        }

        return new ArrayList<>(map.values());
    }

    public List<CustomerTreeView> SearchCustomer(String Value) {

        List<Customerlist> rows = CusRep.searchCustomer(Value);

        Map<Long, CustomerTreeView> map = new LinkedHashMap<>();

        for (Customerlist row : rows) {

            CustomerTreeView customer =
                    map.computeIfAbsent(row.getCustomerId(), k -> {

                        CustomerTreeView c = new CustomerTreeView();
                        c.setCustomerId(row.getCustomerId());
                        c.setFirstName(row.getFirstName());
                        c.setEmail(row.getEmail());
                        c.setMobile(row.getMobile());
                        c.setAddress(row.getAddress());
                        c.setStateName(row.getStateName());
                        c.setCountryName(row.getCountryName());

                        return c;
                    });

            if(row.getPropertyName() != null){

                PropertyNode property = new PropertyNode();
                property.setPropertyName(row.getPropertyName());
                property.setPropertyAddress(row.getPropertyAddress());


                customer.getProperties().add(property);
            }
        }

        return new ArrayList<>(map.values());
    }

    @Transactional
    public void releaseProperty(Long propertyId){

        ModelTenantMapProperty map =
                TenantPrep.findByProperty_propertyIdAndDeletedFalse(propertyId);

        if(map != null){
            map.setDeleted(true);
            map.setStatus("Release");
            map.setEndDate(LocalDate.now());

            TenantPrep.save(map);
        }
    }

    public void collectrent(Long  tenantmapID,String month,Double rentAmount,String paymentMode,String paymentReference) {

        ModelTenantMapProperty map = TenantPrep.findById(tenantmapID).orElse(null);

        if(map == null) {

            return;
        }

        ModelRentPayment rent = new ModelRentPayment();

        rent.setTenantMap(map);
        rent.setMonth(month);
        rent.setAmount(rentAmount);
        rent.setPaidDate(LocalDate.now());
        rent.setPaymentMode(paymentMode);
        rent.setPaymentReference(paymentReference);
        rent.setStatus("PAID");

        rentpayrep.save(rent);

    }

    public List<ModelTenantMapProperty> getalltenant() {
        return TenantPrep.findAll();
    }

    @Value("${razorpay.key.id}")
    private String keyId;

    @Value("${razorpay.key.secret}")
    private String keySecret;

    public String createOrder(Double amount) throws Exception {

        RazorpayClient client =
                new RazorpayClient(keyId,keySecret);

        JSONObject orderRequest =
                new JSONObject();

        orderRequest.put("amount",
                amount * 100);

        orderRequest.put("currency",
                "INR");

        orderRequest.put("receipt",
                "receipt_1");

        Order order =
                client.orders.create(orderRequest);

        return order.toString();
    }


    public List<ModelRentPayment> getRentHistory(String propertyName,
                                                    String startMonth,
                                                    String endMonth) {

        if ((propertyName == null || propertyName.isBlank()) &&
                (startMonth == null || startMonth.isBlank()) &&
                (endMonth == null || endMonth.isBlank())) {

            return rentpayrep.findAll();
        }

        return rentpayrep.searchRentHistory(propertyName,
                startMonth,
                endMonth);
    }

    public List<RentFollowUpDTO> getRentFollowUp() {

        return RentFUp.getRentFollowUp();

    }
}
