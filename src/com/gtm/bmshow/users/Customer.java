package com.gtm.bmshow.users;

import java.util.Collections;
import java.util.List;

import com.gtm.bmshow.booking.Booking;

public class Customer extends Person {
	public boolean makeBooking(Booking booking) {
		return true;
	}

	public List<Booking> getBookings() {
		return Collections.emptyList();
	}
}