package com.spring.jdbc.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.PlayerDAO;
import com.spring.jdbc.dao.mapper.PlayerMapper;
import com.spring.jdbc.model.Player;

public class PlayerDAOImpl implements PlayerDAO{

	private JdbcTemplate template;
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.template=new JdbcTemplate(this.dataSource);
	}
	
	@Override
	public Player createPlayer(Player player) {
		String sql="insert into player(name,age,city) values(?,?,?)";
		template.update(sql,player.getName(),player.getAge(),player.getCity());
		return player;
	}

	@Override
	public Player getPlayerById(int id) {
		String sql="select id,name,age,city from player where id=?";
		Player player=template.queryForObject(sql, new Object[] {id},new PlayerMapper());
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
		String sql="select id,name,age,city from player";
		List<Player> playerList =template.query(sql, new PlayerMapper());
		return playerList;
	}

	@Override
	public List<Player> getPlayersByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
