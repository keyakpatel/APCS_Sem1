/*
 *	Author:  Keya Patel
 *  Date: 10/22/25
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
String owner;
int accountNumber;
double balance;
String isActive;
int nextAccountNumber; 


	// -------CONSTRUCTORS-------
public BankAccount(){
	owner = new String("unknown");
	accountNumber = (int)(Math.random()*(1000 - 50) + 50);
	balance = 0.0;
	isActive = "active";
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
	System.out.println("Account Owner: "+ owner);
	System.out.println("Account Number: "+ nextAccountNumber);
	System.out.println("Account Balance: "+ balance);
	System.out.println("Account Status: "+ isActive);
	System.out.println();
	System.out.println();
}
}