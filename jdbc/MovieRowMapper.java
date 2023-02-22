package com.sunny.movie;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MovieRowMapper implements RowMapper<Movie> {

	public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		return new Movie(rs.getInt(1),rs.getString(2),rs.getString(3));
	}
	
}
