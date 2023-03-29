package com.veera.java2.loops;

public class ForLoops {
	
	public static void main(String[] args) {
		
		//simple loops
		System.out.println("---- Simple Loop example ----");
		simpleLoop();
		
		//nested loop
		System.out.println("---- Nested Loop example ----");
		nestedLoop();
		
		//for each loop
		System.out.println("---- For Each Loop example ----");
		forEachLoop();
		
		//labeled loop
		System.out.println("---- Labled Loop example ----");
		labeledLoop();
		
		//labeled loop
		System.out.println("---- Infinite Loop example ----");
		infiniteLoop();
	}

	private static void simpleLoop() {
		System.out.println("Printing 1 to 10");
		for(int i=1;i<11;i++)
		{
			System.out.println(i);
		}
	}
	
	private static void nestedLoop() {
		System.out.println("Printing 11 to 29 using nested for loop");
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"-"+j);
			}
		}
	}
	
	private static void forEachLoop() {
		System.out.println("Transversing array using for each loop");
		String[] colors= {"red","green","yellow","white","blue","black"};
		for(String color:colors) {
			System.out.println(color);
		}
	}
	
	private static void labeledLoop() {
		System.out.println("breaking firstloop loop after printing 1-5");
		firstloop: 
			for (int i = 0; i < 10; i++) {
			secondloop: 
				for (int j = 0; j < 10; j++) {
					if (i == 1 && j == 5) {
						System.out.println("breaking first loop");
						break firstloop;
					}
					System.out.println(i+"-"+j);
			    }
		   }
	}
	
	private static void infiniteLoop() {
		System.out.println("infinite loop starts ctrl+c to stop the loop");
		for(;;) {
			System.out.println("Hi");
		}
	}
}
