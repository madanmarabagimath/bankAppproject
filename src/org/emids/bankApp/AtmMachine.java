package org.emids.bankApp;

import java.util.Scanner;

public class AtmMachine 
{
	Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Welcome to Emids Bank");
		System.out.println("press 1 for deposit press 2 for withdraw press 3 for balence enquery");
		int c=sc.nextInt();
		if(c==1)
		{
			System.out.println("enter l fordeposit to loanAccount or S for Saving account");
			String c1=sc.next();
			if(c1.equalsIgnoreCase("l"))
			{
				//System.out.println("enter");
				Account a1=AccountDb.getAccount("l");
				a1.deposit(2000);		
				
			}
			else if (c1.equalsIgnoreCase("s")) 
			{
				Account a1=AccountDb.getAccount("s");
				a1.deposit(30000);
				
			}
		}
		
			else if (c==2)
			{
				System.out.println("enter l forwithdraw to loanAccount or S for Saving account");
				String c2=sc.next();
				if (c2.equalsIgnoreCase("l")) 
				{
					System.out.println("u didnt withdraw from LoanAccount pls make Deposit");
					
				}
				else if (c2.equalsIgnoreCase("s"))
				{
					Account a1=AccountDb.getAccount("s");
					a1.withdraw(4000);
					
				}
				
			}
	
			
			else
			{
				System.out.println("enter 1 for accountbalence of saving account or 2 for loanAccountbalence ");
				int c3=sc.nextInt();
				if(c3==1)
				{
					Account a1=AccountDb.getAccount("s");
					a1.balenceenq();
				}
				else if (c3==2)
				{
					Account a1=AccountDb.getAccount("s");
					a1.balenceenq();
					
				}
				
			}
	}
}

	


