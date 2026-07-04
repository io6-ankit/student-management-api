package com.ankit.studentmanagement.controller;


import com.ankit.studentmanagement.model.Student;
import com.ankit.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {
  @Autowired
    private StudentService studentService;
  @PostMapping("/save")
  public Student saveStudent(@RequestBody Student student){
      return studentService.saveStudent(student);
  }
    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    //Get Student by id
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id){
      return studentService.getStudentById(id);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable String id,@RequestBody Student student){
      return  studentService.updateStudent(id,student);
    }
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable String id){

        studentService.deleteStudent(id);

        return "Student Deleted Successfully";
    }
}
