package com.tcf.Assignment_3.thiskeyword;

public class Book {
	
	int id;
    String title;
    String author;
    double price;

   // Default constructor using constructor chaining
   public Book() {
       this(0, "Unknown", "Unknown", 0.0);
       System.out.println("Default constructor called");
   }

   // Parameterized constructor using 'this' to refer instance variables
   public Book(int id, String title, String author, double price) {
       this.id = id;
       this.title = title;
       this.author = author;
       this.price = price;
   }

   // Method to display book information
   public void displayInfo() {
       System.out.println("=== Book Information ===");
       System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author + ", Price: " + price);
   }

   // Method calling another method using this
   public void showDetails() {
       this.displayInfo();
   }

   // Method to pass current object to another class
   public void addToStore(BookStore store) {
       store.addBook(this);  // Passing current object
   }

   // Method returning current object
   public Book getBook() {
       return this;
   }

}
