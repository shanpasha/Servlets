package com.StudentDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.Model.Student;
import com.mysql.cj.util.Util;

import UtilConnection.UtilConnect;

public class StudentDaoImpl implements StudentDao {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet resultSet=null;
	int result;
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public void  Sucess(int result) {
	this.result=result;
		if(result==1) {
			System.out.println("Sucessfully Added...");
		}else {
			System.out.println("enter valid Details...");
		}
		
	}
	
	public List<Student> getStudents() {
		
		
		
		
		List<Student> list=new ArrayList<Student>();
		
		con=UtilConnect.getConnection();
		try {
			ps=con.prepareStatement("Select*from Student");
			
			resultSet=ps.executeQuery();
			
			while(resultSet.next()) {
				Student student=new Student();
				
			student.setRoll(resultSet.getInt("roll"));
			student.setName(resultSet.getString("name"));
			student.setCourse(resultSet.getString("course"));
			student.setLocation(resultSet.getString("location"));
			list.add(student);
			
				
				
			}
			
			return list;
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return list;
		
		
	}

	public void add(Student student) {
		
		
	 
		con=UtilConnect.getConnection();
		
		
			
			try {
				con.setAutoCommit(false);
				
				ps=con.prepareStatement("insert into student values (?,?,?,?)");
				ps.setInt(1, student.getRoll());
				ps.setString(2, student.getName());
				ps.setString(3, student.getCourse());
				ps.setString(4, student.getLocation());
				 StudentDaoImpl s=new StudentDaoImpl();
				 int result=ps.executeUpdate();
				 s.Sucess(result);
			
				con.commit();
				
			} catch (SQLException e) {
				try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		
		
		
		
		
		
			
				
			
		
		
		
		
	
	
	
	
	}


	public void delete(int id) {
	Connection con=null;
	PreparedStatement ps=null;
	
	
	con=UtilConnect.getConnection();
	
	try {
		ps=con.prepareStatement("delete from student where roll=?");
	
	ps.setInt(1, id);
	ps.executeUpdate();
	System.out.println("sucess...");
	
	
	
	
	
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public void update_Id(Student student) {
	Connection con=null;
	PreparedStatement ps=null;
	
	con=UtilConnect.getConnection();
	try {
		ps=con.prepareStatement("update student set name=?,course=?,location=? where roll=?");
	ps.setString(1, student.getName());
	ps.setString(2, student.getCourse());
	ps.setString(3, student.getLocation());
	ps.setInt(4, student.getRoll());
	ps.executeUpdate();
	
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
			
		
	}
	
	public static void main(String[] args) {
	StudentDaoImpl n=new StudentDaoImpl();
	
	Student student=new Student("sriman", 1, "java", "hyd");
			n.update_Id(student);
	}
	
	
	
	}
