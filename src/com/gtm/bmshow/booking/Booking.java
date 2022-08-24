package com.gtm.bmshow.booking;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.gtm.bmshow.enums.BookingStatus;
import com.gtm.bmshow.movie.Show;
import com.gtm.bmshow.movie.ShowSeat;
import com.gtm.bmshow.payment.Payment;
import com.gtm.bmshow.users.Customer;

public class Booking {
	private String bookingNumber;
	private int numberOfSeats;
	private Date createdOn;
	private BookingStatus status;

	private Show show;
	private Map<Customer, ShowSeat> custToSeatMap;
	private Payment payment;

	/*
	 * Make payment for outstanding amount
	 */
	public boolean makePayment(Payment payment) {
		return true;
	}

	/**
	 * Cancel existing booking
	 * 
	 * @return
	 */
	public boolean cancel() {
		return true;
	}

	/**
	 * @param seats allocate the seat.
	 * @return
	 */
	public boolean assignSeats(List<ShowSeat> seats) {
		return true;
	}

}
