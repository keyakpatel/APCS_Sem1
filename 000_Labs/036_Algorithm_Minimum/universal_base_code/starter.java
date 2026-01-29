/*
 *	Author:  Keya Patel
 *  Date: 11/13/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int [(int)(Math.random()*(201-51) + 51)];
		System.out.println("There are " + arr.length + " elements.");
	for (int i = 0; i < arr.length; i++){
		arr[i] = (int)(Math.random()*(101-1) + 1); 
	}
	
	int min = Integer.MAX_VALUE;
	for (int i = 0; i < arr.length; i++){
		if (arr[i] < min){
			min = arr[i];
		}
	}
	System.out.println("The minimum value of all the numbers is: " + min);
	
	int max = Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++){
		if (arr[i] > max){
			max = arr[i];
		}
	}
	System.out.println("The maximum value of all the numbers is: " + max);
	
	int compile = 0;
	int average = 0;
	for (int i = 0; i < arr.length; i++){
		compile = compile + arr[i];
	}
	average = compile/arr.length;
	System.out.println("The average of all the numbers is: " + average);
	}
}
