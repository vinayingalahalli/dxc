package com.player.service;

import java.util.List;

import com.player.exception.BusinessException;
import com.player.model.Player;

public interface PlayerService {

	public Player createPlayer(Player player) throws BusinessException;
	public Player getPlayerById(int id) throws BusinessException;
	public Player updatePlayer(Player player) throws BusinessException;
	public void deletePlayer(int id) throws BusinessException;
	public List<Player> getAllPlayers();
	public List<Player> getPlayersByAge(int age) throws BusinessException;
	public List<Player> getPlayersByCity(String city) throws BusinessException;
}
