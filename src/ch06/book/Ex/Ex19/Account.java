package ch06.book.Ex.Ex19;

public class Account {
	//field
	private int balance;
	private final int MIN_BALANCE = 0;
	private final int MAX_BALANCE = 1000000;
	
	//constructor
	
	//method
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int bal) {
		if (MIN_BALANCE <= bal && bal <= MAX_BALANCE) {
			this.balance = bal;
		} 	
	}
}
