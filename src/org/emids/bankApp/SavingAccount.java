package org.emids.bankApp;

public class SavingAccount implements Account
{
	double accbal;
	String accholdername;
	long accno;
	
	public SavingAccount(double accbal, String accholdername, long accno) {
		super();
		this.accbal = accbal;
		this.accholdername = accholdername;
		this.accno = accno;
	}

	@Override
	public void withdraw(double amt) 
	{
		accbal=accbal+amt;
		System.out.println("u r account balence after withdraw is "+accbal);
		
		
	}
	@Override
	public void deposit(double amt) 
	{
		accbal=accbal+amt;
		System.out.println("u r account balence after deposit is "+accbal);
		
	}
	@Override
	public void balenceenq()
	{
		System.out.println("u r current account balence is "+accbal);
	}
	
	

}
