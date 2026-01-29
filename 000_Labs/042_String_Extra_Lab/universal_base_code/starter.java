/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sent = sc.nextLine();
		System.out.println();
		String ans = "";
			
		while (sent.indexOf(" ") != -1){
			int space = sent.indexOf(" ");
			String word = sent.substring(space,0);
			sent = sent.substring(space + 1);
			ans = word + ans;
			System.out.print(ans);
		}
		System.out.print(sent);	
		
	}
}
