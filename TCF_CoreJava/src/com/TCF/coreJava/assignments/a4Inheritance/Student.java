package com.tcf.Assignment_4.Inheritance;

public class Student extends Person{
	
	protected int rollNo;
    protected String course;

    // Constructor chaining with super()
    public Student(String name, int age, int rollNo, String course) {
        super(name, age); // Call Person constructor
        this.rollNo = rollNo;
        this.course = course;
    }

    // Overriding display method
    @Override
    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }

}
