/*
 *	Author:  Keya Patel
 *  Date: 10/9/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your base number?");
		int base = sc.nextInt();
		System.out.println("What is your exponent number?");
		int power = sc.nextInt();
		int num = 1;
		int ans = 0;
		pow(base, power, num, ans);
	}
	public static int pow(int base,int power, int num, int ans){
		while (num == power){
			if (num != power){
				break;
			}
			ans = base * base;
			num += 1;
			return ans;
		}
	}
}
