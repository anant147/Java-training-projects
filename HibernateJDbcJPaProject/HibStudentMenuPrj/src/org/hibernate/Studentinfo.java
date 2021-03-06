package org.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Generated Aug 6, 2021, 2:51:06 PM by Hibernate Tools 5.4.30.Final

/**
 * Studentinfo generated by hbm2java
 */

@Entity
@Table(name = "studentinfo")
public class Studentinfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private Integer fees;
	private String course;
	private String result;

	public Studentinfo() {
	}

	public Studentinfo(int id) {
		this.id = id;
	}

//	public Studentinfo(int id, String name, Integer fees, String course, String result) {
//		this.id = id;
//		this.name = name;
//		this.fees = fees;
//		this.course = course;
//		this.result = result;
//	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFees() {
		return this.fees;
	}

	public void setFees(Integer fees) {
		this.fees = fees;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "Studentinfo [id=" + id + ", name=" + name + ", fees=" + fees + ", course=" + course + ", result="
				+ result + "]";
	}
}
