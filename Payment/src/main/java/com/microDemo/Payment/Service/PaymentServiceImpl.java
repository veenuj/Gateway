package com.microDemo.Payment.Service;

import com.microDemo.Payment.Entity.Payment;
import com.microDemo.Payment.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentServiceImpl {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment doPayment(Payment payment){
        payment.setTransaction_id(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }



}
