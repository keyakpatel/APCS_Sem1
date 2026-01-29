/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		//BaseClass test = new BaseClass();
		
		sumDigits(234);
		


		
	}
	
	
	public static int sumDigits(int n){
    int sum = 0;
    while (n > 0){
        sum += n % 10;
        n /= 10;
    }
    return sum;
	}
}
