/*
 *	Author: Keya Patel
 *  Date: 10/23/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int num = sc.nextInt();
	}
	
	public static boolean checkPrime(int num){
		int check = num;
		if ((check % 2 == 0) || (check % 3 == 0) || (check % 5 == 0) || (check % 7 == 0)){
			return false;
		}
		else {
			return true;
		}
	}
	
	public static void printPrimes(int num){
		int print = num;
		while ((print <= print) && (print > 1)){
			if (checkPrime(print) == false){
				System.out.println(print);
			}
			if (checkPrime(print) == true){
				break;
			}
		}
	}
}
