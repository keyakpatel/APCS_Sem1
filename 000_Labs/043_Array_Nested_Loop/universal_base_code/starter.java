/*
 *	Author: Keya Patel
 *  Date: 1/9/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What symbol would you like to use?");
			String symbol = sc.nextLine();
		System.out.println("What is the width of the box?");
			int width = sc.nextInt();
		System.out.println("What is the height of the box?");
			int height = sc.nextInt();
		
		for (int h = 0; h < height; h++){
			for (int w = 0; w < width; w++){
			System.out.print(symbol + " ");
		}
			System.out.println();
		}


		
	}
}
