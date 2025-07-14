package co.istad.springclass.repository;


import co.istad.springclass.domain.Courses;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class CoursesRepository {
    private final List<Courses> courseList = new ArrayList<>();

    @PostConstruct
    void init() {
        courseList.add(new Courses(UUID.randomUUID(), "Book 1"));
        courseList.add(new Courses(UUID.randomUUID(), "Book 2"));
    }

    public List<Courses> getAll() {
        return courseList;
    }

    public Optional<Courses> getById(UUID uuid) {
        return courseList.stream()
                .filter(course -> course.getUuid().equals(uuid))
                .findFirst();
    }

    public void create(Courses course) {
        courseList.add(course);
    }
}