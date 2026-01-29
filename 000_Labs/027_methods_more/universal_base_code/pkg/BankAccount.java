/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
String owner;
double balance;
String isActive;
int nextAccountNumber; 


	// -------CONSTRUCTORS-------
public BankAccount(){
	owner = new String("Unknown");
	accountNumber = (int)(Math.random()*(1000 - 50) + 50);
	balance = 0.0;
	isActive = "Active";
	nextAccountNumber = accountNumber + 1;
	
}
public BankAccount(String o, int aN, double b, String iA, int nAN){
	owner = o;
	accountNumber = aN;
	balance = b;
	isActive = iA;
	nextAccountNumber += 1;
	nextAccountNumber = nAN;
}
	// --------METHODS--------
public void accountToString(){
	System.out.println("-----------------------------------------");
	System.out.println("Account Owner: "+ owner);
	System.out.println("Account Number: "+ nextAccountNumber);
	System.out.println("Account Balance: "+ balance);
	System.out.println("Account Status: "+ isActive);
	System.out.println("-----------------------------------------");
	System.out.println();
}

public void checkBalance(double b){
	b = balance;
}

public void displayAccountInfo(){
	System.out.println("-------Account Info-------");
	System.out.println("Owner: " + owner);
	System.out.println("Account Number: " + nextAccountNumber);
	System.out.println("Balance: " + balance);
	System.out.println("Status: " + isActive);
}