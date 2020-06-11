package com.program.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount extends Account
{
	private static float totalBalance;
	private List<Account> accounts;
	
	public CompositeAccount() {
		accounts = new ArrayList<>();
	}
	
	@Override
	public float getBalance() {
		
		totalBalance = 0;
		for(Account acc : accounts)
		{
			totalBalance = totalBalance + acc.getBalance();
		}
		return totalBalance;
	}
	
	public void addAccount(Account account)
	{
		accounts.add(account);
	}
	
	public void removeAccount(Account account)
	{
		if(accounts.contains(account))
		{
			totalBalance = totalBalance - account.getBalance();
		}
		accounts.remove(account);
	}
}
