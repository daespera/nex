package com.nex.ws.resource;

import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nex.core.Wallet;
import com.nex.core.WalletResponse;
import com.yammer.metrics.annotation.Timed;

@Path("/create_wallet")
@Produces(MediaType.APPLICATION_JSON)
public class WalletResource {
	
	@POST
    @Timed
    public WalletResponse create(@Valid Wallet wallet) {
		WalletResponse response = new WalletResponse();
		response.setGuid("guid");
		response.setLink("link");
		response.setAddress("address");
        return response;
    }
	
}