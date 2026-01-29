/*
 *	Author: Keya Patel 
 *  Date: 09/15/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		int x = sc.nextInt();
		System.out.println("Please enter another integer: ");
		int y = sc.nextInt();
		System.out.println("Please enter another integer: ");
		int z = sc.nextInt();
		
		System.out.println();
		
		if ((x>y) && (x>z)){
			System.out.println("Your first number is the largest of the three!");
			System.out.println("The number was "+ x);
		}
		
		if ((y>x) && (y>z)){
			System.out.println("Your second number is the largest of the three!");
			System.out.println("The number was "+ y);
		}
		
		if ((z>x) && (z>y)){
			System.out.println("Your thirds number is the largest of the three!");
			System.out.println("The number was " + z);
		}
		
		System.out.println();
		
		if ((x<y) && (x<z)){
			System.out.println("Your first number is the smallest of the three!");
			System.out.println("The number was " + x);
		}
		
		if ((y<x) && (y<z)){
			System.out.println("Your second number is the smallest of the three!");
			System.out.println("The number was " + y);
		}
		
		if ((z<x) && (z<y)){
			System.out.println("Your third number is the smallest of the three!");
			System.out.println("The number was " + z);
		}
	}
}
