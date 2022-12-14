package com.StudentDao;



import java.util.List;

import com.Model.Student;

public interface StudentDao {
	
List<Student>getStudents();
	
 public void add(Student student);
 
 public void delete(int id);
 public void update_Id(Student student); 
	

	
	

}
