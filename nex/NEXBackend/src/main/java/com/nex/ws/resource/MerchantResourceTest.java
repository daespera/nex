package com.nex.ws.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.ws.rs.core.MediaType;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.yammer.dropwizard.testing.ResourceTest;

public class MerchantResourceTest 
extends ResourceTest{

	final static Logger logger = LoggerFactory.getLogger(MerchantResourceTest.class);
	
	@Override
	protected void setUpResources() {
        addResource(new MerchantResource());
	}
	
	@Test
	public void payment(){
		client().resource("/merchant/023456789/payment?password=password&second_password=secondpassword&to=0123456789abcde&amount=100").get(ClientResponse.class);
	}
	
	@Test
	public void sendmany() throws UniformInterfaceException, ClientHandlerException, UnsupportedEncodingException{
		String recipients = "{\"1JzSZFs2DQke2B3S4pBxaNaMzzVZaG4Cqh\": 100000000,\"12Cf6nCcRtKERh9cQm3Z29c9MWvQuFSxvT\": 1500000000,\"1dice6YgEVBf88erBFra9BHf6ZMoyvG88\": 200000000}";
		
		client().resource("/merchant/023456789/sendmany?password=password&second_password=secondpassword&recipients="+URLEncoder.encode(recipients, "UTF-8")).get(ClientResponse.class);
	}
}
