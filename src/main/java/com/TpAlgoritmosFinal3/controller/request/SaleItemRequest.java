package com.TpAlgoritmosFinal3.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleItemRequest {
    private String product;
    private Integer price;
    private Integer amount;
    private Integer subtotal;
}

