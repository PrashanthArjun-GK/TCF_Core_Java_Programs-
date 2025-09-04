package com.TCF.coreJava.encapsulationDemo;

public class executeEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demoEncapsulation e1 = new demoEncapsulation();
		e1.setcId(42);
		e1.setName("Prashanth Arjun GK");
		e1.setAddress("Puducherry, Puducherry");
		System.out.println(e1.toString());
		demoEncapsulation e2 = new demoEncapsulation();
		e2.setcId(24);
		e2.setName("Karthik Raja R");
		e2.setAddress("Puducherry, Puducherry");
		System.out.println("\n"+e2.toString());
	}

}
