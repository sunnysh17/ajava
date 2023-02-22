package com.sunny.movie;

public class Movie {
	private int movie_id;
	private String movie_name;
	private String genre;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int movie_id, String movie_name, String genre) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.genre = genre;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", movie_name=" + movie_name + ", genre=" + genre + "]";
	}
	
	
	
	
}
