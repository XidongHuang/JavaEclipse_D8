package tony.account.exer;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	
	
	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterest(){
		return this.annualInterestRate/12;
	}
	
	public void withdraw(double amount){
		if(this.balance >= amount){
			this.balance -= amount;
		} else {
			throw new RuntimeException("Not enough money");
		}
		
	}
	
	public void deposit(double amount){
		this.balance+= amount;
	}
	
	
	
}
