package com.example.testkafka.service;


import com.example.testkafka.even.Notification;
import com.example.testkafka.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final Notification notificationSource;

    public PaymentService(Notification notificationSource) {
        this.notificationSource = notificationSource;
    }

    public Payment pay(Payment payment) {
        notificationSource.publishPaymentSuccess(payment.getEmail(), "payment success message");
        payment.setPaymentStatus("success");
        return payment;
    }
}
