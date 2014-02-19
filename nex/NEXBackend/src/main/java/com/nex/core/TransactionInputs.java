package com.nex.core;

public class TransactionInputs {
	private TransactionPrevOut prev_out;
	
	private String script;

	public TransactionPrevOut getPrev_out() {
		return prev_out;
	}

	public void setPrev_out(TransactionPrevOut prev_out) {
		this.prev_out = prev_out;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	} 
}
