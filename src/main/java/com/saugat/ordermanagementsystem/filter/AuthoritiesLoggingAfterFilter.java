package com.saugat.ordermanagementsystem.filter;

import jakarta.servlet.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;

public class AuthoritiesLoggingAfterFilter implements Filter {
    private static final Logger log = LogManager.getLogger(AuthoritiesLoggingAfterFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(null != authentication){
            log.info("User " + authentication.getName() + " is successfully authenticated and " +
                    "has the authorities "+ authentication.getAuthorities().toString());
        }
        chain.doFilter(request, response);
    }
}
