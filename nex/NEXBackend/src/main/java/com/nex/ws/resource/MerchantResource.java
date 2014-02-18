package com.nex.ws.resource;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;

import com.google.common.base.Optional;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nex.core.Address;
import com.nex.core.Balance;
import com.nex.core.MerchantResponse;

@Path("/merchant/{guid}")
@Produces(MediaType.APPLICATION_JSON)
public class MerchantResource {
	
	final static Logger logger = LoggerFactory.getLogger(MerchantResource.class);
	
	@GET
	@Path("/payment")
	public MerchantResponse payment(@PathParam("guid") String guid,
			@QueryParam("password") Optional<String> password,
			@QueryParam("second_password") Optional<String> second_password,
			@QueryParam("to") Optional<String> to,
			@QueryParam("amount") Optional<Integer> amount,
			@QueryParam("from") Optional<String> from,
			@QueryParam("shared") Optional<Boolean> shared,
			@QueryParam("fee") Optional<Integer> fee,
			@QueryParam("note") Optional<String> note) {
		MerchantResponse response = new MerchantResponse();

		if (guid.isEmpty() && guid.equals(null)){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter guid").type("text/plain").build());
		}
		if (!password.isPresent()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter Password").type("text/plain").build());
		}
		if (!second_password.isPresent()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter second_password").type("text/plain").build());
		}
		if (!to.isPresent()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter to").type("text/plain").build());
		}
		if (!amount.isPresent()){
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
			@QueryParam("password") Optional<String> password,
			@QueryParam("second_password")  Optional<String> second_password,
			@QueryParam("recipients") Optional<String> recipients,
			@QueryParam("shared") Optional<Boolean> shared,
			@QueryParam("fee") Optional<Integer> fee){
		MerchantResponse response = new MerchantResponse();
		Gson gson = new Gson();
	    Type mapType = new TypeToken<Map<String,Map<String, String>>>() {}.getType();
	    
		Map<String,Map<String, String>> map = gson.fromJson(recipients.toString(), mapType);
		
		
		if (guid.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter guid").type("text/plain").build());
		}
		if (!password.isPresent()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter Password").type("text/plain").build());
		}
		if (!second_password.isPresent()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter second_password").type("text/plain").build());
		}
		if (!recipients.isPresent()){
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
	        	 payment(guid, password, second_password, Optional.of(key), Optional.of(new Integer(numberedEntry.get(key))), null, shared, fee, null);
	         }
	    }
		
		response.setMessage("message");
		response.setTx_hash("tx_hash");
		response.setNotice("notice");
		return response;
	}
	
	@GET
	@Path("/balance")
	public Balance balance(@PathParam("guid") String guid,
			@QueryParam("password") Optional<String> password){
		Balance response = new Balance();
		
		if (guid.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter guid").type("text/plain").build());
		}
		if (!password.isPresent()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter Password").type("text/plain").build());
		}
		
		response.setBalance(0);
		return response;
	}
	
	public Response list(@PathParam("guid") String guid,
			@QueryParam("password") Optional<String> password){
		if (guid.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter guid").type("text/plain").build());
		}
		if (!password.isPresent()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter Password").type("text/plain").build());
		}
		List <Address> response = null;
		String json = new Gson().toJson(response );
		return Response.status(500).entity(json).type("text/plain").build();
	}
	
	public Response newAddress(@PathParam("guid") String guid,
			@QueryParam("password") Optional<String> password,
			@QueryParam("second_password") Optional<String> second_password,
			@QueryParam("label") Optional<String> label){
		Address response =  new Address();
		
		if (guid.isEmpty()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter guid").type("text/plain").build());
		}
		if (!password.isPresent()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter Password").type("text/plain").build());
		}
		if (!second_password.isPresent()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter second_password").type("text/plain").build());
		}
		if (!label.isPresent()){
			throw new WebApplicationException(Response.status(422).entity("Missing Parameter label").type("text/plain").build());
		}
		response.setAddress("address");
		response.setLabel("label");
		String json = new Gson().toJson(response );
		return Response.status(500).entity(json).type("text/plain").build();		
	}

}
