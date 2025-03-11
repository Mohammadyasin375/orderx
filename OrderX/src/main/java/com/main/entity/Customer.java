package com.main.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "customer")
public class Customer extends AppUser{
	
    private Long customerId;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<OrderDetails> orders;
	
}
