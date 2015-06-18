package com.cffreedom.beans;

/**
 * Original Class: com.cffreedom.beans.Address
 * @author markjacobsen.net (http://markjacobsen.net/code)
 * Copyright: Communication Freedom, LLC - http://www.communicationfreedom.com
 * 
 * Free to use, modify, redistribute.  Must keep full class header including 
 * copyright and note your modifications.
 * 
 * If this helped you out or saved you time, please consider...
 * 1) Donating: http://www.communicationfreedom.com/go/donate/
 * 2) Shoutout on twitter: @MarkJacobsen or @cffreedom
 * 3) Linking to: http://markjacobsen.net
 * 
 * Changes:
 * 2015-06-17	MarkJacobsen.net	Created
 */
public class Address 
{
	private String address;
	private String address2;
	private String city;
	private String state;
	private String zip;
	
	public Address(String address, String city, String state, String zip)
	{
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getAddress() {
		return address;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString()
	{
		return getAddress() + " " + getCity() + ", " + getState() + " " + getZip();
	}
}
