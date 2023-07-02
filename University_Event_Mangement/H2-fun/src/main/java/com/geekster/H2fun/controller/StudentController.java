package com.geekster.H2fun.controller;

import com.geekster.H2fun.models.Student;
import com.geekster.H2fun.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/Student")
    public Iterable<Student> getStudents(){
       return studentService.getAllStudents();
    }

    @GetMapping(value = "/Student/{studentId}")
    public void getStudentById( @PathVariable Integer studentId){ studentService.getStudentById(studentId);
    }
    @PostMapping(value = "/Student")
    public Student addStudent(@Valid @RequestBody Student student){
        return studentService.addStudent(student);
    }
    @PostMapping(value = "/Students")
    public void addAllStudent(@Valid @RequestBody List<Student> students){
         studentService.addAllStudent(students);
    }
    @DeleteMapping(value ="/Student/{studentId}")
    public void removeById(@PathVariable Integer studentId){
         studentService.removeStudentById(studentId);
    }

    @PutMapping(value = "/Student/{studentId}")
    public void updateStudentById(@PathVariable Integer studentId){
        studentService.updateStudentById( studentId);
    }
}
