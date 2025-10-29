package com.TpAlgoritmosFinal3.controller;

import com.TpAlgoritmosFinal3.controller.request.ProductRequest;
import com.TpAlgoritmosFinal3.controller.response.ProductResponse;
import com.TpAlgoritmosFinal3.service.ProductServiceImp;
import com.TpAlgoritmosFinal3.service.imp.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private ProductServiceImp productServiceImp;

    @PostMapping("/save")
    public ResponseEntity<ProductResponse> saveProduct(@RequestBody ProductRequest productRequest){
        return ResponseEntity.ok(productServiceImp.saveProduct(productRequest));
    }

    @GetMapping("/")
    public ResponseEntity<List<ProductResponse>> getAllProducts(){
        return ResponseEntity.ok(productServiceImp.getAllProduct());
    }

}
