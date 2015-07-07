package tony.test;
import tony.account.exer.*;

public class TestAccount {
	public static void main(String[] args) {
//		Account acct = new Account(1122,20000, 0.045);
//		acct.withdraw(30000);
//		acct.withdraw(2500);
//		acct.deposit(3000);
//		System.out.println("Balance is "+ acct.getBalance()+" , and the monthly interest is " + acct.getMonthlyInterest());
		
		CheckAccount ca = new CheckAccount(1122, 20000, 0.045,5000);
		
		ca.withdraw(5000);
		ca.withdraw(18000);
		ca.withdraw(3000);
		
	}
}
