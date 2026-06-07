package jpademo.demo.service;

import jpademo.demo.model.Student;
import jpademo.demo.repository.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    repo r;
    public List<Student> getAllStudents() {
        return r.findAll();
    }
    public void addStudent(Student std){
        r.save(std);
    }

    public Student getById(int id) {
        return r.findById(id).orElse(new Student());
    }
    public void updateStudent(Student std){
        r.save(std);
    }

    public void deleteAll() {
        r.deleteAll();
    }
    public void deleteById(int id){
        r.deleteById(id);
    }

    public Student getByNameAndTech(String name, String tech) {
        return r.findByNameAndTech(name,tech);
    }
}
