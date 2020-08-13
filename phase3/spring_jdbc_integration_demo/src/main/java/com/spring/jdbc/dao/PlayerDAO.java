package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.model.Player;

public interface PlayerDAO {

	public Player createPlayer(Player player);
	public Player getPlayerById(int id);
	public Player updatePlayer(Player player);
	public void removePlayerById(int id);
	public List<Player> getAllPlayers();
	public List<Player> getPlayersByCity(String city);
}
