package co.istad.springclass.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.istad.springclass.dto.CourcesRequestDTO;
import co.istad.springclass.dto.CourcesResponseDTO;
import co.istad.springclass.exceptioin.ErrorResponseException;
import co.istad.springclass.service.CoursesService;
import lombok.RequiredArgsConstructor;

@RestController
//@Controller
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
public class CourcesController {

    private final CoursesService courcesService;

    @GetMapping
//    @ResponseBody
    public List<CourcesResponseDTO> getAllCourses() {
        return courcesService.getAll();
    }

//    @ResponseBody
@GetMapping("/{uuid}")
public ResponseEntity<CourcesResponseDTO> getCourseById(@PathVariable UUID uuid) {
    return courcesService.getById(uuid)
            .map(ResponseEntity::ok)
            .orElseThrow(() -> new ErrorResponseException(404, "Course not found with id: " + uuid));
}

@PostMapping
 public ResponseEntity<CourcesRequestDTO> createCourse(@RequestBody CourcesRequestDTO courcesRequestDTO) {
       try {
           CourcesRequestDTO newCourse = courcesService.create(courcesRequestDTO);
           return ResponseEntity.status(HttpStatus.CREATED).body(newCourse);
       } catch (Exception e) {
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
       }
    }
}