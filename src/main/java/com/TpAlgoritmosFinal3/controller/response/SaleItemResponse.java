package com.TpAlgoritmosFinal3.controller.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaleItemResponse {
	private String product;
	private Integer price;
	private Integer amount;
	private Integer subTotal;
}
