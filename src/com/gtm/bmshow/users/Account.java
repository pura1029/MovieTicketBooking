package com.gtm.bmshow.users;

import com.gtm.bmshow.enums.AccountStatus;

public class Account {
	private String id;
	private String password;
	private AccountStatus status;

	/**
	 * Reset account password.
	 * 
	 * @return
	 */
	public boolean resetPassword() {
		return true;
	}
}
