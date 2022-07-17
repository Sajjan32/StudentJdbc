package com.student.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.student.domain.Student;

import com.techbook.util.DbConnectionUtil;

public class StudentDaoImpl implements StudentDao {

	
		
		public static final String Insert_SQL = "insert into student_table(name,roll_number,email,address) values (?,?,?,?)";
		
		
		
		@Override
		public void saveStudentInfo(Student student) {
			
			try( PreparedStatement ps = DbConnectionUtil.getConnection().prepareStatement(Insert_SQL); ){
				
				ps.setString(1,student.getStudentName());
				ps.setInt(2,student.getRollNumber());
				ps.setString(3,student.getEmail());
				ps.setString(4,student.getAddress());
				ps.executeUpdate();
				
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}
