package com.vs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee {

	private int eid;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "email")
	private String email;
	@Column(name = "phonenumber")
	private String phonenumber;
	@Column(name = "technology")
	private String technology;
	@Column(name = "startdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startdate;
	@Column(name = "enddate")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date enddate;
	@Column(name = "vendorcompany")
	private String vendorcompany;
	@Column(name = "vendorname")
	private String vendorname;
	@Column(name = "vendorphone")
	private String vendorphone;
	@Column(name = "vendoremail")
	private String vendoremail;
	@Column(name = "vendorlocation")
	private String vendorlocation;
	@Column(name = "clientname")
	private String clientname;
	@Column(name = "clientaddress")
	private String clientaddress;
	@Column(name = "rate")
	private float rate;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getVendorcompany() {
		return vendorcompany;
	}

	public void setVendorcompany(String vendorcompany) {
		this.vendorcompany = vendorcompany;
	}

	public String getVendorname() {
		return vendorname;
	}

	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}

	public String getVendorphone() {
		return vendorphone;
	}

	public void setVendorphone(String vendorphone) {
		this.vendorphone = vendorphone;
	}

	public String getVendoremail() {
		return vendoremail;
	}

	public void setVendoremail(String vendoremail) {
		this.vendoremail = vendoremail;
	}

	public String getVendorlocation() {
		return vendorlocation;
	}

	public void setVendorlocation(String vendorlocation) {
		this.vendorlocation = vendorlocation;
	}

	public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public String getClientaddress() {
		return clientaddress;
	}

	public void setClientaddress(String clientaddress) {
		this.clientaddress = clientaddress;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public Employee() {

	}

}
