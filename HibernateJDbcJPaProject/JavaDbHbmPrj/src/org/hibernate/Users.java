package org.hibernate;
// Generated Aug 6, 2021, 12:56:23 PM by Hibernate Tools 5.4.30.Final

/**
 * Users generated by hbm2java
 */
public class Users implements java.io.Serializable {

	private Integer userId;
	private String username;
	private String password;
	private String fullname;
	private String email;

	public Users() {
	}

	public Users(String username, String password, String fullname, String email) {
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}