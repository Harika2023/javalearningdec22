package com.sira.learning.javalearningdec22.harika;
import java.util.*; 
/* this class is to explain different conditional code flows */
public class ConditionalCodeFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please select option number from below options...");
		System.out.println("1. If code flow");
		System.out.println("2. If else code flow");
		System.out.println("3.Nested if");
		System.out.println("4. For Loop");
		System.out.println("5.While");
		System.out.println("6.Do While");
		System.out.println("7.Switch");
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter your option: ");
		int optionVal  = sc.nextInt();              //reads boolean  

		SwitchCodeFlow(optionVal);
		//System.out.print("Your option is: " + optionVal);
		
	}
	
	private static void SwitchCodeFlow(int optionNumber) {
		
		switch(optionNumber) {
		
		case 1: 
			System.out.println("Your option is If code flow");
			IfCodeFlow();
			break;
		case 7: 
			System.out.println("Your option is Switch code flow");
			
			break;
			
		case 2:
			System.out.println("your option is if else code flow");
			
			break;
			
		case 3:
			System.out.println("your option is Nested if");
			NestedIf();
			break;
			
		case 4:
			System.out.println("your option is Foor Loop");
			
			break;
			
		case 5:
			System.out.println("your option is While");
			
			break;
			
		case 6:
			System.out.println("your option is Do While");
			
			break;
		default:
			System.out.println("your option is not valid");
			break;
			
		}
		
	}

	private static void IfCodeFlow() {
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter conditional value: ");
		boolean condVal =  sc.nextBoolean();  
		if(condVal) {
			System.out.println("You are in if code block...");	
		}else {
			System.out.println("You are in else code block...");
		}
}
	private static void NestedIf() {
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter conditional value1: ");
		boolean condVal1 =  sc.nextBoolean();  

		System.out.print("Enter conditional value2: ");
		boolean condVal2 =  sc.nextBoolean();  
		
		if(condVal1) {
			System.out.println("You are in if code block...");	
			if(condVal2) {
				System.out.println("You are in nested if block...");	
			}else {
				System.out.println("You are in else part of nested block...");	
			}
			
		}else {
			System.out.println("You are in else code block...");
		}
			
			
}
}
	
	
	
	