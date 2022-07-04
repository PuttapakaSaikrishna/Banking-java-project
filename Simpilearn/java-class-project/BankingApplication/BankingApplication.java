package BankingApplication;

import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) 
	{
		
	BankAccount ba = new BankAccount("saikrishna ", "123456789");
	ba.showMenu();

	}
}

class BankAccount {
	int balance;
	int previousTransaction;
	String Customername;
	String CustometId;

	public BankAccount(String customername, String custometId) {
		super();
		Customername = customername;
		CustometId = custometId;
	}

	void deposit(int amount) {
		balance = balance + amount;
		previousTransaction = amount;
	}

	void withdraw(int amount) {
		if (amount != 0) 
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	void getpreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited : " + previousTransaction);
		} else if (previousTransaction > 0) {
			System.out.println("Withdraw : " + Math.abs(previousTransaction));
		} else {
			System.out.println("no Transaction occured");
		}
	}

	void showMenu() {
		
		char option = '\0';
		System.out.println("************************************");
		System.out.println("Welcome " + Customername);
		System.out.println("\n");
		System.out.println("\t1 A . Check Balance ");
		System.out.println("\t2 B . Deposit ");
		System.out.println("\t3 C . Withdraw ");
		System.out.println("\t4 D . previous transaction");
		System.out.println("\t5 E . Exit");
		

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("==========================================");
			System.out.println(" Enter an option :");
			System.out.println("==========================================");
			option = sc.next().charAt(0);
			System.out.println("\n");

			switch (option) {
			case 'A':
				System.out.println("--------------------------------------------");
				System.out.println("\tBalance = " + balance);
				System.out.println("--------------------------------------------");
				System.out.println("\n");
				break;

			case 'B':
				System.out.println("--------------------------------------------");
				System.out.println("\tEnter an amount to deposit :");
				System.out.println("--------------------------------------------");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println("\n");

				break;

			case 'C':
				System.out.println("--------------------------------------------");
				System.out.println("\tEnter an amount to Withdraw :");
				System.out.println("--------------------------------------------");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;

			case 'D':
				System.out.println("--------------------------------------------");
				getpreviousTransaction();
				System.out.println("--------------------------------------------");				System.out.println("--------------------------------");
				System.out.println("\n");
				break;

			case 'E':
				System.out.println("--------------------------------------------");				System.out.println("******************");
				break;

			default:
				System.out.println("Invalid option !! please enter again");
			}

		} while (option > 0);

		System.out.println("** Thanks for using our service **");

	}

}