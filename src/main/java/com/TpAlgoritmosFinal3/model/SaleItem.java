package com.TpAlgoritmosFinal3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SaleItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idItem;
	private String product;
	private Integer price;
	private Integer amount;
	private Integer subtotal;

	@ManyToOne
	@JoinColumn(name = "idSale")
	private Sale sale;
}
