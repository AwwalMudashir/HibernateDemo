package com.api.HibernateDemo.controller;

import com.api.HibernateDemo.model.Student;
import com.api.HibernateDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class StudentController {

    @Autowired
    StudentService studentService; // using student service to do the work
    @PostMapping("newstudent")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public Student newStudent(@RequestBody Student student){
       return studentService.newStudent(student);
    }

    @GetMapping("allstudents")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public List<Student> allStudents(){
        return studentService.allStudents();
    }

    @GetMapping("student/{id}")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public Student getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }
    @DeleteMapping("deletestudent/{id}")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "Student Deleted Successfully !";
    }

    @PutMapping("student/{id}")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public String updateStudent(@PathVariable int id, @RequestBody Student student){
        return studentService.updateStudent(id,student);
    }

    @GetMapping("studentsbystack")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public List<Student> getStudentByTech(@RequestParam String lang){
//        @RequestParam cos we want stringsies

        return studentService.getStudentsByTech(lang);
    }
}
