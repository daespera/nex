package com.nex.core;

public class Address {

	private Integer balance;
    private String address;
    private String  label;
    private Integer total_received;
    
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Integer getTotal_received() {
		return total_received;
	}
	public void setTotal_received(Integer total_received) {
		this.total_received = total_received;
	}
}
