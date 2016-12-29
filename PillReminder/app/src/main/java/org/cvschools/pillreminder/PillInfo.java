package org.cvschools.pillreminder;

import java.util.Date;

/**
 * Created by Rahul on 12/29/2016.
 */

public class PillInfo {
	private String name;
	private Date date;

	public PillInfo(String name, Date date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}
}
