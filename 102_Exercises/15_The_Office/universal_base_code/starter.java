/*
 *	Author: Keya Patel
 *  Date: 10/21/25
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		dwight.raiseSalary(10);
		System.out.println("Dwight's Annual Salary: " + dwight.getAnnualSalary());
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		jim.raiseSalary(13);
		System.out.println("Jim's Annual Salary: " + jim.getAnnualSalary());
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		pam.employeeToString();
		pam.raiseSalary(52);
		System.out.println("Pam's Annual Salary: " + pam.getAnnualSalary());
		
		Employee sara = new Employee(4567, "Sara", "Banana", 9537.98);
		sara.employeeToString();
		sara.raiseSalary(37);
		System.out.println("Sara's Annual Salary: " + sara.getAnnualSalary());
		
		
		
	
		
	}
}
