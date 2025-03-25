package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		System.out.println("Enter account number:");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder:");
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)?");
		char option = sc.next().charAt(0);
		
		if(option == 'y') {
			System.out.println("Enter initial deposit value:");
			double balance = sc.nextDouble();
			
			acc = new Account(number, holder, balance);
		}else {
			acc = new Account(number, holder);
		}
		
	
		System.out.println("Account data:");
		System.out.print(acc);
		
		
		System.out.println();
		System.out.println("Enter a deposit value:");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.print(acc);
		
		
		System.out.println();
		System.out.println("Enter a withdraw value:");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.print(acc);
		
		sc.close();

	}

}
