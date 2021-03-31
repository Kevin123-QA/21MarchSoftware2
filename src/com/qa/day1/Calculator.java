package com.qa.day1;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        System.out.println("Enter First Number:"); // User enters first number
	        @SuppressWarnings("resource")
			Scanner input= new Scanner(System.in);
	        double num1,num2,ans =0;
	        
	        char sign; // defining data type as character
	        num1 = input.nextInt();
	        System.out.println("Enter Second Number:"); // User enters second number
	        num2 = input.nextInt();
	        System.out.println("Enter Operator"); // User decides if he wants to add/subtarct/multiply/divide
	        sign= input.next().charAt(0);
	        
	        if(sign == '+') {
	        	ans= num1 + num2;
	        	System.out.print("Answer:");
	        	System.out.println(ans);}
	        
	        else if(sign == '-') {
	        ans = num1 - num2 ;
	        System.out.print("Answer:");
	        System.out.println(num1 - num2);}
	        
	        else if (sign == '*') {
		        ans = num1 * num2 ;
		        System.out.print("Answer:");
		        System.out.println(num1 * num2);}
	        
	        else if (sign == '/') {
		        ans = num1 / num2 ;
		        System.out.print("Answer:");
		        System.out.println(ans);}
	        
	        else 
	        	System.out.print("Invalid operator choosen:");
			
	        
	        		

	}

}
