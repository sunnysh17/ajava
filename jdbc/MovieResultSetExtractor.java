package com.sunny.movie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class MovieResultSetExtractor implements ResultSetExtractor<List<Movie>> {

	public List<Movie> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		List<Movie> movieList = new ArrayList<Movie>();
		while(rs.next()) {
			
			Movie movie = new Movie(rs.getInt(1),rs.getString(2),rs.getString(3));
			movieList.add(movie);
			
		}
		return movieList;
	}

}
