package com.TpAlgoritmosFinal3.service.imp;

import com.TpAlgoritmosFinal3.controller.request.SaleRequest;
import com.TpAlgoritmosFinal3.controller.response.SaleItemResponse;
import com.TpAlgoritmosFinal3.controller.response.SaleResponse;
import com.TpAlgoritmosFinal3.model.Sale;
import com.TpAlgoritmosFinal3.model.SaleItem;
import com.TpAlgoritmosFinal3.repository.SaleRepository;
import com.TpAlgoritmosFinal3.service.SaleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService implements SaleServiceImp {

	@Autowired
	SaleRepository saleRepository;

	@Override
	public SaleResponse saveSale(SaleRequest saleRequest) {
		Sale sale = new Sale();
		sale.setDate(saleRequest.getDate());
		sale.setTotal(sale.getTotal());

		List<SaleItem> items = saleRequest.getSaleItemRequestList().stream()
				.map(req -> {
					SaleItem item = new SaleItem();
					item.setProduct(req.getProduct());
					item.setPrice(req.getPrice());
					item.setAmount(req.getAmount());
					item.setSubtotal(req.getSubtotal());
					return item;
				})
				.toList();

		sale.setSaleItemList(items);

		Sale saved = saleRepository.save(sale);

		//Armo la respuesta
		List<SaleItemResponse> itemResponse = saved.getSaleItemList().stream()
				.map(i -> new SaleItemResponse(i.getProduct(),i.getPrice(),i.getAmount(),i.getSubtotal()))
				.toList();

		return new SaleResponse(saved.getIdSale(),saved.getDate(), saved.getTotal(), itemResponse);
	}

	@Override
	public List<SaleResponse> getAllSales() {
		return saleRepository.findAll()
				.stream()
				.map(sale -> new SaleResponse(
						sale.getIdSale(),
						sale.getDate(),
						sale.getTotal(),
						sale.getSaleItemList()
								.stream()
								.map(item -> new SaleItemResponse(
										item.getProduct(),
										item.getPrice(),
										item.getAmount(),
										item.getSubtotal()
								)).toList()
				))
				.toList();
	}

}
