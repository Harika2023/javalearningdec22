package com.sira.learning.javalearningdec22.harika;
import java.util.*;  

// This class will demonstrate AND (&&), OR (||), NOT (!) logical operations.
public class LogicalOperators {

	private static boolean operand1;
	private static boolean operand2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter first operand: ");  
		 operand1  = sc.nextBoolean();              //reads boolean  
		
		System.out.print("Enter second operand: ");  
		 operand2  = sc.nextBoolean();              //reads boolean  
		
		LogicalAndOperation();
		LogicalOrOperation();
		LogicalnotOperation();
		
		System.out.println("Enter exit to logout....");             

		
	}
	
	public boolean  GetOp1() {
		return operand1;
	}
	public void  SetOp1(boolean value) {
		 operand1 = value;
	}
	
	
	
	private static void LogicalAndOperation() {
	
		if(operand1 && operand2) {
			System.out.println("Final result from Logical And operation on given inputs is TRUE...");         
		}
		else {
			System.out.println("Final result from Logical And operation on given inputs is FALSE...");  
		}
		    
	}
	
	private static void LogicalOrOperation() {
		
		if(operand1 || operand2) {
			System.out.println("Final result from Logical OR operation on given inputs is TRUE...");   
		}
		else {
			System.out.println("Final result from Logical OR operation on given inputs is FALSE...");  
		}
		

	}
	
	private static void LogicalnotOperation()
	{
	
		if(!operand1) {
			
			System.out.println("Final result from logiacl not operation on given inputs is TRUE...");
		}	
		else {
	
			System.out.println("final result from logical not operation on given inputs is FALSE...");
		}
	} 

	
	
} // class ends here..


