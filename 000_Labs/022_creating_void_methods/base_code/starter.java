/*
 *	Author:  Keya Patel
 *  Date: 10/9/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Write a sentence!");
		String sent1 = sc.nextLine();
		System.out.println("Write a sentence!");
		String sent2 = sc.nextLine();
		
		System.out.println();
		System.out.println("This is using methods!");
		toString(sent1);
		toStringCombined(sent1, sent2);
	}
	public static void toString(String sent1){
		System.out.println(sent1);
		return;
	}
	
	public static void toStringCombined(String sent1 , String sent2){
		System.out.print(sent1 + " " + sent2);
		return;
	}
}
