/*
 *	Author:  Keya Patel
 *  Date: 10/28/25
*/

package pkg;
import java.util.*;

public class BankAccount {
String owner;
double balance;
String active;
int nextAccountNumber; 


	// -------CONSTRUCTORS-------
public BankAccount(String o){
	owner = o;
	nextAccountNumber = nextAccountNumber + 1;
	balance = 0.0;
	active = "Active";
	
}
public BankAccount(String o, double b){
	owner = o;
	nextAccountNumber = nextAccountNumber + 1;
	balance = b;
	active = "Active";
}

	// --------METHODS--------
public void accountToString(){
	System.out.println("-----------------------------------------");
	System.out.println("Account Owner: "+ owner);
	System.out.println("Account Number: "+ nextAccountNumber);
	System.out.println("Account Balance: "+ balance);
	System.out.println("Account Status: "+ active);
	System.out.println("-----------------------------------------");
	System.out.println();
}

public void checkBalance(double ba){
	ba = balance; 
}

public void displayAccountInfo(){
	System.out.println("-------Account Info-------");
	System.out.println("Owner: " + owner);
	System.out.println("Account Number: " + nextAccountNumber);
	System.out.println("Balance: " + balance);
	System.out.println("Status: " + active);
}

public void setOwner(String ow){
	ow = owner;
}

public String getOwner(){
	return owner;
}

public double getBalance(){
	return balance; 
}

public void closeAccount(){

}

public String isActive(String iA){
	iA = active;
	return active;
}

public double depositMoney(){
	
}

public double withdrawMoney(){
	
}


}