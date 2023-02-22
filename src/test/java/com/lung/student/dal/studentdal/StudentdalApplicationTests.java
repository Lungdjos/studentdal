package com.lung.student.dal.studentdal;

import com.lung.student.dal.studentdal.entities.Student;
import com.lung.student.dal.studentdal.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	private Student student;

	// method to test the save/create operation
	@Test
	void testCreateStudent(){
		Student student = new Student();
		student.setScourse("WEB DEV");
		student.setSname("DAVID LUNGU");
		student.setSfee(24536);
		studentRepository.save(student);
	}

	// method to test the read/find operation
	@Test
	void testFindStudentById(){
		Optional<Student> student = studentRepository.findById(1);
		System.out.println(student);
	}

	// method to test the update operation
	@Test
	void testUpdateStudent(){
		Student student = studentRepository.findById(1).orElseThrow();
		student.setSname("Rabecca M. Lungu");
		studentRepository.save(student);
	}

	// method to test the delete operation
	@Test
	void testDeleteStudent(){
		studentRepository.findById(1);
		studentRepository.deleteById(1);
	}

}
