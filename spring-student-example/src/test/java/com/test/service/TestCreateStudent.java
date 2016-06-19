package com.test.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.hibernate.stat.Statistics;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.student.model.Student;
import com.example.student.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application-main-context.xml")
public class TestCreateStudent {

	@Autowired
	private StudentService studentService;
	

	@Test
	public void test() {
		
		assertNotNull(studentService);
		System.out.println("Temp Dir:"+System.getProperty("java.io.tmpdir"));
		
		//studentService.create(getStudent());
         
        Student student = studentService.findStudent(3L);      
        System.out.println(student);
   
     
		
	}
	

	private Student getStudent(){
		Student student = new Student();
		student.setName("Horn Daneth");
		student.setAddress("Kompong cham");
		student.setTel("0808808080");
		return student;
	}
	
	
}
