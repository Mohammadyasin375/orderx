/**
 * 
 */
package com.main.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "payments")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long paymentId;

	private String paymentMethod;
	private Double amount;
	private String status;

	@OneToOne
	@JoinColumn(name = "order_id")
	private OrderDetails order;

	@OneToOne(mappedBy = "payment", cascade = CascadeType.ALL)
	private Transaction transaction;

}
