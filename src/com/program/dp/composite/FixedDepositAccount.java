package com.program.dp.composite;

public class FixedDepositAccount extends Account {

	private String accountNo;
	private float accountBalance;
	
	public FixedDepositAccount(String accountNo, float accountBalance) {
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
