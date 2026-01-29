/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Patel ATM!");
		System.out.println("We're going to create a bank account! What info do we know?");
		System.out.println("1 - Nothing");
		System.out.println("2 - Owner");
		System.out.println("3 - Owner and Initial Deposit");
		int opt = sc.nextInt();
		
		if (opt == 1){
			System.out.println();
			System.out.println("Account successfully created!");
			System.out.println(displayAccountInfo());
		}
		
		if (opt == 2){
			System.out.println();
			System.out.println("What is the name of the owner for the account?");
			String name = sc.nextLine();
			System.out.println(displayAccountInfo(name));
		}
		
		if (opt == 3){
			System.out.println("What is the name of the owner for the account?");
			name = sc.nextLine();
			System.out.println("How much are you initially depositing into this account?");
			int deposit = sc.nextInt();
			System.out.println(displayAccountInfo(name, deposit));
		}

		System.out.println();
		System.out.println("Would you like to check the balance of this account? (yes/no)");
		String ans = sc.nextLine();
		
		if (ans.equals("yes")){
			System.out.println("Current Account Balance: " + checkBalance());
			System.out.println();
			System.out.println("Thank you for visiting Patel ATM!");
		}
		
		if (ans.equals("no")){
			System.out.println("Great! No balance checked.");
		}
		
	}
}
