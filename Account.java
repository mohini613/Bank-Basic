package com.rbi.model;

public class Account {
    private String customerId;
    private String AccountNo;
    private String customerName;
    private String adharNo;
    private String panCard;
    private String accountType;
    private String address;
    private String pinCode;
    private String mobileNo;
    private Double balance;
    private Double deposite;
    private String IFSCCode;
    private Double withdraw;
    private String bankName;
    private String Transaction;
   
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(String AccountNo) {
		this.AccountNo = AccountNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public  Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getDeposite() {
		return deposite;
	}
	public void setDeposite(Double string) {
		this.deposite = string;
	}
	public String getIFSCCode() {
		return IFSCCode;
	}
	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}
	public Double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(Double withdraw) {
		this.withdraw = withdraw;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getTransaction() {
		return Transaction;
	}
	public void setTransaction(String transaction) {
		Transaction = transaction;
	}
	public void deposit(double amount) {
        this.balance += amount;
    }
    public boolean withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else {
            return false;

        }
    }
	}
    


