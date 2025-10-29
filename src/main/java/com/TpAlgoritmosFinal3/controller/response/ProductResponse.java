package com.TpAlgoritmosFinal3.controller.response;

import com.TpAlgoritmosFinal3.model.Product;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {
    private String name;
    private Integer price;
    private String img;
    private Integer stock;

    public static ProductResponse fromProduct (Product product){
        return ProductResponse.builder()
                .name(product.getName())
                .price(product.getPrice())
                .img(product.getImg())
                .stock(product.getStock())
                .build();
    }
}
