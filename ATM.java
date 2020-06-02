package encapsulation;

public class ATM extends Bank {

	public static void main(String[] args) {
		
		//ATM a = new ATM();
		Bank b= new Bank();
		//b.accountno=123457;
		b.balanceamount=10000;
		b.cashwithdraw(123456, 2215, 5000);
		b.cashwithdraw(123456, 2215, 6000);
		b.cashdeposit(123456, 2215, 3000);
		b.pinupdate(123456, 2231);//// using this method we can update the pin
		b.cashdeposit(123456, 2215, 3000);
		b.cashdeposit(123456, 2231, 3000);
		

	}

}
