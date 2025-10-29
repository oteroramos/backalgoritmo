package com.TpAlgoritmosFinal3.controller.response;

import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaleResponse {
	private Integer idSale;
	private Date date;
	private Integer tota;
	private List<SaleItemResponse> item;
}
