package com.microDemo.Payment.Controller;

import com.microDemo.Payment.Entity.Payment;
import com.microDemo.Payment.Service.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentService;
    private Payment payment;



    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment) {

        payment.setPayment_status(paymentProcessing());
        return paymentService.doPayment(payment);

    }
    public String paymentProcessing(){
        return new Random().nextBoolean()?"success":"false";
    }



}
