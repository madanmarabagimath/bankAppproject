package org.emids.bankApp;

public class AccountDb 
{
	public static Account getAccount(String arg)
	{
		
		Account arg1=null;
		if (arg=="s") 
			
			 arg1=new  SavingAccount(100000, "Madan M", 789654312l);
			//return a;
			
		
		else if (arg=="l")
		
			arg1=new LoanAccount(10000, "Madan M", 7658976490l); 
			//return b;
		
			//Account a=null;
		return arg1;
			
		
	}

}
