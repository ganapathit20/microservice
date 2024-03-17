package com.startup.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "e_no")
	private int eNo;
	
	@Column(name = "e_name")
	private String eName;
	
	@Column(name = "e_mobile_number")
	private int eMobileNumber;
	
	@Column(name = "e_age")
	private int eAge;
	
	@Column(name = "e_address")
	private String eAddress;
	
	public Employee() {}

	public int geteNo() {
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteMobileNumber() {
		return eMobileNumber;
	}

	public void seteMobileNumber(int eMobileNumber) {
		this.eMobileNumber = eMobileNumber;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	public String geteAddress() {
		return eAddress;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

}
