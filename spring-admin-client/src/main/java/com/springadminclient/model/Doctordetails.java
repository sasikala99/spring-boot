package com.springadminclient.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctordetails")
public class Doctordetails implements Serializable {
	@Id
	private String doctorid;
	private String firstname;
	private String lastname;
	private String presentemail;
	private String department;
	private String address;
	
	public Doctordetails() {
	}
	public Doctordetails(String doctorid, String firstname, String lastname, String presentemail, String department,
			String address) {
		this.doctorid = doctorid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.presentemail = presentemail;
		this.department = department;
		this.address = address;
	}
	public String getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPresentemail() {
		return presentemail;
	}
	public void setPresentemail(String presentemail) {
		this.presentemail = presentemail;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((doctorid == null) ? 0 : doctorid.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((presentemail == null) ? 0 : presentemail.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctordetails other = (Doctordetails) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (doctorid == null) {
			if (other.doctorid != null)
				return false;
		} else if (!doctorid.equals(other.doctorid))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (presentemail == null) {
			if (other.presentemail != null)
				return false;
		} else if (!presentemail.equals(other.presentemail))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Doctordetails [doctorid=" + doctorid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", presentemail=" + presentemail + ", department=" + department + ", address=" + address + "]";
	}
}
