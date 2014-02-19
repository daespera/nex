package com.nex.core;

import java.util.List;

public class RawTransaction {
	private String hash;
	private Integer ver;
	private Integer vin_sz;
	private Integer vout_sz;
	private String lock_time;
	private Integer size;
	private String relayed_by;
    private Integer block_height;
	private Integer tx_index;
	private TransactionInputs inputs;
	private List<TransactionOut> out;
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public Integer getVer() {
		return ver;
	}
	public void setVer(Integer ver) {
		this.ver = ver;
	}
	public Integer getVin_sz() {
		return vin_sz;
	}
	public void setVin_sz(Integer vin_sz) {
		this.vin_sz = vin_sz;
	}
	public Integer getVout_sz() {
		return vout_sz;
	}
	public void setVout_sz(Integer vout_sz) {
		this.vout_sz = vout_sz;
	}
	public String getLock_time() {
		return lock_time;
	}
	public void setLock_time(String lock_time) {
		this.lock_time = lock_time;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getRelayed_by() {
		return relayed_by;
	}
	public void setRelayed_by(String relayed_by) {
		this.relayed_by = relayed_by;
	}
	public Integer getBlock_height() {
		return block_height;
	}
	public void setBlock_height(Integer block_height) {
		this.block_height = block_height;
	}
	public Integer getTx_index() {
		return tx_index;
	}
	public void setTx_index(Integer tx_index) {
		this.tx_index = tx_index;
	}
	public TransactionInputs getInputs() {
		return inputs;
	}
	public void setInputs(TransactionInputs inputs) {
		this.inputs = inputs;
	}
	public List<TransactionOut> getOut() {
		return out;
	}
	public void setOut(List<TransactionOut> out) {
		this.out = out;
	}
}
