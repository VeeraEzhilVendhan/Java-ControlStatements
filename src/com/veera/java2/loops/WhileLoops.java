package com.veera.java2.loops;

public class WhileLoops {
	
	public static void main(String[] args) {
		
		System.out.println("---- Simple while loop example ----");
		whileLoop();
		System.out.println("---- Infinite while loop example ----");
		infiniteWhileLoop();
		
	}
	
	public static void whileLoop() {
		System.out.println("Printing 0 to 10");
		int i=0;		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
	}
	
	public static void infiniteWhileLoop() {
		System.out.println("Printing \"Hi\" infinite times");	
		while(true) {
			System.out.println("Hi");
		}
		
	}

}
