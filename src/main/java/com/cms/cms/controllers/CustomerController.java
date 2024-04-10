package com.cms.cms.controllers;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.cms.entity.CustomerEntity;
import com.cms.cms.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {


 private final CustomerService customerService;
// @Autowired
 public CustomerController(CustomerService customerService){
    this.customerService=customerService;
 }

 @GetMapping
 public ResponseEntity<List<CustomerEntity>> getCustomers(){
    
    List<CustomerEntity> allCustomers = customerService.getCustomers();
    return new ResponseEntity<>(allCustomers,HttpStatus.OK);

 }

 @GetMapping("/{id}")
   public ResponseEntity<CustomerEntity> getCustomerById(@PathVariable("id") Long theId){
        CustomerEntity singleCustomer  = customerService.getCustomerById(theId);
        return new ResponseEntity<>(singleCustomer,HttpStatus.OK);
   }

   // post request
   @PostMapping
   public ResponseEntity<CustomerEntity> addCustomer(@RequestBody CustomerEntity customer){
    CustomerEntity inputCustomer = customerService.addCustomer(customer);
    return new ResponseEntity<>(inputCustomer,HttpStatus.OK);
   }

   // updating the customer
   @PutMapping
   public ResponseEntity<CustomerEntity>  updateCustomer(@RequestBody CustomerEntity customer){
    CustomerEntity modifyCustomer = customerService.addCustomer(customer);
    return new ResponseEntity<>(modifyCustomer,HttpStatus.OK);
   }

   // deleting the customer
 @DeleteMapping("/{id}")
public void deleteCustomer(@PathVariable("id") Long theId){
    customerService.deleteCustomer(theId);
}







}
