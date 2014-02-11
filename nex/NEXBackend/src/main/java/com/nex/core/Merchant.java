package com.nex.core;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Merchant {
	
	@NotNull
	@JsonProperty
	private String guid;
	
	@NotNull
	@JsonProperty
	private String main_password;
	
	@NotNull
	@JsonProperty
	private String second_password;
	
	@NotNull
	@JsonProperty
	private String to;
	
	@NotNull
	@JsonProperty
	private BigDecimal amount;
	
	@JsonProperty
	private String from;
	
	@JsonProperty
	private boolean shared;
	
	@JsonProperty
	private BigDecimal fee;
	
	@JsonProperty
	private String note;
	
	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getMain_password() {
		return main_password;
	}

	public void setMain_password(String main_password) {
		this.main_password = main_password;
	}

	public String getSecond_password() {
		return second_password;
	}

	public void setSecond_password(String second_password) {
		this.second_password = second_password;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public boolean isShared() {
		return shared;
	}

	public void setShared(boolean shared) {
		this.shared = shared;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
