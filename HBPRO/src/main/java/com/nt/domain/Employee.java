package com.nt.domain;
// Generated 11 Jan, 2018 3:24:56 PM by Hibernate Tools 5.2.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "EMPLOYEE", schema = "HR")
public class Employee implements java.io.Serializable {

	private long eid;
	private String firstname;
	private String lastname;
	private String email;

	public Employee() {
	}

	public Employee(long eid) {
		this.eid = eid;
	}

	public Employee(long eid, String firstname, String lastname, String email) {
		this.eid = eid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	@Id

	@Column(name = "EID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getEid() {
		return this.eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	@Column(name = "FIRSTNAME", length = 20)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "LASTNAME", length = 20)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "EMAIL", length = 20)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
