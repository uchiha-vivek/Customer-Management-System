package com.cms.cms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cms.cms.entity.CustomerEntity;

@Repository
public interface CustomerRepository  extends JpaRepository<CustomerEntity,Long>  {





}
