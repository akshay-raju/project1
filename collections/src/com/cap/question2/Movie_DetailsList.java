package com.cap.question2;

import java.util.TreeSet;

public class Movie_DetailsList implements Comparable<Movie_DetailsList> {
	TreeSet<Movie_Details> movies;
	public Movie_DetailsList()
	{
		movies=new TreeSet<Movie_Details>();
	}
	public void add_movie(Movie_Details movie)
	{
		movies.add(movie);
	}
	public void remove_movie(Movie_Details movie)
	{
		movies.remove(movie);
	}
	public void remove_AllMovies(Movie_Details movie)
	{
		movies.removeAll(movies);
	}
	public void find_movie_By_mov_Name(String mov_name)
	{
	 System.out.println(movies);
	}
	public void find_movie_By_Genre(String genre)
	{
		System.out.println(movies);
	}
	@Override
	public int compareTo(Movie_DetailsList o) {
		
		return 0;
	}

}