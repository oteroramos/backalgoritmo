package com.TpAlgoritmosFinal3.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleRequest {
    private Integer idSale;
    private Date date;
    private Integer total;
    private List<SaleItemRequest> saleItemRequestList;
}
