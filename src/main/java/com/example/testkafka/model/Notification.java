package com.example.testkafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notification {

    private String email;
    private String message;
}
