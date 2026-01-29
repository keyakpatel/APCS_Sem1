/*
 *	Author: Keya Patel
 *  Date: 11/1/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		test.PooleDwarf("Dopey", 27);
		
		PooleDwarf next = new PooleDwarf();
		next.PooleDwarf("Bashful", 30);
		
		PooleDwarf next1 = new PooleDwarf();
		next1.PooleDwarf("Grumpy", 98);
		
		PooleDwarf next2 = new PooleDwarf();
		next2.PooleDwarf("Sleepy", 67);
		
		PooleDwarf next3 = new PooleDwarf();
		next3.PooleDwarf("Sneezy", 16);
		
		PooleDwarf next4 = new PooleDwarf();
		next4.PooleDwarf("Happy", 32);
		
		PooleDwarf next5 = new PooleDwarf();
		next5.PooleDwarf("Doc", 45);
		
		
	}
}
