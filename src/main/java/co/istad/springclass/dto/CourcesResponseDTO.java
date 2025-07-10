package co.istad.springclass.dto;

import lombok.Builder;

@Builder
public record CourcesResponseDTO(
        java.util.UUID id,
        String name
) {
}