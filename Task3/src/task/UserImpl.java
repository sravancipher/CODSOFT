package task;

import task.UserInf;

public class UserImpl implements UserInf{
    float balance;
	public float withdrawing(float amount) {
		balance=balance-amount;
		return balance;
	}
	public float depositing(float amount) {
		balance=balance+amount;
		return balance;
	}
	public float checkBalance() {
		return balance;
	}

		
}
