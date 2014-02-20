package com.nex.core;

import java.util.List;

public class RawBlock {
	private String hash;
	private Integer ver;	
	private String prev_block;
	private String mrkl_root;
	private Integer time;
	private Integer bits;
	private Integer nonce;
	private Integer n_tx;
	private Integer size;
	private Integer block_index;
	private Boolean main_chain;
	private Integer height;
	private Integer received_time;
	private String relayed_by;
	private List<RawTransaction> tx;
	
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
	public String getPrev_block() {
		return prev_block;
	}
	public void setPrev_block(String prev_block) {
		this.prev_block = prev_block;
	}
	public String getMrkl_root() {
		return mrkl_root;
	}
	public void setMrkl_root(String mrkl_root) {
		this.mrkl_root = mrkl_root;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public Integer getBits() {
		return bits;
	}
	public void setBits(Integer bits) {
		this.bits = bits;
	}
	public Integer getNonce() {
		return nonce;
	}
	public void setNonce(Integer nonce) {
		this.nonce = nonce;
	}
	public Integer getN_tx() {
		return n_tx;
	}
	public void setN_tx(Integer n_tx) {
		this.n_tx = n_tx;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getBlock_index() {
		return block_index;
	}
	public void setBlock_index(Integer block_index) {
		this.block_index = block_index;
	}
	public Boolean getMain_chain() {
		return main_chain;
	}
	public void setMain_chain(Boolean main_chain) {
		this.main_chain = main_chain;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getReceived_time() {
		return received_time;
	}
	public void setReceived_time(Integer received_time) {
		this.received_time = received_time;
	}
	public String getRelayed_by() {
		return relayed_by;
	}
	public void setRelayed_by(String relayed_by) {
		this.relayed_by = relayed_by;
	}
	public List<RawTransaction> getTx() {
		return tx;
	}
	public void setTx(List<RawTransaction> tx) {
		this.tx = tx;
	}
}
