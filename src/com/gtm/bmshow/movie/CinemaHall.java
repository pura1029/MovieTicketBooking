package com.gtm.bmshow.movie;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class CinemaHall {
	private int cinemaHallId;
	private String name;
	private int totalSeats;

	private List<CinemaHallSeat> seats;
	private List<Show> shows;

	public Map<Date, Movie> getMovies(List<Date> dateList) {
		return null;
	}
	public Map<Date, Show> getShows(List<Date> dateList) {
		return null;
	}
}
