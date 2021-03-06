package org.hibernate;
// Generated Aug 6, 2021, 12:56:23 PM by Hibernate Tools 5.4.30.Final

import java.io.Serializable;
import java.util.Date;

/**
 * Accesscard generated by hbm2java
 */
public class Accesscard implements java.io.Serializable {

	private int id;
	private String firmwareVersion;
	private Serializable isActive;
	private Date issuedDate;

	public Accesscard() {
	}

	public Accesscard(int id, Serializable isActive) {
		this.id = id;
		this.isActive = isActive;
	}

	public Accesscard(int id, String firmwareVersion, Serializable isActive, Date issuedDate) {
		this.id = id;
		this.firmwareVersion = firmwareVersion;
		this.isActive = isActive;
		this.issuedDate = issuedDate;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirmwareVersion() {
		return this.firmwareVersion;
	}

	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	public Serializable getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Serializable isActive) {
		this.isActive = isActive;
	}

	public Date getIssuedDate() {
		return this.issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

}
