package com.student.controller;

import java.util.Scanner;

import com.student.domain.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;


public class StudentController {
	
	private StudentService studentService;
	
	public StudentController() {
		studentService= new StudentServiceImpl();
		
		
	}
	
	public void saveStudentInfo( Scanner input) {
		
		
		System.out.println("Enter student name: ");
		String studentName = input.next();
		System.out.println("Enter student roll number: ");
		int rollNumber = input.nextInt();
		System.out.println("Enter student email: ");
		String email = input.next();
		System.out.println("Enter student address: ");
		String address = input.next();
		
		Student student = new Student();
		student.setStudentName(studentName);
		student.setRollNumber(rollNumber);
		student.setEmail(email);
		student.setAddress(address);
		
		studentService.saveStudentInfo(student);
		
		
		
	}

}
