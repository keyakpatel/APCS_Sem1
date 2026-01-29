/*
 *	Author:  Keya Patel
 *  Date: 09/10/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a number:");
		int a = sc.nextInt();
		System.out.println("Type in another number:");
		int b = sc.nextInt();
		if (a!=b){
			System.out.println("These numbers are different!");
		}
		if (a==b){
			System.out.println("These numbers are the same!");
			
		}
	}
}
