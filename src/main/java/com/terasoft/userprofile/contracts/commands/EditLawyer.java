package com.terasoft.userprofile.contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Value
public class EditLawyer {
    @TargetAggregateIdentifier
    private String lawyerId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String university;
    private int specialization;
    private BigDecimal lawyerPrice;
}
