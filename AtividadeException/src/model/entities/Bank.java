package model.entities;

import model.exceptions.WithdrawValue;
import model.exceptions.NotEnoughValue;

public class Bank {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Bank() {
		
	}

	public Bank(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
		
	}
	public void withdraw(Double amount) throws WithdrawValue, NotEnoughValue{
		if(amount > withdrawLimit)
			throw new WithdrawValue("The amount exceeds withdraw limit"); 
		if(amount > balance)
			throw new NotEnoughValue("Not enough balance");
		balance -= amount;
		System.out.printf("New balance: %.2f",balance);
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	

}
