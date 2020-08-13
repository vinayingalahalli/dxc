package com.spring.jdbc.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.model.Player;

public class PlayerMapper  implements RowMapper<Player>{

	@Override
	public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
		Player player=new Player();
		player.setId(rs.getInt("id"));
		player.setAge(rs.getInt("age"));
		player.setName(rs.getString("name"));
		player.setCity(rs.getString("city"));
		return player;
	}

}
