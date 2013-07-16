package com.cffreedom.beans;

/**
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
 * 
 * Changes
 * 2013-05-23 	markjacobsen.net 	Added setUser() and setPassword()
 * 2013-06-25 	markjacobsen.net 	Added option to create the bean with driver/url info
 * 2013-07-15 	markjacobsen.net 	Added JNDI string
 */
public class DbConn
{
	String type = null;
	String host = null;
	String db = null;
	int port = 0;
	String user = null;
	String pass = null;
	String driver = null;
	String url = null;
	String jndi = null;
	
	public DbConn(String jndi)
	{
		this.jndi = jndi;
	}
	
	public DbConn(String driver, String url, String type, String host, String db, int port)
	{
		this(driver, url, null, null);
		this.type = type;
		this.host = host;
		this.db = db;
		this.port = port;
	}
	
	public DbConn(String driver, String url, String user, String pass)
	{
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pass = pass;
	}
	
	public String getType() { return this.type; }
	public String getHost() { return this.host; }
	public String getDb() { return this.db; }
	public int getPort() { return this.port; }
	public String getUser() { return this.user; }
	public String getPassword() { return this.pass; } 
	public String getDriver() { return this.driver; }
	public String getUrl() { return this.url; }
	public String getJndi() { return this.jndi; }
	
	public void setUser(String s) { this.user = s; }
	public void setPassword(String s) { this.pass = s; }
	public void setJndi(String s) { this.jndi = s; }
}
