package com.cffreedom.beans;

/**
 * Original Class: com.cffreedom.beans.Contact
 * @author markjacobsen.net (http://mjg2.net/code)
 * Copyright: Communication Freedom, LLC - http://www.communicationfreedom.com
 * 
 * Free to use, modify, redistribute.  Must keep full class header including 
 * copyright and note your modifications.
 * 
 * If this helped you out or saved you time, please consider...
 * 1) Donating: http://www.communicationfreedom.com/go/donate/
 * 2) Shoutout on twitter: @MarkJacobsen or @cffreedom
 * 3) Linking to: http://visit.markjacobsen.net
 */
public class Contact
{
	private String fullName;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	private String shippingAddress;
	private String shippingCity;
	private String shippingState;
	private String shippingPostalCode;
	
	public String getFullName() { return this.fullName; }
	public String getFirstName() { return this.firstName; }
	public String getLastName() { return this.lastName; }
	public String getEmail() { return this.email; }
	public String getPhoneNumber() { return this.phoneNumber; }
	public String getAddress() { return this.address; }
	public String getCity() { return this.city; }
	public String getState() { return this.state; }
	public String getPostalCode() { return this.postalCode; }
	public String getShippingAddress() { return this.shippingAddress; }
	public String getShippingCity() { return this.shippingCity; }
	public String getShippingState() { return this.shippingState; }
	public String getShippingPostalCode() { return this.shippingPostalCode; }
	
	public void setFullName(String fullName) { this.fullName = fullName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public void setEmail(String email) { this.email = email; }
	public void setPhoneNumber(String s) { this.phoneNumber = s; }
	public void setAddress(String s) { this.address = s; }
	public void setCity(String s) { this.city = s; }
	public void setState(String s) { this.state = s; }
	public void setPostalCode(String s) { this.postalCode = s; }
	public void setShippingAddress(String s) { this.shippingAddress = s; }
	public void setShippingCity(String s) { this.shippingCity = s; }
	public void setShippingState(String s) { this.shippingState = s; }
	public void setShippingPostalCode(String s) { this.shippingPostalCode = s; }
}
