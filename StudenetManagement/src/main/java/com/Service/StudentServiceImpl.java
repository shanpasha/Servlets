package com.Service;

import java.util.List;

import com.Model.Student;
import com.StudentDao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {

	StudentDaoImpl s=new StudentDaoImpl();
	public List<Student> getStudents() {
		
		
		return s.getStudents();
	}

	public void add(Student student) {
		
		s.add(student);
	}

	public void delete(int id) {
		s.delete(id);
		
	}
	 
	
	
	

}
