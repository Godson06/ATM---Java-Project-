package pro;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		//Declaring and initialize balance, withdraw and deposit
		int Balance = 10000, Withdraw, Deposit;
		
		// Scanner object to get input from the user
		Scanner at = new Scanner(System.in);
		
		while(true) {
			System.out.println("Welcome to our ATM");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT");
			System.out.println("Choose the operation you want to perform:");
			
//			 getting choice from the user
			int Choice = at.nextInt();
			
			switch(Choice) {
			case 1:
				System.out.println("Enter money to be withdrawn: ");
				
//				getting withdrawl money from the user
				Withdraw = at.nextInt();
				
//				checking whether the balance is greater than the withdrawl amount
				if(Balance >= Withdraw) {
					
//					 Subtracting the withdrawl amount from balance amount
					Balance = Balance - Withdraw;
					System.out.println("Please collect the CASH");
				}
				else {
					System.out.println("Insufficient Balance!");
				}
				System.out.println("");
				break;
//				 -----------------withdraw process ends here----------
				
				
			case 2:
				System.out.println("Enter the money to be Deposited: ");
				
//				 getting deposit amount from the user
				Deposit = at.nextInt();
				
//				adding the deposit amount to the balance
				Balance = Balance + Deposit;
				System.out.println("Your money is Seccessfully Deposited");
				System.out.println("");				
				break;
//				------------------Depositing process ends here-------------
				
			case 3:
//				Displaying the balance to the user
				System.out.println("Your Available Balance is: " + Balance);
				break;
//				-------------- checking balance process ends here----------------
				
			case 4:
//				exit 
				System.out.println("Thank You for using our ATM!!!");
				System.exit(0);
				
				
			}
		}

	}

}
