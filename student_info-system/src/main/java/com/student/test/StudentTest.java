package com.student.test;

import java.util.Scanner;

import com.student.controller.StudentController;

public class StudentTest {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter db operation");
		String option = input.next();
		StudentController controller = new StudentController();
		
		
		switch(option) {
		
		case "save":
			controller.saveStudentInfo(input);
			break;
		
			
			default:
				System.out.println("wrong selection");
				break;
			
		}
		

	}

}
