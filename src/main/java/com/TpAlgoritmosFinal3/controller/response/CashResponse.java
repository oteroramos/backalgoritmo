package com.TpAlgoritmosFinal3.controller.response;

import com.TpAlgoritmosFinal3.controller.request.CashRequest;
import com.TpAlgoritmosFinal3.model.Cash;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor@NoArgsConstructor
@Builder
public class CashResponse {
    private Integer idCompra;
    private String product;
    private Integer price;
    private Integer amount;
    private Date date;
    private Integer total;

    public static CashResponse fromCash(Cash cash){
        return CashResponse.builder()
                .idCompra(cash.getIdCompra())
                .product(cash.getProduct())
                .price(cash.getPrice())
                .amount(cash.getAmount())
                .date(cash.getDate())
                .total(cash.getTotal())
                .build();
    }
}
