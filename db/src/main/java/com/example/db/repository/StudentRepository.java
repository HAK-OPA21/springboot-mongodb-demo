package com.example.db.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.db.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

	List<Student> findByName(String name);
	
	List <Student> findByEmailAndName (String email, String name);
	
	List<Student> findByNameOrEmail (String name, String email);
	
	/* Använd List om du ill returnera flera document från din databas.
	 * Du kan också använda endast Student för att returnera endast ett dokument men 
	 * det beror lite hur din applikationer ser ut och vad det är du vill göra.
	 * findByNameAndEmail skulle exempelvis inte behöva returnera flera dokument då
	 * email bör vara unikt.
	 * Tänk på att ändrar du något i ditt interface till exempel att inte returnera flera dokument 
	 * se till att ändra i din service och i din controller också.*/
	
}
