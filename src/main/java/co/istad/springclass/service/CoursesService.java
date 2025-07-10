package co.istad.springclass.service;

import co.istad.springclass.domain.Courses;
import co.istad.springclass.dto.CourcesResponseDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CoursesService {
    List<CourcesResponseDTO> getAll();
    Optional<CourcesResponseDTO> getById(UUID id);
}
