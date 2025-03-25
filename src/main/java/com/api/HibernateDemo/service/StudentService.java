package com.api.HibernateDemo.service;

import com.api.HibernateDemo.model.Student;
import com.api.HibernateDemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo; // using studentRepo because it has easy methods that'll allow us to add a new student
    public Student newStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> allStudents() {

        return studentRepo.findAll();
    }


    public void deleteStudent(int id) {
        if (studentRepo.existsById(id)) {
            studentRepo.deleteById(id);
        } else {
            throw new RuntimeException("Student not found with ID: " + id);
        }
    }

    public Student getStudent(int id) {
        return studentRepo.findById(id).get();
//        by default the above returns an object of the Optional class  so we have to cast it back to a Student using get()
    }

    public String updateStudent(int id, Student student) {
        Student st = studentRepo.findById(id).get();

        st.setName(student.getName());
        st.setAge(student.getAge());
        st.setTech(student.getTech());

        studentRepo.save(st); // to update the current st to be the new obj for the particular id

        return "Student Updated successfully 😁!";
    }

    public List<Student> getStudentsByTech(String lang) {
        return studentRepo.findByTech(lang);
    }
}
