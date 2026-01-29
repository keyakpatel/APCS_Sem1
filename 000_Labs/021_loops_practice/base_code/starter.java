/*
 *	Author:  Keya Patel
 *  Date: 10/9/25
*/

import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*1000 + 1);
		
		System.out.print("Please enter a number between 1 and 1000: ");
		int guess = sc.nextInt();
		while (guess != num){
			if (guess < num){
				System.out.println("Your number was too low, guess again.");
			}
			if (guess > num){
				System.out.println("Your number was too high, guess again.");
			}
			System.out.print("Please enter a number between 1 and 1000: ");
			guess = sc.nextInt();
		}
		System.out.println("You got the number!! Congrats!");



		
	}
}
