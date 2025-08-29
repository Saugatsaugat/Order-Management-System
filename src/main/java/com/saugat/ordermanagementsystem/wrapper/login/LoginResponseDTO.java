package com.saugat.ordermanagementsystem.wrapper.login;

public record LoginResponseDTO(String status, String jwt, String refreshToken) {
}
