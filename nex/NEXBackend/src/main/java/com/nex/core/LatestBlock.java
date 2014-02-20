package com.nex.core;

public class LatestBlock {
	private String hash;
	private Integer time;
	private Integer block_index;
	private Integer height;
	private String txIndexes;
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public Integer getBlock_index() {
		return block_index;
	}
	public void setBlock_index(Integer block_index) {
		this.block_index = block_index;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public String getTxIndexes() {
		return txIndexes;
	}
	public void setTxIndexes(String txIndexes) {
		this.txIndexes = txIndexes;
	}
}
