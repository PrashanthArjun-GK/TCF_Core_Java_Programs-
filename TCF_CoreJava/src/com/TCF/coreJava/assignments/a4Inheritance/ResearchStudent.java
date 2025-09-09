package com.tcf.Assignment_4.Inheritance;

public class ResearchStudent extends Student {
	
	private String researchTopic;
    private String supervisorName;

    // Constructor chaining with super()
    public ResearchStudent(String name, int age, int rollNo, String course,
                           String researchTopic, String supervisorName) {
        super(name, age, rollNo, course); // Call Student constructor
        this.researchTopic = researchTopic;
        this.supervisorName = supervisorName;
    }

    // Overriding display method
    @Override
    public void display() {
        super.display();
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("Supervisor: " + supervisorName);
    }

}
