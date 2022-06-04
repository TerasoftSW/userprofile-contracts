package com.terasoft.userprofile.contracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class CustomerEdited {
    private String id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private Instant occurredOn;
}
