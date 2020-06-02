package encapsulation;

public class Bankgetset {
	
	public int accountno=123456;
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public int getBalanceamount() {
		return balanceamount;
	}
	public void setBalanceamount(int balanceamount) {
		this.balanceamount = balanceamount;
	}
	public int getPinno() {
		return pinno;
	}
	private int pinno=2215;
	int balanceamount=10000;

}
