package com.gtm.bmshow.movie;

import java.util.Date;
import java.util.List;

import com.gtm.bmshow.users.Admin;

public class Movie {
	private int movieId;
	private String title;
	private String description;
	private int durationInMins;
	private String language;
	private Date releaseDate;
	private String country;
	private String genre;
	private Admin movieAddedBy;

	private List<Show> shows;

	/**
	 * List down all shows for the movie.
	 */
	public List<Show> getShows() {
		return shows;
	}
}
