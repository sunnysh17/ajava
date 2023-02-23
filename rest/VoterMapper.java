package com.sunny.restpracticals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class VoterMapper implements RowMapper<Voters> {

	public Voters mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Voters voters = new Voters();
		voters.setId(rs.getInt("id"));
		voters.setName(rs.getString("name"));
		voters.setAddress(rs.getString("address"));
		return voters;
	}

}
