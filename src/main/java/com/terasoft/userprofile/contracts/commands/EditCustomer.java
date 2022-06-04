package com.terasoft.userprofile.contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class EditCustomer {
    @TargetAggregateIdentifier
    private String customerId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}
