package com.nex.core;

public class TransactionPrevOut {
	private String hash;
	private Integer value;
	private Integer tx_index;
	private Integer n;
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getTx_index() {
		return tx_index;
	}
	public void setTx_index(Integer tx_index) {
		this.tx_index = tx_index;
	}
	public Integer getN() {
		return n;
	}
	public void setN(Integer n) {
		this.n = n;
	}
}
