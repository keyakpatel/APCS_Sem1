/*
 *	Author: Keya Patel
 *  Date: 09/16/25
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter an integer: ");
		int quant1 = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first): ");
		int quant2 = sc.nextInt();
		
		if (quant1>quant2){
			System.out.println("Please enter another integer that is larger than " + quant1);
			quant2 = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Your range is " + quant1 + " to " + quant2);
		System.out.println("Here are 5 numbers generated in that range: ");
		System.out.print((int)(Math.random()*(quant2-quant1)+quant1));
		System.out.print(", ");
		System.out.print((int)(Math.random()*(quant2-quant1)+quant1));
		System.out.print(", ");
		System.out.print((int)(Math.random()*(quant2-quant1)+quant1));
		System.out.print(", ");
		System.out.print((int)(Math.random()*(quant2-quant1)+quant1));
		System.out.print(", ");
		System.out.print((int)(Math.random()*(quant2-quant1)+quant1));
		
		
	}
}
