package com.TpAlgoritmosFinal3.service;

import com.TpAlgoritmosFinal3.controller.request.CashRequest;
import com.TpAlgoritmosFinal3.controller.response.CashResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CashServiceImp {
    CashResponse saveBuy(CashRequest cashRequest);

    List<CashResponse> listCash();
}
