package com.nex.core;

import java.util.List;

public class InventoryData {
	private String hash;
	private String type;
	private Integer initial_time;
	private String initial_ip;
	private List<ProbableOwners> probable_owners;
	private Integer nconnected;
	private Integer relayed_count;
	private Integer relayed_percent;
	private List<MiningNodes> mining_nodes;
	
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getInitial_time() {
		return initial_time;
	}
	public void setInitial_time(Integer initial_time) {
		this.initial_time = initial_time;
	}
	public String getInitial_ip() {
		return initial_ip;
	}
	public void setInitial_ip(String initial_ip) {
		this.initial_ip = initial_ip;
	}
	public List<ProbableOwners> getProbable_owners() {
		return probable_owners;
	}
	public void setProbable_owners(List<ProbableOwners> probable_owners) {
		this.probable_owners = probable_owners;
	}
	public Integer getNconnected() {
		return nconnected;
	}
	public void setNconnected(Integer nconnected) {
		this.nconnected = nconnected;
	}
	public Integer getRelayed_count() {
		return relayed_count;
	}
	public void setRelayed_count(Integer relayed_count) {
		this.relayed_count = relayed_count;
	}
	public Integer getRelayed_percent() {
		return relayed_percent;
	}
	public void setRelayed_percent(Integer relayed_percent) {
		this.relayed_percent = relayed_percent;
	}
	public List<MiningNodes> getMining_nodes() {
		return mining_nodes;
	}
	public void setMining_nodes(List<MiningNodes> mining_nodes) {
		this.mining_nodes = mining_nodes;
	}
}
