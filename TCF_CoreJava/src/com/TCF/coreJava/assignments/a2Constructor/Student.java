package com.tcf.Assignment_2.constructor;

public class Student {
	
	int id;
	String name;
	String course;
	
	Student(int id,String name,String course)
	{
		this.id=id;
		this.name=name;
		this.course=course;
	}
	public void displayInfo()
	{
		System.out.println("STUDENT ID: "+id);
		System.out.println("STUDENT NAME: "+name);
		System.out.println("REGISTERED COURSE: "+course);
	}


}
