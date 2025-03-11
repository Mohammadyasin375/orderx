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
@Table(name = "vendor")
public class Vendor extends AppUser{
	
    private Long vendorId;

    @OneToMany(mappedBy = "vendor", cascade = CascadeType.ALL)
    private List<MenuItem> menuItems;

    @OneToMany(mappedBy = "vendor", cascade = CascadeType.ALL)
    private List<OrderDetails> orders;
    
}
