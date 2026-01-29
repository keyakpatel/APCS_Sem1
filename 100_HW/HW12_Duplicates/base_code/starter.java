/*
 *	Author: Keya Patel
 *  Date: 11/13/25
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		System.out.println("----------------------------------------------------");
		int [] arr = new int [20];
		System.out.println("These are the 20 numbers");
		for (int i = 0; i < arr.length; i++){
			arr [i] = (int)(Math.random()*10 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		int find = (int)(Math.random()*10 + 1);
		System.out.println("The random number to look for is " + find);
		int num = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr [i] == find){
				System.out.println("Duplicate found at index " + i);
				num = num + 1;
			}
		}
		System.out.println("Total number of duplicates for " + find + " is " + num);
		System.out.println("----------------------------------------------------");
		System.out.println("Looking for two in a row:");
		for (int i = 0; i < arr.length - 1; i++){
			if (arr [i] == arr [i + 1]){
				int row = i + 1;
				System.out.println("Two in a row found at indexes " + i + " and " + row + ". The number is " + arr[i]);
			}
		}
	}
}
