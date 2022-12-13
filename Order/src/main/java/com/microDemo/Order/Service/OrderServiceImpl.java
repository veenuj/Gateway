package com.microDemo.Order.Service;

import com.microDemo.Order.Common.Payment;
import com.microDemo.Order.Common.TransactionRequest;
import com.microDemo.Order.Common.TransactionResponse;
import com.microDemo.Order.Entity.Order;
import com.microDemo.Order.Repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class OrderServiceImpl {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private RestTemplate restTemplate;

    public TransactionResponse saveOrder(TransactionRequest transactionRequest){
        String response= "";
        Order order = transactionRequest.getOrder();
        Payment payment = transactionRequest.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());

        Payment paymentResponse = restTemplate.postForObject("http://PAYMENT/payment/doPayment",payment,Payment.class);
        response= paymentResponse.getPayment_status().equals("success")?"Payment done and order done ":"process failed ";
        orderRepository.save(order);

        return new TransactionResponse(order,paymentResponse.getTransaction_id(),paymentResponse.getAmount(),response);

    }



}
