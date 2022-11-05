package com.myproject.maven.Hibernate;

import java.util.List;

import com.java.hibernate.MovieDao;
import com.java.hibernate.Movie;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieDao moviedao = new MovieDao();
        Movie movie = new Movie("Interstellar", "Sci-fi", "2014");
        Movie movie1=new Movie("The Shawshank Redemption","DRAMA", "1994");
        moviedao.saveMovie(movie);
        moviedao.saveMovie(movie1);

        List < Movie > movies = moviedao.getStudents();
       
		System.out.println(movies);

	}

}
