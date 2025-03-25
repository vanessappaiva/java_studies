package entities;

public class Account {

	//variables
	private int number;
	private String holder;
	private double balance;
	

	
	//constructors
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	

	//get e set
	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public int getNumber() {
		return number;
	}	
	
	public double getBalance() {
		return balance;
	}
	
	
	
	

	//methods
	public void withdraw(double amount) {
		balance -= amount+5; 	
	}
	
	public void deposit(double amount) {
		balance += amount; 	
	}

	
	
	//toString
	public String toString() {
		return "Account " + number + ", Holder:" + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
	
}
