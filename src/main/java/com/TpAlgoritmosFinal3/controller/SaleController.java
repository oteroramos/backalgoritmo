package com.TpAlgoritmosFinal3.controller;

import com.TpAlgoritmosFinal3.controller.request.SaleRequest;
import com.TpAlgoritmosFinal3.controller.response.SaleResponse;
import com.TpAlgoritmosFinal3.model.Sale;
import com.TpAlgoritmosFinal3.service.SaleServiceImp;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sale")
public class SaleController {

	@Autowired
	SaleServiceImp saleServiceImp;

	@PostMapping("/save")
	public ResponseEntity<SaleResponse> saveSale(@Validated @RequestBody SaleRequest saleRequest){
		return ResponseEntity.ok(saleServiceImp.saveSale(saleRequest));
	}

	@GetMapping("/all")
	public ResponseEntity<List<SaleResponse>> getAllSales(){
		return ResponseEntity.ok(saleServiceImp.getAllSales());
	}
}
