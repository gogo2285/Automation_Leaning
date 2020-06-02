package encapsulation;

public class Bank {
	
	public int accountno=123456;
	private int pinno=2215;
	int balanceamount=10000;
	
	public  void pinupdate(int accno,int pin )
	{
		if (accno==accountno)
		{
			System.out.println("correct account no. please proceed to update pin");
			pinno=pin;
		}
		else
		{
			System.out.println("incorrect account number cannot update pin");
		}
	}
	
	public void cashwithdraw(int accno, int pin, int balance)
	{
		if (accno==accountno && pin==pinno)
		{
			System.out.println("correct account no. please proceed");
			
			if (balance<=balanceamount)
			{
				balanceamount=balanceamount-balance;
				
				System.out.println("new balance is "+ balanceamount);
				
			}
			else
			{
				System.out.println("insufficinet balance");
			}
				
		}
		else
		{
			System.out.println("incorrect account number");
		}
	}
	
	public void cashdeposit(int accno, int pin, int deposit)
	{
		if (accno==accountno && pin==pinno)
		{
			System.out.println("correct account no. please proceed");
			
			balanceamount = balanceamount+deposit;
			
			System.out.println("new balance is "+ balanceamount);
				
		}
		else
		{
			System.out.println("incorrect account number or pin");
		}
		
		
	}
	}

