package com.student.service;

import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;
import com.student.domain.Student;

public class StudentServiceImpl  implements StudentService{
	
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new StudentDaoImpl();
		
	}

	@Override
	public void saveStudentInfo(Student student) {
		studentDao.saveStudentInfo(student);
		
	}

}
