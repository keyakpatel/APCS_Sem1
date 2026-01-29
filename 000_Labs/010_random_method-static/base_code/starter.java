/*
 *	Author:  Keya Patel
 *  Date: 09/09/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int a = (int)(Math.random() *10);
		System.out.println(("Here is a random number between 0-9: ") + a);
		int b = (int)(Math.random()*11+1);
		System.out.println(("Here is a random number between 1-10: ") + b);
		double c = (double)(Math.random() *1+2.5);
		System.out.println(("Here is a random number between 2.5-3.5: ") +c);
		double d = (double)(Math.random() *(589-14)+14);
		System.out.println(("Here is a random number between 14-589: ") +d);
	
	}
}
