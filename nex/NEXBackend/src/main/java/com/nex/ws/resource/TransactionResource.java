package com.nex.ws.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;
import com.nex.core.Block;
import com.nex.core.Chart;
import com.nex.core.InventoryData;
import com.nex.core.LatestBlock;
import com.nex.core.RawAddress;
import com.nex.core.RawBlock;
import com.nex.core.RawTransaction;
import com.nex.core.UnspentOutput;


@Produces(value = MediaType.APPLICATION_JSON)
public class TransactionResource {
	final static Logger logger = LoggerFactory.getLogger(TransactionResource.class);
	
	@GET
	@Path("/rawblock/{blockIndexHash}")
	public RawBlock rawBlock(@PathParam("blockIndexHash") String blockIndexHash,
			@QueryParam("format") Optional <String> format){
		RawBlock response = new RawBlock();
		return response;
	}
	
	@GET
	@Path("/block-index/{blockIndexHash}")
	public RawBlock blockIndex(@PathParam("blockIndexHash") String blockIndexHash,
			@QueryParam("format") Optional <String> format){
		return rawBlock(blockIndexHash, format);
	}
	
	@GET
	@Path("/rawtx/{blockIndexHash}")
	public RawTransaction rawTX(@PathParam("blockIndexHash") String blockIndexHash,
			@QueryParam("format") Optional <String> format){
		RawTransaction response = new RawTransaction();
		return response;
	}
	
	@GET
	@Path("/tx-index/{blockIndexHash}")
	public RawTransaction txIndex(@PathParam("blockIndexHash") String blockIndexHash,
			@QueryParam("format") Optional <String> format){
		return rawTX(blockIndexHash, format);
	}
	
	@GET
	@Path("/charts/{chartType}")
	public List <Chart> charts(@PathParam("chartType") String chartType,
			@QueryParam("format") Optional <String> format){
		List <Chart> values = null;
		return values;
	}
	
	@GET
	@Path("/block-height/{blockHeight}")
	public List <RawBlock> blockHeight(@PathParam("blockHeight") String blockHeight,
			@QueryParam("format") Optional <String> format){
		List <RawBlock> blocks = null;
		return blocks;
	}
	
	@GET
	@Path("/address/{$hash160BitcoinAddr}")
	public RawAddress address(@PathParam("hash160BitcoinAddr") String hash160BitcoinAddr,
			@QueryParam("format") Optional <String> format){
		RawAddress response = new RawAddress();
		return response;
	}
	
	@GET
	@Path("/rawaddr/{$hash160BitcoinAddr}")
	public RawAddress rawaddr(@PathParam("hash160BitcoinAddr") String hash160BitcoinAddr,
			@QueryParam("format") Optional <String> format){
		return address(hash160BitcoinAddr, format);
	}
	
	@SuppressWarnings("null")
	@GET
	@Path("/multiaddr")
	public List <RawAddress> multiaddr(Optional <String> active){
		String[] split = active.get().split("|");
		List <RawAddress> addresses = null;
		for (int i = 0; i < split.length; i++) {
			addresses.add(address(split[i], null));
		}
		return addresses;
	}
	
	@GET
	@Path("/unspent")
	public List <UnspentOutput> unspent(Optional <String> active){
		String[] split = active.get().split("|");
		List <UnspentOutput> unspent_outputs = null;
		for (int i = 0; i < split.length; i++) {
			logger.info(split[i]);
		}
		return unspent_outputs;
	}
	
	@GET
	@Path("/latestblock")
	public LatestBlock latestBlock(){
		LatestBlock response = new LatestBlock();
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append("]");
		response.setTxIndexes(sb.toString());
		return response;
	}
	
	@GET
	@Path("/unconfirmed-transactions")
	public List<RawTransaction> unconfirmedTransactions(@QueryParam("format") Optional <String> format){
		List<RawTransaction> txs = null;
		return txs;
	}
	
	@GET
	@Path("/blocks/{timePoolName}")
	public List<Block> blocks(@PathParam("timePoolName") String timePoolName ){
		List<Block> blocks = null;
		return blocks;
	}
	
	@GET
	@Path("/inv/{hash}")
	public InventoryData inv(@PathParam("hash") String hash,
			@QueryParam("format") Optional <String> format){
		InventoryData response = new InventoryData();
		return response;
	}
	
	

}
