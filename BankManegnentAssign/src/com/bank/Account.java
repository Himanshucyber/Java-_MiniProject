package com.bank;

import java.time.LocalDate;

public class Account {

	private String AccNo;	
	private String name;
	private AccType acType;
	private long balance;
	private LocalDate AccOpeningDate;
	
	
	
	
	
	public Account(String accNo, String name, AccType acType, long balance, LocalDate accOpeningDate) {
		super();
		AccNo = accNo;
		this.name = name;
		this.acType = acType;
		this.balance = balance;
		AccOpeningDate = accOpeningDate;
	}

	

	public String getAccNo() {
		return AccNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccType getAcType() {
		return acType;
	}

	public void setAcType(AccType acType) {
		this.acType = acType;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}


	public LocalDate getAccOpeningDate() {
		return AccOpeningDate;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(this.AccNo == ((Account)obj).AccNo) {
			return true;
		}
		return false;
		
	}

	
	@Override
	public String toString() {
		return "Account [AccNo=" + AccNo + ", name=" + name + ", acType=" + acType + ", balance=" + balance
				+ ", AccOpeningDate=" + AccOpeningDate + "]";
	}
	
	
}


