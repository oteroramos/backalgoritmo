package com.TpAlgoritmosFinal3.service.imp;

import com.TpAlgoritmosFinal3.controller.request.CashRequest;
import com.TpAlgoritmosFinal3.controller.response.CashResponse;
import com.TpAlgoritmosFinal3.model.Cash;
import com.TpAlgoritmosFinal3.repository.CashRepository;
import com.TpAlgoritmosFinal3.service.CashServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CashService implements CashServiceImp {
    private CashRepository cashRepository;

    public CashResponse saveBuy(CashRequest cashRequest){
        try{
        Cash cash = Cash.fromCashRequest(cashRequest);
        Cash cashSave = cashRepository.save(cash);
            System.out.println("repuesta del Request: " + cashRequest );

        return CashResponse.fromCash(cashSave);
        }catch ( Exception e){
            throw new RuntimeException("No se pudo guardar la compra");
        }
    }

    @Override
    public List<CashResponse> listCash() {
        try {
            List<Cash> cash = cashRepository.findAll() ;

            return cash.stream().map(CashResponse::fromCash).toList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
