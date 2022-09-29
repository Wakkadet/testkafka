package com.example.testkafka.controller;

import com.example.testkafka.model.Payment;
import com.example.testkafka.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class Controller {

    private final PaymentService paymentService;

    public Controller(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/pay")
    public Payment pay(@RequestBody Payment payment) {
        return paymentService.pay(payment);
    }
}
