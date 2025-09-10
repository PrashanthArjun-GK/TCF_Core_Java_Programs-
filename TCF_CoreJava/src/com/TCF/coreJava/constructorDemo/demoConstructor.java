package com.TCF.coreJava.constructorDemo;

public class demoConstructor {

		private int cId;
		private String name;
		private String address;
		
		public demoConstructor() {
			//super();
			System.out.println("Default Constructor Call");
			this.cId = 0;
			this.name = null;
			this.address = null;
			System.out.println("Class: demoConstructor ; Values:[cId=" + cId + ", name=" + name + ", address=" + address + "]");
		}
		
		public demoConstructor(int cId, String name, String address) {
			//super();
			System.out.println("Parameterized Constructor Call");
			this.cId = cId;
			this.name = name;
			this.address = address;
			System.out.println("Class: demoConstructor ; Values:[cId=" + cId + ", name=" + name + ", address=" + address + "]");
		}
		
		public demoConstructor(String name, String address,int cId) {
			//super();
			System.out.println("Parameterized Overloaded Constructor Call");
			this.cId = cId;
			this.name = name;
			this.address = address;
			System.out.println("Class: demoConstructor ; Values:[cId=" + cId + ", name=" + name + ", address=" + address + "]");
		}
		

}
