package com.sunny.movie;

import java.util.List;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sunny/movie/config.xml");
		JdbcTemplate jdbcTemplate = context.getBean("JdbcTemplate",JdbcTemplate.class);
		MovieDao movieDao = new MovieDao(jdbcTemplate);
		
		Movie m1 = new Movie(1,"3 Idiots","Comedy");
		Movie m2 = new Movie(2,"Shutter Island","Thriller");
		Movie m3 = new Movie(3,"Inception","Suspense");
		
		System.out.println("Movie Inserted: " + movieDao.insertMovies(m1) + m1);
		System.out.println("Movie Inserted: " + movieDao.insertMovies(m2) + m2);
		System.out.println("Movie Inserted: " + movieDao.insertMovies(m3) + m3);
		
		
		
		List<Movie> movieList = movieDao.getAllMovies();
		ListIterator<Movie> movListIterator = movieList.listIterator();
		while(movListIterator.hasNext()) {
			System.out.println(movListIterator.next());
		}
		
		//updating one record
		Movie updatedMovie = new Movie(m1.getMovie_id(),"horizon",m1.getGenre());
		System.out.println("Updated Movie: " + movieDao.updateMovie(m1, updatedMovie) + m1);
		
	}
}
