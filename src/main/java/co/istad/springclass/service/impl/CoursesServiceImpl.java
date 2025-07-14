package co.istad.springclass.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.istad.springclass.domain.Courses;
import co.istad.springclass.dto.CourcesRequestDTO;
import co.istad.springclass.dto.CourcesResponseDTO;
import co.istad.springclass.repository.CoursesRepository;
import co.istad.springclass.service.CoursesService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CoursesServiceImpl implements CoursesService {
    private final CoursesRepository coursesRepository;

    @Override
    public List<CourcesResponseDTO> getAll() {
        List<Courses> courses = coursesRepository.getAll();
        return courses.stream()
                .map(course -> new CourcesResponseDTO(course.getUuid(), course.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CourcesResponseDTO> getById(UUID uuid) {
        Optional<Courses> optionalCourse = coursesRepository.getById(uuid);
        return optionalCourse.map(course ->
                new CourcesResponseDTO(course.getUuid(), course.getName())
        );
    }

    @Override
    public CourcesRequestDTO create(CourcesRequestDTO courceRequest) {
        Courses newCourse = new Courses();
        newCourse.setUuid(UUID.randomUUID());
        newCourse.setName(courceRequest.name());
        coursesRepository.create(newCourse); 
        return new CourcesRequestDTO(newCourse.getUuid(), newCourse.getName());
    }

    @Override
    public void deleteCource(UUID uuid) {
        boolean isCourceExit = coursesRepository.getById(uuid).isPresent();
       if (isCourceExit) {
           

       }
    }
}