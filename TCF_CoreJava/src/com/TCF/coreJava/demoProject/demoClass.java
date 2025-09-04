package com.TCF.coreJava.demoProject;

import java.util.*;

public class demoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		/*
		 * Scanner class is used to get input from the user.
		 * 
		 * It includes a method known as 'next'.
		 * 
		 * This method varies for different types of variables, such as:
		 * 1. obj.next()
		 * 2. obj.nextInt()
		 * 3. obj.nextFloat()
		 * 4. obj.nextDouble()
		 * 5. obj.nextLine()
		 * 6. obj.nextLine().charAt()
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Data Types - Primitive and Non-Primitive
		 * 
		 * Primitive Types:
		 * 
		 * int - int, byte, short int, short byte, long int, long byte
		 * float - float, double
		 * boolean
		 * char
		 * 
		 * 
		 * 
		 * */
		
		int num = sc.nextInt();
		String s = sc.nextLine();
		char c = sc.nextLine().charAt(0);
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		
		/*
		 * Packages
		 * 
		 * Hierarchy:
		 * 			Package
		 * 				Sub-Package
		 * 					sFiles(do$sfiles)
		 * 
		 * Syntax: 
		 * 		Package com.devCompany.clientCompany.project.packageName;
		 * 
		 * */
	}

}
