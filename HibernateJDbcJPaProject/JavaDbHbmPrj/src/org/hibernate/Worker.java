package org.hibernate;
// Generated Aug 6, 2021, 12:56:23 PM by Hibernate Tools 5.4.30.Final

import java.util.Date;

/**
 * Worker generated by hbm2java
 */
public class Worker implements java.io.Serializable {

	private long workerId;
	private Date birthDate;
	private String cellPhone;
	private String firstname;
	private String lastname;

	public Worker() {
	}

	public Worker(long workerId) {
		this.workerId = workerId;
	}

	public Worker(long workerId, Date birthDate, String cellPhone, String firstname, String lastname) {
		this.workerId = workerId;
		this.birthDate = birthDate;
		this.cellPhone = cellPhone;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public long getWorkerId() {
		return this.workerId;
	}

	public void setWorkerId(long workerId) {
		this.workerId = workerId;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
