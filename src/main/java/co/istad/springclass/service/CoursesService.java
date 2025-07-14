package co.istad.springclass.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.istad.springclass.dto.CourcesRequestDTO;
import co.istad.springclass.dto.CourcesResponseDTO;

public interface CoursesService {
    List<CourcesResponseDTO> getAll();
    Optional<CourcesResponseDTO> getById(UUID id);
    CourcesRequestDTO create(CourcesRequestDTO cource);
    void  deleteCource(UUID uuid);
}
