package com.TpAlgoritmosFinal3.service;

import com.TpAlgoritmosFinal3.controller.request.ProductRequest;
import com.TpAlgoritmosFinal3.controller.response.ProductResponse;
import com.TpAlgoritmosFinal3.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductServiceImp {
    ProductResponse saveProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProduct();
}
