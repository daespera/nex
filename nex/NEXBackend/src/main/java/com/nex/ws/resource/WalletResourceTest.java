package com.nex.ws.resource;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;
import javax.ws.rs.core.MediaType;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nex.core.Wallet;
import com.nex.core.WalletResponse;
import com.sun.jersey.api.client.ClientResponse;
import com.yammer.dropwizard.testing.ResourceTest;

public class WalletResourceTest 
extends ResourceTest{

	final static Logger logger = LoggerFactory.getLogger(WalletResourceTest.class);
	
	@Override
	protected void setUpResources() {
        addResource(new WalletResource());
	}
	
	@Test
	 public void testPostSample() throws Exception {
		String wallet ="{\"password\":\"password12345\",\"api_code\":\"code\"}";
		client().resource("/create_wallet").type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class, wallet);
	}
}
