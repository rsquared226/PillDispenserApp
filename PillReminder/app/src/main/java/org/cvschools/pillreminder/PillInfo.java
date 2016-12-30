package org.cvschools.pillreminder;

import java.util.Date;

/**
 * Created by Rahul on 12/29/2016.
 */

public class PillInfo {
	private String name;
	private Date date;
	private Date expirationDate;

	public PillInfo(String name, Date date, Date expirationDate) {
		this.name = name;
		this.date = date;
		this.expirationDate = expirationDate;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}
}
