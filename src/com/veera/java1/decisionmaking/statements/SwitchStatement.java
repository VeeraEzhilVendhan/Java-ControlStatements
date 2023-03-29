package com.veera.java1.decisionmaking.statements;
import java.util.*;

public class SwitchStatement {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//Switch
		System.out.println("---- Switch example ----");
		System.out.println("enter engineering code");
		String enggCode=scan.next();
		String enggBrach=findEnggBranch(enggCode);
		System.out.println(enggBrach);
		
		//Fall through
		System.out.println("--- Fall thorugh example");
		System.out.println("enter weekday number");
		int weekDay=scan.nextInt();
		findWeekDay(weekDay);
		
		scan.close();
		
	}
	
	private static String findEnggBranch(String enggCode) {
		
		String engineeringBranch="";
		final String EEE="EEE";
		switch(enggCode) {
		case EEE:
			engineeringBranch="Electrical and Electronics Engineering";
			break ;		
		case "CSE":
			engineeringBranch="Computer Science Engineering";
			break;
		case "ECE":
			engineeringBranch="Electronics and Communication Engineering";
			break;
		case "IT":
			engineeringBranch="Information Technology Engineering";
			break;
		default:
			engineeringBranch="Invalid Engineering Code";

		}
		return engineeringBranch;
	}
	
	public static void findWeekDay(int weekDay) {
		switch(weekDay) {
		  case 1:
			  System.out.println("sunday");
		  case 2:
			  System.out.println("monday");
		  case 3:
			  System.out.println("tuesday");
		  case 4:
			  System.out.println("wednesday");
		  case 5:
			  System.out.println("thursday");
		  case 6:
			  System.out.println("friday");
		  case 7:
			  System.out.println("saturday");
		  default:
			  System.out.println("invalid week day number");
		}
	}

}
