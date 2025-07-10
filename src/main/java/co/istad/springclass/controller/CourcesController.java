package co.istad.springclass.controller;

import co.istad.springclass.dto.CourcesResponseDTO;
import co.istad.springclass.service.CoursesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

//@RestController
@Controller
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
public class CourcesController {

    private final CoursesService courcesService;

    @GetMapping
    @ResponseBody
    public List<CourcesResponseDTO> getAllCourses() {
        return courcesService.getAll();
    }

    @ResponseBody
    @GetMapping("/{uuid}")
    public ResponseEntity<CourcesResponseDTO> getCourseById(@PathVariable UUID uuid) {
        return courcesService.getById(uuid)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}