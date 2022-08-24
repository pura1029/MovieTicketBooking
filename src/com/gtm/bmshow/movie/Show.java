package com.gtm.bmshow.movie;

import java.util.Date;
import java.util.List;

public class Show {
	private int showId;
	private Date createdOn;
	private Date startTime;
	private Date endTime;
	private CinemaHall playedAt;
	private Movie movie;

	private List<ShowSeat> seats;//how many is reserved
}
