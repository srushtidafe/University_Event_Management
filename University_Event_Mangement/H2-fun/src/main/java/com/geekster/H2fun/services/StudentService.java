package com.geekster.H2fun.services;

import com.geekster.H2fun.models.Student;
import com.geekster.H2fun.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepository studentRepository;

    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public void removeStudentById(Integer id) {
         studentRepository.deleteById(id);
    }

    public void getStudentById(Integer id) {
        studentRepository.findById(id);

    }

    public void updateStudentById( Integer studentId) {
           studentRepository.findById(studentId);
    }

    public void addAllStudent(List<Student> students) {
        studentRepository.saveAll(students);
    }
}
