package com.nex.ws.resource;

import java.math.BigDecimal;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nex.core.Merchant;
import com.nex.core.MerchantResponse;

@Path("/merchant/{guid}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MerchantResource {
	
	@GET
	@Path("/payment")
	public MerchantResponse payment(@PathParam("guid") String guid,
			@PathParam("password") String password,
			@PathParam("second_password") String second_password,
			@PathParam("to") String to,
			@PathParam("amount") BigDecimal amount,
			@PathParam("from") String from,
			@PathParam("shared") boolean shared,
			@PathParam("fee") BigDecimal fee,
			@PathParam("note") String note) {
		MerchantResponse response = new MerchantResponse();
		
		if (guid.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter guid").type("text/plain").build());
		}
		if (password.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter Password").type("text/plain").build());
		}
		if (second_password.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter second_password").type("text/plain").build());
		}
		if (to.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter to").type("text/plain").build());
		}
		if (amount.compareTo(BigDecimal.valueOf(1)) < 1){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter amount").type("text/plain").build());
		}
		
		response.setMessage("message");
		response.setTx_hash("tx_hash");
		response.setNotice("notice");
		return response;
	}

}
