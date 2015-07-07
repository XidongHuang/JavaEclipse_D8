package tony.account.exer;

public class CheckAccount extends Account {
	private double overdraft;
	
	public CheckAccount(int id, double balance,double annualInterestRate, double overdraft){
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	
	public void withdraw(double amount){
		if(super.getBalance() >= amount){
			double rb = super.getBalance() - amount;
			super.setBalance(rb);
			System.out.println("Your balance is:" + super.getBalance()+", and your draft is: " + this.overdraft);
		} else {
			double draft = super.getBalance() - amount;
			draft = -draft;
			if(overdraft >= draft){
				super.setBalance(0);
				overdraft-= draft;
				System.out.println("Your balance is: "+super.getBalance()+", and the over draft is: " + this.overdraft);
			} else {
				System.out.println("Over withdraw!");
			}
			
		}
		
	}
	

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	
}
