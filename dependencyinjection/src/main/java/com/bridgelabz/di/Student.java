package com.bridgelabz.di;

public class Student {
	private int id;
	private String studentname;
	
	public void setId(int id) {
		this.id = id;
	}	 
	 public void setStudentname(String studentname) {
			this.studentname = studentname;
		}
	
	public void studentInfo(){
		System.out.println("student name: " + studentname);
		System.out.println("student id: " + id);
		
	}

	

}
