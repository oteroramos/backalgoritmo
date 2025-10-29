package com.TpAlgoritmosFinal3.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CashRequest {
    private Integer idCompra;
    private String product;
    private Integer price;
    private Integer amount;
    private Date date;
    private Integer total;
}
