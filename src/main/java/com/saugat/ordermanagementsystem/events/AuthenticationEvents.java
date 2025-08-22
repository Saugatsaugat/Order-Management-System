package com.saugat.ordermanagementsystem.events;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationEvents {

    private static final Logger log = LogManager.getLogger(AuthenticationEvents.class);

    @EventListener
    public void onSuccess(AuthenticationSuccessEvent successEvent){
        log.info("Login Successful for the user: {}", successEvent.getAuthentication().getName());
    }

    @EventListener
    public void onFailure(AbstractAuthenticationFailureEvent failureEvent){
        log.error("Login failed for the user: {} due to: {}", failureEvent.getAuthentication().getName(), failureEvent.getException().getMessage());
    }
}
