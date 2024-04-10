package com.cms.cms.entity;

import java.io.Serializable;

import org.hibernate.annotations.NaturalId;

 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="customers")
public class CustomerEntity  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String secondName;
    @NaturalId
    private String email;

    private String city;
    @NaturalId
    private String avatarName;



}
