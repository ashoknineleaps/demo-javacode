package com.program.dp.composite;

public class Client {
	
	//Partitions Component, Leaf, Composite, Client

	public static void main(String[] args) {
		
		CompositeAccount compositeAccount = new CompositeAccount();
		
		DepositeAccount depositeAccountDA = new DepositeAccount("DA1298", 1000.0f);
		DepositeAccount depositeAccountDB = new DepositeAccount("DB1298", 2000.0f);
		SavingAccount savingAccount = new SavingAccount("SA9812", 3000.0f);
		CurrentAccount currentAccount = new CurrentAccount("CA", 5000.0f);
		FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FDA", 100000.0f);
		
		compositeAccount.addAccount(depositeAccountDA);
		compositeAccount.addAccount(depositeAccountDB);
		compositeAccount.addAccount(savingAccount);
		compositeAccount.addAccount(currentAccount);
		compositeAccount.addAccount(fixedDepositAccount);
		
		float totalBalance = compositeAccount.getBalance();
		System.out.println("Total Balance: "+totalBalance);
		
		compositeAccount.removeAccount(depositeAccountDB);

		float totalBalanceAfetrRemoveAccount = compositeAccount.getBalance();
		System.out.println("Total Balance: "+totalBalanceAfetrRemoveAccount);
	}
}
