package com.TpAlgoritmosFinal3.controller;

import com.TpAlgoritmosFinal3.controller.request.CashRequest;
import com.TpAlgoritmosFinal3.controller.response.CashResponse;
import com.TpAlgoritmosFinal3.service.CashServiceImp;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/cash")
public class CashController {

    private CashServiceImp cashServiceImp;

    @PostMapping("/buy")
    public ResponseEntity<CashResponse> saveCashBuy(@RequestBody CashRequest cashRequest){
        return ResponseEntity.ok(cashServiceImp.saveBuy(cashRequest));
    }

    @GetMapping("/all")
    public ResponseEntity<List<CashResponse>> listCash(){
        return ResponseEntity.ok(cashServiceImp.listCash());
    }
}
