package com.sonata;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity
@Table(name="Bank")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Bank {
	@Id
	//@GeneratedValue
	private int BankId;
	private String AccountNum;
	private double Amount;
	public int getBankId() {
		return BankId;
	}
	public void setBankId(int bankId) {
		BankId = bankId;
	}
	public String getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(String accountNum) {
		AccountNum = accountNum;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}


	
}
