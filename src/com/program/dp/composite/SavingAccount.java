package com.program.dp.composite;

public class SavingAccount extends Account {

	private String accountNo;
	private float accountBalance;
	
	public SavingAccount(String accountNo, float accountBalance) {
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}
	
	@Override
	public float getBalance() {
		return this.accountBalance;
	}

	public String getAccountNo() {
		return accountNo;
	}
}
