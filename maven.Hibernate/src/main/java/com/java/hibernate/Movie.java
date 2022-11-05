package com.java.hibernate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")

public class Movie {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "moviename")
    private String moviename;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}


	@Column(name = "genre")
    private String genre;

    @Column(name = "year")
    private String year;

    public Movie() {

    }

    public Movie(String moviename, String genre, String year) {
       this.moviename=moviename;
       this.genre=genre;
       this.year=year;
    }

   
    @Override
    public String toString() {
        return "Movie [id=" + id + ", moviename=" + moviename + ", genre=" + genre + ", year=" + year + "]";
    }
	

}
