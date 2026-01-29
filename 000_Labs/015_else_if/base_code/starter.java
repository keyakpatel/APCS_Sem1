/*
 *	Author:  Keya Patel
 *  Date: 09/17/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a number between 1 - 1000");
		int num = sc.nextInt();
		int random = ((int)(Math.random()*1000+1));
		
		if (num > random){
			System.out.print("Your number is larger than the random number. ");
			System.out.print("The number was " + random);
		}
		
		else if (num < random){
			System.out.print("Your number is smaller than the random number. ");
			System.out.print("The number was "+ random);
		}
		
		else if (num == random){
			System.out.print("Your number is the same as the random number!");
			System.out.print("The number was " + num);
		}
	}
}
