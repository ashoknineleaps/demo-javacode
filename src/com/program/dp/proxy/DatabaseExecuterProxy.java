package com.program.dp.proxy;

public class DatabaseExecuterProxy implements DatabaseExecuter
{
	private boolean ifAdmin;
	private DatabaseExecuter databaseExecuter;
	
	public DatabaseExecuterProxy(String name, String password) {
		
		if(name.equals("Admin") && password.equals("Ashok@123"))
		{
			ifAdmin = true;
			databaseExecuter = new DatabaseExecuterImpl();
		}
	}
	
	@Override
	public void executerDatabaseQuery(String query) throws Exception {
		
		if(ifAdmin)
		{
			databaseExecuter.executerDatabaseQuery(query);
		}
		else 
		{
			if(query.equals("DELETE"))
			{
				throw new Exception("DELETE not Allowed for non-User");
			}
			else
			{
				databaseExecuter.executerDatabaseQuery(query);
			}
		}
	}
}
