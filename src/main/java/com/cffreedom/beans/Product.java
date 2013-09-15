package com.cffreedom.beans;

import java.math.BigDecimal;

/**
 * Original Class: com.cffreedom.beans.Product
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
 * 2013-08-22 	markjacobsen.net 	Added some values
 */
public class Product
{
	int id;
	String planCode;
	String name;
	BigDecimal cost;
	BigDecimal setupCost;
	boolean active;
	
	public Product(int id, String planCode, String name, BigDecimal cost, BigDecimal setupCost, boolean active)
	{
		super();
		this.id = id;
		this.planCode = planCode;
		this.name = name;
		this.cost = cost;
		this.setupCost = setupCost;
		this.active = active;
	}
	
	public int getId() { return id; }
	public String getPlanCode() { return planCode; }
	public String getName() { return name; }
	public BigDecimal getCost() { return cost; }
	public BigDecimal getSetupCost() { return setupCost; }
	public boolean getIsActive() { return active; }
}
