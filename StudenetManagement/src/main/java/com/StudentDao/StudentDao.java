package com.StudentDao;



import com.Model.Student;

public interface StudentDao {
	
	java.util.List<Student>getStudents();
	
 public void add(Student student);
 
 public void delete(int id);
 public void update_Id(Student student); 
	

	
	

}
