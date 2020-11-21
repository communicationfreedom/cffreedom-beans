package com.cffreedom.beans;

import java.util.Date;

/**
 * Original Class: com.cffreedom.beans.EmailMessage
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
 * 2013-05-07 	markjacobsen.net 	Additional constructor
 * 2013-10-05	markjacobsen.net 	Added setters
 * 2015-02-10   markjacobsen.net    Added fromName
 * 2020-11-21 	markjacobsen.net 	Added messageId and inReplyTo
 */
public class EmailMessage
{
	private String from;
	private String fromName;
	private String replyTo;
	private String to;
	private String cc;
	private String bcc;
	private String subject;
	private String body;
	private String bodyHtml;
	private Date msgDate;
	private int msgId;
	private String messageId;
	private String inReplyTo;
	private String msgHeaders;
	private String[][] attachments;
	
	public EmailMessage(String from, String replyTo, String to, String cc, String subject, String body, String bodyHtml, Date msgDate, int msgId, String headers)
	{
		super();
		this.from = from;
		this.replyTo = replyTo;
		this.to = to;
		this.cc = cc;
		this.subject = subject;
		this.body = body;
		this.bodyHtml = bodyHtml;
		this.msgDate = msgDate;
		this.msgId = msgId;
		this.msgHeaders = headers;
	}
	
	/**
	 * Useful for creating objects to pass to getMailtoLink()
	 * @param to
	 * @param cc
	 * @param bcc
	 * @param subject
	 * @param body
	 */
	public EmailMessage(String to, String cc, String bcc, String subject, String body)
	{
		super();
		this.to = to;
		this.cc = cc;
		this.bcc = bcc;
		this.subject = subject;
		this.body = body;
	}
	
	/**
	 * @param to
	 * @param from
	 * @param subject
	 * @param body
	 */
	public EmailMessage(String to, String from, String subject, String body)
	{
		super();
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.body = body;
	}
	
	public void setFrom(String s) { this.from = s; }
	public void setFromName(String s) { this.fromName = s; }
	public void setReplyTo(String s) { this.replyTo = s; }
	public void setTo(String s) { this.to = s; }
	public void setCc(String s) { this.cc = s; }
	public void setBcc(String s) { this.bcc = s; }
	public void setSubject(String s) { this.subject = s; }
	public void setBody(String s) { this.body = s; }
	public void setBodyHtml(String s) { this.bodyHtml = s; }
	public void setAttachments(String[][] s) { this.attachments = s; }
	public void setMessageId(String s) { this.messageId = s; }
	public void setInReplyTo(String s) { this.inReplyTo = s; }
	
	public String getFrom() { return this.from; }
	public String getFromName() { return this.fromName; }
	public String getReplyTo() { return this.replyTo; }
	public String getTo() { return this.to; }
	public String getCc() { return this.cc; }
	public String getBcc() { return this.bcc; }
	public String getSubject() { return this.subject; }
	public String getBody() { return this.body; }
	public String getBodyHtml() { return this.bodyHtml; }
	public String[][] getAttachments() { return this.attachments; }
	public Date getDate() { return this.msgDate; }
	public int getId() { return this.msgId; }
	public String getMessageId() { return this.messageId; }
	public String getInReplyTo() { return this.inReplyTo; }
	public String getHeaders() { return this.msgHeaders; }
}
