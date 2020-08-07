package com.player.service.impl;

import java.util.List;

import com.player.dao.PlayerDAO;
import com.player.dao.impl.PlayerDAOImpl;
import com.player.exception.BusinessException;
import com.player.model.Player;
import com.player.service.PlayerService;

public class PlayerServiceImpl implements PlayerService {

	private PlayerDAO playerDAO=new PlayerDAOImpl();
	@Override
	public Player createPlayer(Player player) throws BusinessException {
		
		return playerDAO.createPlayer(player);
	}

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		if(id<=0 ||id>1000) {
			throw new BusinessException("Entered id "+id+" is invalid");
		}
		return playerDAO.getPlayerById(id);
	}

	@Override
	public Player updatePlayer(Player player) throws BusinessException {
	
		return playerDAO.updatePlayer(player);
	}

	@Override
	public void deletePlayer(int id) throws BusinessException {
		
		playerDAO.deletePlayer(id);
		
	}

	@Override
	public List<Player> getAllPlayers() {
		
		return playerDAO.getAllPlayers();
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		
		return playerDAO.getPlayersByAge(age);
	}

	@Override
	public List<Player> getPlayersByCity(String city) throws BusinessException {
		
		return playerDAO.getPlayersByCity(city);
	}

}
