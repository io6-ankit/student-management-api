package com.ankit.studentmanagement.service;

import com.ankit.studentmanagement.model.Student;
import com.ankit.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    //Save
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    //Get all
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    //Get by id
    public Student getStudentById(String id){
        return studentRepository.findById(id).orElse(null);
    }
    //update
    public Student updateStudent(String id, Student student){
        Student oldStudent=studentRepository.findById(id).orElse(null);
        if(oldStudent!=null){

            oldStudent.setName(student.getName());
            oldStudent.setAge(student.getAge());
            oldStudent.setCourse(student.getCourse());
            oldStudent.setCity(student.getCity());
            oldStudent.setAddress(student.getAddress());

            return studentRepository.save(oldStudent);

        }
        return null;
    }
    //Delete
    public void deleteStudent(String id){
        studentRepository.deleteById(id);
    }
}
