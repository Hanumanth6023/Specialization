package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentService {
	
	   @Autowired
	    StudentRepo repo;

	    public void store(Student std) {
	        repo.save(std);
	    }
	 
	    public List<Student> getStudents() {

	        List<Student> list=repo.findAll();    

	        return list;
	    }
	 
	    public Student getStudent(int id) {

	        Student std=repo.findById(id).orElse(new Student());

	        return std;
	    }
	 
	    public void deleteStd(int id) {
	        repo.deleteById(id);
	    }

}
