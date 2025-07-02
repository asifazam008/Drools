package com.drools.Drools.controller;

import com.drools.Drools.service.OrderDiscountService;
import com.drools.Drools.model.OrderDiscount;
import com.drools.Drools.model.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDiscountController {

    @Autowired
    private OrderDiscountService orderDiscountService;

    @PostMapping("/discount")
    public ResponseEntity<OrderDiscount> getDiscount(@RequestBody OrderRequest orderRequest) {
        OrderDiscount discount = orderDiscountService.getDiscount(orderRequest);
        return new ResponseEntity<>(discount, HttpStatus.OK);
    }
}