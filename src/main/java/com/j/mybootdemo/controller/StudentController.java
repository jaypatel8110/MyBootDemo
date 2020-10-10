package com.j.mybootdemo.controller;

import com.j.mybootdemo.models.Course;
import com.j.mybootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students/{studentId}/courses")
    public List<Course> retrieveCoursesForStudent(@PathVariable String studentId) {
        return studentService.retrieveCourses(studentId);
    }

    @GetMapping("/students/{studentId}/courses/{courseId}")
    public Course retrieveDetailsForCourse(@PathVariable String studentId,
                                           @PathVariable String courseId) {
        return studentService.retrieveCourse(studentId, courseId);
    }

    @PostMapping("/students/{studentId}/courses")
    public ResponseEntity<Object> registerStudentForCourse(
            @PathVariable String studentId, @RequestBody Course newCourse) {

        Course course = studentService.addCourse(studentId, newCourse);
        if (course == null)
            return ResponseEntity.noContent().build();

        return new ResponseEntity<>("New course created ", HttpStatus.CREATED);
    }
}
