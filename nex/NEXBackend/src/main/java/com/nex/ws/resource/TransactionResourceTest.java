package com.nex.ws.resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.ClientResponse;
import com.yammer.dropwizard.testing.ResourceTest;

public class TransactionResourceTest 
extends ResourceTest{

	final static Logger logger = LoggerFactory.getLogger(TransactionResourceTest.class);
	
	@Override
	protected void setUpResources() {
        addResource(new TransactionResource());
	}
	
	@Test
	public void rawBlock(){
		client().resource("/rawblock/1234567890abcdefghijklmnopqrtsuvwxyz").get(ClientResponse.class);
	}
	
	@Test
	public void blockIndex(){
		client().resource("/block-index/1234567890abcdefghijklmnopqrtsuvwxyz").get(ClientResponse.class);
	}

	@Test
	public void rawTX(){
		client().resource("/rawtx/1234567890abcdefghijklmnopqrtsuvwxyz").get(ClientResponse.class);
	}
	
	@Test
	public void txIndex(){
		client().resource("/tx-index/1234567890abcdefghijklmnopqrtsuvwxyz").get(ClientResponse.class);
	}
	
	@Test
	public void charts(){
		client().resource("/charts/all").get(ClientResponse.class);
	}
	
	@Test
	public void blockHeight(){
		client().resource("/block-height/2").get(ClientResponse.class);
	}
	
	@Test
	public void address(){
		client().resource("/address/1234567890abcd").get(ClientResponse.class);
	}
	
	@Test
	public void rawaddr(){
		client().resource("/rawaddr/1234567890abcd").get(ClientResponse.class);
	}
	
	@Test
	public void multiaddr(){
		client().resource("/multiaddr/1234567890abcd%7Cabcdefghijklmnopqrstuvwxyz1234").get(ClientResponse.class);
	}
	
	@Test
	public void unspent(){
		client().resource("/unspent?active=1234567890abcd%7Cabcdefghijklmnopqrstuvwxyz1234").get(ClientResponse.class);
	}
	
	@Test
	public void latestBlock(){
		client().resource("/latestBlock").get(ClientResponse.class);
	}
	
	@Test
	public void unconfirmedTransactions(){
		client().resource("/unconfirmed-transactions").get(ClientResponse.class);
	}
	
	@Test
	public void blocks(){
		client().resource("/blocks/123456").get(ClientResponse.class);
	}
	
	@Test
	public void inv(){
		client().resource("/inv/abcd123456").get(ClientResponse.class);
	}
}
