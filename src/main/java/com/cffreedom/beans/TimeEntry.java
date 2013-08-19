package com.cffreedom.beans;

import java.util.Date;

/**
 * Original Class: com.cffreedom.beans.TimeEntry
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
 * 2013-08-19 	markjacobsen.net 	Created
 */
public class TimeEntry 
{
	private Container project;
	private Container task;
	private Date start;
	private Date end;
	private String notes;
	
	public TimeEntry(Container project, Container task, Date start, Date end, String notes)
	{
		this.project = project;
		this.task = task;
		this.start = start;
		this.end = end;
		this.notes = notes;
	}
	
	public Container getProject() {
		return project;
	}
	
	public Container getTask() {
		return task;
	}

	public Date getStart() {
		return start;
	}

	public Date getEnd() {
		return end;
	}

	public String getNotes() {
		return notes;
	}
}
