package app.controllers;

import app.models.Students;
import app.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudent(@PathVariable String id) {
        return studentService.getStudentById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/throw/{id}")
    public ResponseEntity<Students> getStudentOrThrow(@PathVariable String id) {
        Students student = studentService.getStudentOrThrow(id);
        return ResponseEntity.ok(student);
    }
}
