package com.rbi.main;
import java.util.Scanner;

import com.rbi.operation.Operation;
public class Main {
	
		
	static Scanner sc=new Scanner(System.in);
	
public static void main(String[] args) {
	Operation op = new Operation ();
	while (true) {
		
	
	System.out.println("Enter your choice");
	System.out.println("1. Create Account. \n2.Show account details");
	int ch= sc.nextInt();
	
	switch (ch) {
	case 1: {
		op.CreateAccount();
	 break;
	}
	case 2: {
		op.showAccountDetails();
	}
		case 3:{
			op.transaction();
		break;
	}
	
	default:
    	System.out.println("please enter correct input value");
    	break;
	}
	
		
	}
}
	
	
	
	}



