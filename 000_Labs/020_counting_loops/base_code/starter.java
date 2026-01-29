/*
 *	Author: Keya Patel
 *  Date: 10/01.25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		System.out.print("Please enter an integer: ");
		int num = sc.nextInt();
		
		int times = 0;
		while (num >= times){
			if (num < times){
				break;
			}
			System.out.println(times + ". " + name);
			times = times + 1;
		}
		



		
	}
}
