package account;

public class User {
	private int numberAccount;
	private String name;
	private double balance;
	
	public User(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}
	public User(int numberAccount, String name, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.name = name;
		deposit(initialDeposit);
	}
	public int getAccount() {
		return numberAccount;
	}
	///
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	///
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "Account " + numberAccount + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}
	
	public double deposit(double balance) {
		return this.balance += balance; 
	}
	public double withdraw(double balance) {
		return this.balance -= balance + 5; 
	}
}
