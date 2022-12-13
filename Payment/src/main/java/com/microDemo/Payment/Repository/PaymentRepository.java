package com.microDemo.Payment.Repository;

import com.microDemo.Payment.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
