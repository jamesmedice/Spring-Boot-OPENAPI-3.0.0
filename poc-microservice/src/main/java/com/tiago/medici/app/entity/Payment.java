package com.tiago.medici.app.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T_PAYMENT", schema = "BILLING")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "code")
	private String productCode;

	@Column(name = "description")
	private String productDescription;

	private BigInteger quantity;

	@Column(name = "price_item")
	private BigDecimal priceItem;

	@Column(name = "payment_date")
	private Date paymentDate;
}