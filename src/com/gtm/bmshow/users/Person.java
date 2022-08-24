package com.gtm.bmshow.users;

import com.gtm.bmshow.datatypes.Address;

public abstract class Person {
	private String name;
	private Address address;
	private String email;
	private String phone;

	/* Has a relationship */
	private Account account;
}
