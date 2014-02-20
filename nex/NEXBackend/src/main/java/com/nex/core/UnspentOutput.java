package com.nex.core;

public class UnspentOutput {
	private Integer tx_age;
	private String tx_hash;
	private Integer tx_index;
	private Integer tx_output_n;	
	private String script;
	private Integer value;
	
	public Integer getTx_age() {
		return tx_age;
	}
	public void setTx_age(Integer tx_age) {
		this.tx_age = tx_age;
	}
	public String getTx_hash() {
		return tx_hash;
	}
	public void setTx_hash(String tx_hash) {
		this.tx_hash = tx_hash;
	}
	public Integer getTx_index() {
		return tx_index;
	}
	public void setTx_index(Integer tx_index) {
		this.tx_index = tx_index;
	}
	public Integer getTx_output_n() {
		return tx_output_n;
	}
	public void setTx_output_n(Integer tx_output_n) {
		this.tx_output_n = tx_output_n;
	}
	public String getScript() {
		return script;
	}
	public void setScript(String script) {
		this.script = script;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
}
