package com.cms.cms.service;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.cms.entity.CustomerEntity;
import com.cms.cms.exception.CustomerClassNotFoundException;
import com.cms.cms.repositories.CustomerRepository;

@Service("customerService")
public class CustomerService {

     private final CustomerRepository customerRepository;

    //  @Autowired
     public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
     }


    public List<CustomerEntity> getCustomers() {
        
        return customerRepository.findAll();
        
    }


    public CustomerEntity getCustomerById(Long theId) {
        
        return customerRepository.findById(theId)
        .orElseThrow(() -> 
       new CustomerClassNotFoundException("Customer Not foumd") );
    }


    public CustomerEntity addCustomer(CustomerEntity customer) {
         

         return customerRepository.save(customer);
    }


    public void deleteCustomer(Long theId) {
         
          customerRepository.deleteById(theId);
    }

}
