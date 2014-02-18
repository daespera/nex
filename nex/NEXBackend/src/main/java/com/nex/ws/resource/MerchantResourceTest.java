package com.nex.ws.resource;

import javax.ws.rs.core.MediaType;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.ClientResponse;
import com.yammer.dropwizard.testing.ResourceTest;

public class MerchantResourceTest 
extends ResourceTest{

	final static Logger logger = LoggerFactory.getLogger(MerchantResourceTest.class);
	
	@Override
	protected void setUpResources() {
        addResource(new MerchantResource());
	}
	
	@Test
	 public void testPostSample(){
		client().resource("/merchant/023456789/payment?password=password&second_password=secondpassword&to=0123456789abcde&amount=100").get(ClientResponse.class);
	}
}
