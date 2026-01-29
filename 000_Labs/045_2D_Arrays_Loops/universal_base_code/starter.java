/*
 *	Author: Keya Patel
 *  Date: 01/13/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows would you like for your 2D array?");
		int rows = sc.nextInt();
		System.out.println("How many columns would you like for your 2D array?");
		int columns = sc.nextInt();
		
		System.out.println("------------------------------------------------------");
		int [][] arr = new int [rows][columns];
		for (int r = 0; r < arr.length; r++){
			for (int c = 0; c < arr[0].length; c++){
				int num = arr[r][c] = (int)(Math.random()*10 + 1);
				printArray(num);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------");
		
		
		System.out.println("What row would you like to get the average of?");
		int avgRows = sc.nextInt();
		System.out.println("The row average is " + averageRow(avgRows, arr));
		System.out.println("The average of the 2D array is " + wholeAverage(arr));
		
	}
	
	public static void printArray(int num){
		System.out.print(num + " ");
	}
	
	public static double averageRow(int row, int [][] arr){
		double averageR = 0.0;
		for (int i = 0; i < arr[0].length; i++){
			averageR = averageR + arr[row][i];
		}
		averageR = averageR/arr[0].length;
		return averageR;
	}
	
	public static double wholeAverage(int [][] arr){
		double wholeAv = 0.0;
		for (int r = 0; r < arr.length; r++){
			for (int c = 0; c < arr[0].length; c++){
				wholeAv = wholeAv + arr[r][c];
			}
		}
		wholeAv = wholeAv/(arr.length * arr[0].length);
		return wholeAv;
		
	}
}
