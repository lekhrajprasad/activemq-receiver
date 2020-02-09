package com.lpras.jmsamq.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Email implements Serializable {
    private static final long serialVersionUID = 4L;
    String to;
    //String from;
    String subject;
    String body;
    String phone;
}
