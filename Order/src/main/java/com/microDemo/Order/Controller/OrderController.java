package com.microDemo.Order.Controller;

import com.microDemo.Order.Common.TransactionRequest;
import com.microDemo.Order.Common.TransactionResponse;

import com.microDemo.Order.Service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderAPI")
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;

    @PostMapping("/placeOrder")
    public TransactionResponse placeOrder(@RequestBody TransactionRequest transactionRequest){
        return orderService.saveOrder(transactionRequest);
    }


}
