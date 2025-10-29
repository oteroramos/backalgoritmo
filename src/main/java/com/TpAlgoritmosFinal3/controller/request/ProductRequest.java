package com.TpAlgoritmosFinal3.controller.request;

import lombok.Data;

@Data
public class ProductRequest {
    private Integer id;
    private String name;
    private Integer price;
    private String img;
    private Integer stock;
}
