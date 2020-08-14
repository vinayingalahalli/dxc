package com.spring.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.spring.hibernate.dao.PlayerDAO;
import com.spring.hibernate.model.Player;

public class PlayerDAOImpl implements PlayerDAO {

	private SessionFactory factory;
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public Player createPlayer(Player player) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(player);
		transaction.commit();
		session.close();
		return player;
	}

	@Override
	public Player getPlayerById(int id) {
		Session session=factory.openSession();
		Player player=(Player) session.get(Player.class, id);
		session.close();
		return player;
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePlayerById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Player> getAllPlayers() {
		Session session=factory.openSession();
		List<Player> playerList=session.createQuery("from com.spring.hibernate.model.Player").list();
		session.close();
		return playerList;
	}

	@Override
	public List<Player> getPlayersByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	



}
