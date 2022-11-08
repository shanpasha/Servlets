package com.Service;

import java.util.List;

import com.Model.Student;

public interface StudentService {
	
	List<Student>getStudents();
	public void add(Student student);
	
	 public void delete(int id);

}
