/*
 *	Author: Keya Patel
 *  Date: 11/05/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		
		int [] arr = new int [10];
		int x = 0;
		int y = 9;
		while (x < 10) {
			arr [x] = y;
			System.out.println(y);
			x++;
			y--;
		}

		
	}
}
