package com.luisgomezcaballero.springjpademo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long myId;
	private String myString;
	private Date myDate;
	private Float myFloat;

	public MyTable() {
	}

	public MyTable(Long myId, String myString, Date myDate, Float myFloat) {
		super();
		this.myId = myId;
		this.myString = myString;
		this.myDate = myDate;
		this.myFloat = myFloat;
	}

	public Long getMyId() {
		return myId;
	}

	public void setMyId(Long myId) {
		this.myId = myId;
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

	public Date getMyDate() {
		return myDate;
	}

	public void setMyDate(Date myDate) {
		this.myDate = myDate;
	}

	public Float getMyFloat() {
		return myFloat;
	}

	public void setMyFloat(Float myFloat) {
		this.myFloat = myFloat;
	}

	@Override
	public String toString() {
		return "MyTable [myId=" + myId + ", myString=" + myString + ", myDate=" + myDate + ", myFloat=" + myFloat + "]";
	}

}
