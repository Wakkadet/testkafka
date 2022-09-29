package com.example.testkafka.model;

import lombok.Data;

@Data
public class Payment {

    private String paymentId;
    private String paymentStatus;
    private String email;

}
