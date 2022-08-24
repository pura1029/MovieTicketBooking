package com.gtm.bmshow.users;

import com.gtm.bmshow.movie.Movie;
import com.gtm.bmshow.movie.Show;

public class Admin extends Person {
	
	public boolean addMovie(Movie movie) {
		return true;
	}

	public boolean addShow(Show show) {
		return true;
	}

	public boolean blockUser(Customer customer) {
		return true;
	}
}