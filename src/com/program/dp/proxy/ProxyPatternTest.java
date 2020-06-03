package com.program.dp.proxy;

public class ProxyPatternTest {

	public static void main(String[] args) {
		
		DatabaseExecuter databaseExecuterNonAdmin = new DatabaseExecuterProxy("NonAdmin", "NonAdmin@123");
		try {
			databaseExecuterNonAdmin.executerDatabaseQuery("DELETE");
		} catch (Exception e) {
			e.printStackTrace();
		}

		DatabaseExecuter databaseExecuterAdmin = new DatabaseExecuterProxy("Admin", "Ashok@123");
		try {
			databaseExecuterAdmin.executerDatabaseQuery("DELETE");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
