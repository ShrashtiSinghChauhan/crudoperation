package com.crudoperation;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crudoperation.entity.Student;
import com.crudoperation.repository.StudentRepository;

@SpringBootTest
class CrudoperationApplicationTests {

	@Autowired
	private StudentRepository studentRepo;

	@Test
	void saveStudent() {
		System.out.println(studentRepo);
		Student s= new Student();
		s.setCourse("Development");
		s.setName("Shrashti");
		s.setFee(20000);
		
		studentRepo.save(s); //creating
	}
	@Test
	void deleteStudent() { //deleting
		studentRepo.deleteById(1L);
	}
	@Test
	void findStudent() { //searching
		Optional<Student> findById = studentRepo.findById(2L);
		Student student = findById.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
	}
	@Test
	void updateStudent() { //updating   
		Student s= new Student();
		s.setId(2L);
		s.setCourse("Testing");
		s.setName("Stallin");
		s.setFee(10000);
		 studentRepo.save(s);
	}
}
