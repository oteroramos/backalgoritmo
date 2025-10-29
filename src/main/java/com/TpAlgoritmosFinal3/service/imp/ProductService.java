package com.TpAlgoritmosFinal3.service.imp;

import com.TpAlgoritmosFinal3.controller.request.ProductRequest;
import com.TpAlgoritmosFinal3.controller.response.ProductResponse;
import com.TpAlgoritmosFinal3.model.Product;
import com.TpAlgoritmosFinal3.repository.ProductRepository;
import com.TpAlgoritmosFinal3.service.ProductServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductService implements ProductServiceImp {

    private ProductRepository productRepository;

    @Override
    public ProductResponse saveProduct(ProductRequest productRequest) {
        try {
            Product product = Product.fromProductRequest(productRequest);
            Product productSave = productRepository.save(product);

            return ProductResponse.fromProduct(productSave);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ProductResponse> getAllProduct() {
        List<Product> listProduct = productRepository.findAll();
        try{
            return listProduct.stream()
                    .map(ProductResponse::fromProduct)
                    .toList();
        }catch (Exception e){
            throw new RuntimeException("No se han encontrado productos");
        }
    }


}
