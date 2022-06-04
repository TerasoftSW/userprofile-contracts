package com.terasoft.userprofile.contracts.events;

import lombok.Value;

import java.math.BigDecimal;
import java.time.Instant;

@Value
public class LawyerEdited {
    private String id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String university;
    private int specialization;
    private BigDecimal lawyerPrice;
    private Instant occurredOn;
}
