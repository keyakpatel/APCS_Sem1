/*
 *	Author:  Keya Patel
 *  Date: 11/19/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int [] arr = new int [100];
		for (int i = 0; i < 100; i++){
			arr [i] = (int)(Math.random()*100 + 1);
		}
		toStringArray(arr);
		System.out.println("The average of 100 random numbers is: " + getArrayAverage(arr));
		System.out.println("The maximum of 100 random numbers is: " + getArrayMax(arr));
		System.out.println("The minimum of 100 random numbers is: " + getArrayMin(arr));


		
	}
	
	public static void toStringArray(int [] x ){
		for (int i = 0; i < 100; i++){
			System.out.println(x[i]);
		}
	}
	
	public static int getArrayAverage(int [] x){
		int y = 0;
		for (int i = 0; i < 100; i++){
			y = y + x[i];
		}
		return y/100; 
	}
	
	public static int getArrayMax(int [] x){
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 100; i++){
			if (x[i] > max){
				max = x[i];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int [] x){
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 100; i++){
			if (x[i] < min){
				min = x[i];
			}
		}
		return min;
	}
	
}
