package com.cffreedom.beans;

/**
 * Original Class: com.cffreedom.beans.PhoneNumber
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
public class PhoneNumber
{
	private String e164 = ""; // http://en.wikipedia.org/wiki/E.164
	private String display = "";
	private String isoCountry = ""; 
	
	public PhoneNumber(){}
	
	public PhoneNumber(String e164, String display, String isoCountry)
	{
		this.e164 = e164;
		this.display = display;
		this.isoCountry = isoCountry;
	}
	
	public void setE164(String s) { this.e164 = s; }
	public void setCode(String s) { this.setE164(s); }
	public void setDisplay(String s) { this.display = s; }
	public void setIsoCountry(String s) { this.isoCountry = s; }
	
	public String getE164() { return this.e164; }
	public String getCode() { return this.getE164(); }
	public String getDisplay() { return this.display; }
	public String getIsoCountry() { return this.isoCountry; }
}
