package com.gtm.bmshow.users;

import com.gtm.bmshow.booking.Booking;

public class FrontDeskOfficer extends Person {
	public boolean createBooking(Booking booking) {
		return true;
	}
}