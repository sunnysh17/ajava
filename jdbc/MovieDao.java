package com.sunny.movie;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.Query;

public class MovieDao {
	JdbcTemplate jdbcTemplate;

	public MovieDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public List<Movie> getAllMovies(){
		
		return jdbcTemplate.query("SELECT * FROM MOVIE",new MovieResultSetExtractor());
	}
	
	public int insertMovies(Movie m) {
		String query = "INSERT INTO MOVIE(movie_id,movie_name,genre) VALUES (?,?,?)";
		int result = this.jdbcTemplate.update(query,m.getMovie_id(),m.getMovie_name(),m.getGenre());
		return result;
	}
	
	public int updateMovie(Movie originalMovie, Movie newMovie) {
		String query = "UPDATE MOVIE SET MOVIE_NAME=? WHERE MOVIE_ID=?";
		int result = this.jdbcTemplate.update(query,newMovie.getMovie_name(),originalMovie.getMovie_id());
		return result;
		
	}
}
