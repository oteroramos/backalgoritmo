package com.TpAlgoritmosFinal3.model;

import com.TpAlgoritmosFinal3.controller.request.CashRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@Builder
@Entity
public class Cash {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @JsonProperty("idcompra")
    private Integer idCompra;

    private String product;
    private Integer price;
    private Integer amount;
    private Date date;
    private Integer total;

    public static Cash fromCashRequest(CashRequest cashRequest){
        return Cash.builder()
                .idCompra(cashRequest.getIdCompra())
                .product(cashRequest.getProduct())
                .price(cashRequest.getPrice())
                .amount(cashRequest.getAmount())
                .date(cashRequest.getDate())
                .total(cashRequest.getTotal())
                .build();
    }
}
