package com.gtm.bmshow.movie;

import java.util.Date;
import java.util.List;

import com.gtm.bmshow.datatypes.Address;

public class Cinema {
	private String name;
	private int totalCinemaHalls;
	private Address location;

	private List<CinemaHall> halls;

	public List<Movie> getMovies(Date date, String city) {
		return null;
	}

	public List<CinemaHall> getCinemalHalls(String city) {
		return null;
	}
}
