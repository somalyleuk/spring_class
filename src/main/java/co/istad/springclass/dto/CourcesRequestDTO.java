package co.istad.springclass.dto;

import lombok.Builder;
import java.util.UUID;

@Builder
public record CourcesRequestDTO(
        UUID id,
        String name
) {
}