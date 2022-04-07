package com.example.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.db.entity.Student;
import com.example.db.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public Student createStudent (Student student) {
		return studentRepository.save(student);
	}
	
	public Student getStudentbyId(String id) {
		return studentRepository.findById(id).get();
	}
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	public Student updateStudent (Student student) {
		return studentRepository.save(student);
	}
	
	public String deleteStudent (String id) {
		studentRepository.deleteById(id);
		return "Student has been deleted.";
		
	/* Dessa tre routes är skapade av oss och är inte native mongoDB
	 * De routes som är ovanför använder native mongoDB metoder*/
		
	}
	
	public List<Student> getStudentsByName (String name) {
		return studentRepository.findByName(name);
	}
	
	public List <Student> studentsByNameAndMail (String name, String email) {
		return studentRepository.findByEmailAndName(email, name);
	}
	
	public List<Student> studentsByNameOrMail (String name, String email) {
		return studentRepository.findByNameOrEmail(name, email);
	}
	
	
	
}
