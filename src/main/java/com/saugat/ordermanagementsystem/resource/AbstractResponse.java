package com.saugat.ordermanagementsystem.resource;

import com.saugat.ordermanagementsystem.wrapper.api.ApiResponse;
import org.springframework.http.ResponseEntity;

public abstract class AbstractResponse {
    public <T> ResponseEntity<ApiResponse<T>> responseBuilder(boolean success, String message, T data){
        ApiResponse<T> response = new ApiResponse<>(success, message, data);
        return ResponseEntity.ok(response);
    }
}
