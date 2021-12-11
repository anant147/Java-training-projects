package org.hibernate;
// Generated Aug 6, 2021, 12:56:23 PM by Hibernate Tools 5.4.30.Final

/**
 * EmployeeDataEmailgroupId generated by hbm2java
 */
public class EmployeeDataEmailgroupId implements java.io.Serializable {

	private int membersId;
	private int emailGroupsId;

	public EmployeeDataEmailgroupId() {
	}

	public EmployeeDataEmailgroupId(int membersId, int emailGroupsId) {
		this.membersId = membersId;
		this.emailGroupsId = emailGroupsId;
	}

	public int getMembersId() {
		return this.membersId;
	}

	public void setMembersId(int membersId) {
		this.membersId = membersId;
	}

	public int getEmailGroupsId() {
		return this.emailGroupsId;
	}

	public void setEmailGroupsId(int emailGroupsId) {
		this.emailGroupsId = emailGroupsId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmployeeDataEmailgroupId))
			return false;
		EmployeeDataEmailgroupId castOther = (EmployeeDataEmailgroupId) other;

		return (this.getMembersId() == castOther.getMembersId())
				&& (this.getEmailGroupsId() == castOther.getEmailGroupsId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMembersId();
		result = 37 * result + this.getEmailGroupsId();
		return result;
	}

}