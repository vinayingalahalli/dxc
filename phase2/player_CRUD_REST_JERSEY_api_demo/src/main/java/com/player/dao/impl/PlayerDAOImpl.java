package com.player.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.player.dao.PlayerDAO;
import com.player.exception.BusinessException;
import com.player.model.Player;

public class PlayerDAOImpl implements PlayerDAO {

	private Configuration configuration = new Configuration().configure();
	private StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
	private SessionFactory factory = configuration.buildSessionFactory(builder.build());

	@Override
	public Player createPlayer(Player player) throws BusinessException {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(player);
		transaction.commit();
		session.close();
		return player;
	}

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player=null;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		player=(Player) session.get(Player.class, id);
		transaction.commit();
		session.close();
		if(player==null) {
			throw new BusinessException("Player with id "+id+" not found");
		}
		return player;
	}

	@Override
	public Player updatePlayer(Player player) throws BusinessException {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(player);
		transaction.commit();
		session.close();
		return player;
	}

	@Override
	public void deletePlayer(int id) throws BusinessException {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Player player=new Player();
		player.setId(id);
		session.delete(player);
		transaction.commit();
		session.close();

	}

	@Override
	public List<Player> getAllPlayers() {
		Session session=factory.openSession();
		Query query=session.createQuery("from com.player.model.Player");
		List<Player> playerList=query.list();
		return playerList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		Session session=factory.openSession();
		Query query=session.createQuery("from com.player.model.Player where age=:age");
		query.setInteger("age", age);
		List<Player> playerList=query.list();
		if(playerList==null ||playerList.size()==0) {
			throw new BusinessException("No players found with age -> "+age);
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByCity(String city) throws BusinessException {
		Session session=factory.openSession();
		Query query=session.createQuery("from com.player.model.Player where city=:city");
		query.setString("city", city);
		List<Player> playerList=query.list();
		if(playerList==null ||playerList.size()==0) {
			throw new BusinessException("No players found from the city -> "+city);
		}
		return playerList;
	}

}
