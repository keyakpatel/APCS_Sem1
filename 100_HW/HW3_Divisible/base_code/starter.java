/*
 *	Author: Keya Patel
 *  Date: 09/14/25
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int quant1 = sc.nextInt();
		System.out.println("Please enter another integer: ");
		int quant2 = sc.nextInt();
		
		System.out.println();
		if (quant1 % 3 == 0) {
			System.out.println(quant1 + " is divisible by 3!");
		}
		else {
			System.out.println(quant1 + " is not divisible by 3!");
		}
		
		if (quant1 % 4 ==0){
			System.out.println(quant1 + " is divisible by 4!");
		}
		else {
			System.out.println(quant1 + " is not divisible by 4!");
		}
		
		if (quant1 % 5 ==0){
			System.out.println(quant1 + " is divisible by 5!");
		}
		else {
			System.out.println(quant1 + " is not divisible by 5!");
		}
		
		
		System.out.println();
		if (quant2 % 3 ==0){
			System.out.println(quant2 + " is divisible by 3!");
		}
		else{
			System.out.println(quant2 + " is not divisible by 3!");
		}
		
		if (quant2 % 4 ==0){
			System.out.println(quant2 + " is divisible by 4!");	
		}
		else {
			System.out.println(quant2 + " is not divisible by 4!");
		}
		
		if (quant2 % 5 ==0){
			System.out.println(quant2 + " is divisible by 5!");
		}
		else {
			System.out.println(quant2 + " is not divisible by 5!");
		}

	}
}
