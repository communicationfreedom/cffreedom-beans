package com.cffreedom.beans;

import java.util.List;
import java.util.Map;

/**
 * Original Class: com.cffreedom.beans.Response
 * General purpose response object for holding multiple types of data 
 * about a response/return code (ex: int code, String message, etc)
 * 
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
 * Changes:
 * 2013-06-25 	markjacobsen.net	Created
 */
public class Response 
{
	public enum ErrorLevel {DEBUG, INFO, WARN, ERROR, FATAL};
	
	private ErrorLevel errorLevel = null;
	private boolean booleanCode = false;
	private int intCode = 0;
	private String stringCode = null;
	private String message = null;
	private String detail = null;
	private Map<String, List<String>> headers = null;
	
	public Response(ErrorLevel errorLevel, boolean booleanCode, int intCode, String stringCode, String message, String detail)
	{
		this.errorLevel = errorLevel;
		this.booleanCode = booleanCode;
		this.intCode = intCode;
		this.stringCode = stringCode;
		this.message = message;
		this.detail = detail;
	}
	
	public Response(boolean booleanCode, int intCode, String stringCode, String message, String detail)
	{
		this.booleanCode = booleanCode;
		this.intCode = intCode;
		this.stringCode = stringCode;
		this.message = message;
		this.detail = detail;
	}

	public Response(ErrorLevel errorLevel, String message, String detail)
	{
		this.errorLevel = errorLevel;
		this.message = message;
		this.detail = detail;
	}

	public Response(int intCode, String message, String detail)
	{
		this.intCode = intCode;
		this.message = message;
		this.detail = detail;
	}
	
	public Response(boolean booleanCode, String message, String detail)
	{
		this.booleanCode = booleanCode;
		this.message = message;
		this.detail = detail;
	}
	
	public Response(String stringCode, String message, String detail)
	{
		this.stringCode = stringCode;
		this.message = message;
		this.detail = detail;
	}
	
	public String getErrorLevelString()
	{
		if (this.getErrorLevel() == null) { return "UNKNOWN"; }
		else if (this.getErrorLevel().compareTo(ErrorLevel.DEBUG) == 0) { return "DEBUG"; }
		else if (this.getErrorLevel().compareTo(ErrorLevel.INFO) == 0) { return "INFO"; }
		else if (this.getErrorLevel().compareTo(ErrorLevel.WARN) == 0) { return "WARN"; }
		else if (this.getErrorLevel().compareTo(ErrorLevel.ERROR) == 0) { return "ERROR"; }
		else if (this.getErrorLevel().compareTo(ErrorLevel.FATAL) == 0) { return "FATAL"; }
		else { return "UNKNOWN"; }
	}

	public ErrorLevel getErrorLevel() {
		return errorLevel;
	}

	public void setErrorLevel(ErrorLevel errorLevel) {
		this.errorLevel = errorLevel;
	}

	public boolean getBooleanCode() {
		return booleanCode;
	}

	public void setBooleanCode(boolean booleanCode) {
		this.booleanCode = booleanCode;
	}

	public int getIntCode() {
		return intCode;
	}

	public void setIntCode(int intCode) {
		this.intCode = intCode;
	}

	public String getStringCode() {
		return stringCode;
	}

	public void setStringCode(String stringCode) {
		this.stringCode = stringCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public Map<String, List<String>> getHeaders() {
		return headers;
	}
	
	public void setHeaders(Map<String, List<String>> headers) {
		this.headers = headers;
	}
	
}
