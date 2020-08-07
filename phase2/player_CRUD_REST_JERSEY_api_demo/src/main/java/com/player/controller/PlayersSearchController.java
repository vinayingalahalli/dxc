package com.player.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.player.exception.BusinessException;
import com.player.model.Player;
import com.player.service.PlayerService;
import com.player.service.impl.PlayerServiceImpl;

@Path("/players")
public class PlayersSearchController {
	private PlayerService service=new PlayerServiceImpl();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Player> getAllPlayers(){
		return service.getAllPlayers();
	}
	
	@Path("/age/{age}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Player> getPlayersByAge(@PathParam("age")int age){
		try {
			return service.getPlayersByAge(age);
		} catch (BusinessException e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	@Path("/city/{city}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Player> getPlayersByCity(@PathParam("city")String city){
		try {
			return service.getPlayersByCity(city);
		} catch (BusinessException e) {
			System.out.println(e);
			return null;
		}
	}
}
