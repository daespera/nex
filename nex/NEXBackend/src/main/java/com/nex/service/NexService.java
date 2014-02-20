package com.nex.service;

import com.nex.serviceConfiguration.ServiceConfiguration;
import com.nex.ws.resource.MerchantResource;
import com.nex.ws.resource.TransactionResource;
import com.nex.ws.resource.WalletResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class NexService extends Service<ServiceConfiguration> {
	 
    public static void main(String[] args) throws Exception {
        new NexService().run(new String[] { "server" });
    }
 
    @Override
    public void initialize(Bootstrap<ServiceConfiguration> bootstrap) {
        bootstrap.setName("NEX");
    }
 
    @Override
    public void run(ServiceConfiguration configuration, Environment environment) throws Exception {
    	environment.addResource(new WalletResource());
    	environment.addResource(new MerchantResource());
    	environment.addResource(new TransactionResource());
    }
 
}