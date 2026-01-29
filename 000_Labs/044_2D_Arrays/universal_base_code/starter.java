/*
 *	Author: Keya Patel
 *  Date: 1/9/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		System.out.println("The integer 2D array has 5 rows and 4 columns");
		int [][] arr = new int [5][4];
		
		for (int r = 0; r < arr.length; r++){
			for (int c = 0; c < arr[0].length; c++){
				System.out.print((arr[r][c] = 16) + " ");
			}
			System.out.println();
		}
		
		System.out.println("The average of all the numbers in the 2D array is 16.");
		
	}
}
