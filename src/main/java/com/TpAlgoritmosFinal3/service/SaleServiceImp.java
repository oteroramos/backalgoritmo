package com.TpAlgoritmosFinal3.service;

import com.TpAlgoritmosFinal3.controller.request.SaleRequest;
import com.TpAlgoritmosFinal3.controller.response.SaleResponse;
import com.TpAlgoritmosFinal3.model.Sale;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SaleServiceImp {
	SaleResponse saveSale(SaleRequest saleRequest);
	List<SaleResponse> getAllSales();
}
