/*
 *	Author: Keya Patel
 *  Date: 11/06/25
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int [1001];
		 int x = 0;
		 int y = 3;
		 int z = 0;
		 while (x < 1001){
		 	z = (arr [x] = y);
		 	System.out.print(z + ", ");
		 	y = y + 3;
		 	x = x + 1;
		 }
		 
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 
		int [] arr2 = new int [1001];
		int a = 0;
		int b = 1000;
		int c = 0;
		while (a < 1001){
			c = (arr2 [a] = b);
			System.out.print(c + ", ");
			b = b - 1;
			a = a + 1;
		}
	}
}
