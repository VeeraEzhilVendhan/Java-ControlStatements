package com.veera.java1.decisionmaking.statements;

import java.util.*;

public class IfElse {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		// if 
		System.out.println("---- If example ----");
		System.out.println("enter age");
		int age=scan.nextInt();		
		if(age<18)
		{
			System.out.println("your age is under 18");
		}
		
		// if else
		System.out.println("---- If Else example ----");
		System.out.println("enter number");
		int num=scan.nextInt();
		checkOddEven(num);
		
		// if else-if else ladder
		System.out.println("---- If Else-If Else ladder example ----");
		System.out.println("enter your mark to find the grade (out of 100)");
		int mark=scan.nextInt();
		findGrade(mark);
		
		//nested if
		System.out.println("---- Nested If example ----");
		System.out.println("enter your age");
		int personAge=scan.nextInt();
		System.out.println("enter your amount");
		int amount=scan.nextInt();
		accountEligibility(personAge,amount);
		
		scan.close();

	}

	private static void findGrade(int mark) {
		if(mark>90)
		{
			System.out.println("Grade S");
		}
		else if(mark>80 && mark<=90)
		{
			System.out.println("Grade A");
		}
		else if(mark>70 && mark<=80)
		{
			System.out.println("Grade B");
		}
		else if(mark>60 && mark<=70)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Grade F");
		}
	}

	private static void checkOddEven(int num) {
		if(num%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
	
	private static void accountEligibility(int personAge, int amount) {
		if(personAge>18)
		{
			if(amount>0)
			{
				System.out.println("you can open account");
			}
			else
			{
				System.out.println("amount should be greater than ₹0");
			}
		}
		else
		{
			System.out.println("under age - account can't be opened");
		}
		

		
	}

}
