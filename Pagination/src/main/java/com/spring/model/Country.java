package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int cid;
	
	@Column
	String cname;
	
	@Column
	String ccapital;
	
	
	
	public Country() {}
	public Country(int cid, String cname, String ccapital) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccapital = ccapital;
	}
	public Country(String cname, String ccapital) {
		super();
		this.cname = cname;
		this.ccapital = ccapital;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcapital() {
		return ccapital;
	}
	public void setCcapital(String ccapital) {
		this.ccapital = ccapital;
	}
	

}
