package com.saugat.ordermanagementsystem.exceptions;

import com.saugat.ordermanagementsystem.wrapper.api.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ApiResponse<Void>> handleCustomException(CustomException ex){
        return ResponseEntity
                .badRequest()
                .body(new ApiResponse<>(false, ex.getMessage(), null));
    }
}
