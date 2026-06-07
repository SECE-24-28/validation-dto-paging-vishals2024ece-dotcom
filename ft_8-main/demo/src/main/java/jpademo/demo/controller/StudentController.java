package jpademo.demo.controller;

import jpademo.demo.model.Student;
import jpademo.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService s;

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return s.getAllStudents();
    }
    @PostMapping("students")
    public String addStudent(@RequestBody Student std){
        s.addStudent(std);
        return "added";
    }
    @GetMapping("students/{id}")
    public Student getById(@PathVariable("id") int id){
        return s.getById(id);
    }
    @PutMapping("students")
    public String updateStudent(@RequestBody Student std){
        s.updateStudent(std);
        return "updated";
    }
    @DeleteMapping("students")
    public String deleteStudent(){
        s.deleteAll();
        return "Deleted All Students";
    }
    @DeleteMapping("students/{id}")
    public String deleteById(@PathVariable("id") int id){
        s.deleteById(id);
        return "deleted";

    }
    @GetMapping("/students-name-tech")
    public Student getStudent(@RequestParam String name, @RequestParam String tech){
        return s.getByNameAndTech(name,tech);
    }
}
