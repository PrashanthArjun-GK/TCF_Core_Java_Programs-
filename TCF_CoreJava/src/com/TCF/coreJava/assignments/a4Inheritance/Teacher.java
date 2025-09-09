package com.tcf.Assignment_4.Inheritance;

public class Teacher extends Person{
	
	private String employeeId;
    private String subject;

    // Constructor chaining with super()
    public Teacher(String name, int age, String employeeId, String subject) {
        super(name, age); // Call Person constructor
        this.employeeId = employeeId;
        this.subject = subject;
    }

    // Overriding display method
    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Subject: " + subject);
    }

}
