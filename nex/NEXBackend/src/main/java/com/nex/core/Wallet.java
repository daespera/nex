package com.nex.core;

import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Wallet {
	
	private String id = UUID.randomUUID().toString();
	
	@NotEmpty(message = "Missing Parameter api_code")
	@NotNull(message = "Missing Parameter api_code")
	@JsonProperty
	private String api_code;
	
	@NotEmpty(message = "Missing Parameter password")
	@NotNull(message = "Missing Parameter password")
	@JsonProperty
	@Length(min = 10, message = "Invalid Parameter password")
	private String password;
	
	
	@JsonProperty
	private String priv;
	
	@JsonProperty
	private String label;
	
	@Email
	@JsonProperty
	private String email;

	public Wallet(){
		
	}
	
	public  Wallet(String api_code,String password){
		this.password = password;
		this.api_code = api_code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApi_code() {
		return api_code;
	}

	public void setApi_code(String api_code) {
		this.api_code = api_code;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPriv() {
		return priv;
	}

	public void setPriv(String priv) {
		this.priv = priv;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
