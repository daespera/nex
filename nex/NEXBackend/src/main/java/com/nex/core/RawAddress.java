package com.nex.core;

import java.util.List;

public class RawAddress {
	private String hash;
	private String address;
	private Integer n_tx;
	private Integer n_unredeemed;
	private Integer total_received;
	private Integer total_sent;
	private Integer final_balance;
	private List<RawTransaction> txs;
	
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getN_tx() {
		return n_tx;
	}
	public void setN_tx(Integer n_tx) {
		this.n_tx = n_tx;
	}
	public Integer getN_unredeemed() {
		return n_unredeemed;
	}
	public void setN_unredeemed(Integer n_unredeemed) {
		this.n_unredeemed = n_unredeemed;
	}
	public Integer getTotal_received() {
		return total_received;
	}
	public void setTotal_received(Integer total_received) {
		this.total_received = total_received;
	}
	public Integer getTotal_sent() {
		return total_sent;
	}
	public void setTotal_sent(Integer total_sent) {
		this.total_sent = total_sent;
	}
	public Integer getFinal_balance() {
		return final_balance;
	}
	public void setFinal_balance(Integer final_balance) {
		this.final_balance = final_balance;
	}
	public List<RawTransaction> getTxs() {
		return txs;
	}
	public void setTxs(List<RawTransaction> txs) {
		this.txs = txs;
	}
}
