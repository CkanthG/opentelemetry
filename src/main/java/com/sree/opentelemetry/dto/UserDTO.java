package com.sree.opentelemetry.dto;

public record UserDTO(
        Integer id,
        String name,
        String email,
        String phoneNumber
) {
}
