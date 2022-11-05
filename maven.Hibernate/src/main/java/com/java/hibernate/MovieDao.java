package com.java.hibernate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import  com.java.hibernate.Movie;
import com.java.hibernate.HibernateUtil;

public class MovieDao {
	 public void saveMovie(Movie movie) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(movie);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	    public List < Movie > getStudents() {
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            return session.createQuery("from Movie", Movie.class).list();
	        }
	    }
	

}
