package com.cffreedom.beans;

/**
 * Original Class: com.cffreedom.beans.User
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
public class User
{
	private int id = 0;
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	
	public User(int id, String username, String firstName, String lastName, String email)
	{
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}

	public String getEmail()
	{
		return this.email;
	}
}
