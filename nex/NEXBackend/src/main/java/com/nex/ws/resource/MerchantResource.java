package com.nex.ws.resource;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nex.core.Address;
import com.nex.core.Balance;
import com.nex.core.MerchantResponse;

@Path("/merchant/{guid}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MerchantResource {
	
	final static Logger logger = LoggerFactory.getLogger(MerchantResource.class);
	
	@GET
	@Path("/payment")
	public MerchantResponse payment(@PathParam("guid") String guid,
			@PathParam("password") String password,
			@PathParam("second_password") String second_password,
			@PathParam("to") String to,
			@PathParam("amount") Integer amount,
			@PathParam("from") String from,
			@PathParam("shared") boolean shared,
			@PathParam("fee") Integer fee,
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
		if (amount.compareTo(Integer.valueOf(1)) < 1){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter amount").type("text/plain").build());
		}
		
		response.setMessage("message");
		response.setTx_hash("tx_hash");
		response.setNotice("notice");
		return response;
	}
	
	
	@GET
	@Path("/sendmany")
	public MerchantResponse sendmany (@PathParam("guid") String guid,
			@PathParam("password") String password,
			@PathParam("second_password")  String second_password,
			@PathParam("recipients") String recipients,
			@PathParam("shared") boolean shared,
			@PathParam("fee") Integer fee){
		MerchantResponse response = new MerchantResponse();
		Gson gson = new Gson();
	    Type mapType = new TypeToken<Map<String,Map<String, String>>>() {}.getType();
	    
		Map<String,Map<String, String>> map = gson.fromJson(recipients, mapType);
		
		
		if (guid.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter guid").type("text/plain").build());
		}
		if (password.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter Password").type("text/plain").build());
		}
		if (second_password.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter second_password").type("text/plain").build());
		}
		if (recipients.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter to").type("text/plain").build());
		}
		
		// Get the count...
	    int count = Integer.parseInt(map.get("0").get("count"));

	    // Get each numbered entry...
	    for (int i = 1; i <= count; i++){
	    	 logger.info("Entry " + i + ":");
	         Map<String, String> numberedEntry = map.get(String.valueOf(i));
	         for (String key : numberedEntry.keySet()){
	        	 logger.info("guid=%s, amount=%s\n", key, numberedEntry.get(key));
	        	 payment(guid, password, second_password, key, new Integer(numberedEntry.get(key)), null, shared, fee, null);
	         }
	    }
		
		response.setMessage("message");
		response.setTx_hash("tx_hash");
		response.setNotice("notice");
		return response;
	}
	
	@GET
	@Path("/balance")
	public Balance balance(@PathParam("guid") String guid,@PathParam("password") String password){
		Balance response = new Balance();
		
		if (guid.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter guid").type("text/plain").build());
		}
		if (password.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter Password").type("text/plain").build());
		}
		
		response.setBalance(0);
		return response;
	}
	
	public Response list(@PathParam("guid") String guid,@PathParam("password") String password){
		if (guid.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter guid").type("text/plain").build());
		}
		if (password.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter Password").type("text/plain").build());
		}
		List <Address> response = null;
		String json = new Gson().toJson(response );
		return Response.status(500).entity(json).type("text/plain").build();
	}
	
	public Response newAddress(@PathParam("guid") String guid,
			@PathParam("password") String password,
			@PathParam("second_password") String second_password,
			@PathParam("label") String label){
		Address response =  new Address();
		
		if (guid.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter guid").type("text/plain").build());
		}
		if (password.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter Password").type("text/plain").build());
		}
		if (second_password.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter second_password").type("text/plain").build());
		}
		if (label.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter label").type("text/plain").build());
		}
		response.setAddress("address");
		response.setLabel("label");
		String json = new Gson().toJson(response );
		return Response.status(500).entity(json).type("text/plain").build();		
	}

}
