public class User_Account {
	double balance=1000;
	public void withdraw(double amount) {
		this.balance-=amount;
	}
	public void deposit(double amount) {
		this.balance+=amount;
	}
	public String toString() {
		return "Balance amount: "+this.balance;
	}
}
