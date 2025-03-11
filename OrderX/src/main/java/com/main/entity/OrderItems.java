/**
 * 
 */
package com.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "order_items")
public class OrderItems {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemsId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderDetails order;

    @ManyToOne
    @JoinColumn(name = "menuItemId")
    private MenuItem menuItem;

    private Integer quantity;
    private Double price;
}
