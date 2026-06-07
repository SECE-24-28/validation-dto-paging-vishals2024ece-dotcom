package jpademo.demo.repository;

import jpademo.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<Student,Integer> {

    Student findByNameAndTech(String name,String tech);
}
