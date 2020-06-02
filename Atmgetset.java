package encapsulation;

public class Atmgetset extends Bankgetset {
	
	public static void main(String[] args) {
		
	Atmgetset a = new Atmgetset();
	System.out.println(a.getAccountno());
	System.out.println(a.getBalanceamount());
	a.setBalanceamount(124558);
	System.out.println(a.getBalanceamount());
	
	

}
}