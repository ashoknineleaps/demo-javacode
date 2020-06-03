package com.program.dp.proxy;

public class DatabaseExecuterImpl implements DatabaseExecuter {

	@Override
	public void executerDatabaseQuery(String query) throws Exception {
		System.out.println("Admin User Only : Going to Execute Query: "+query);
	}

}
