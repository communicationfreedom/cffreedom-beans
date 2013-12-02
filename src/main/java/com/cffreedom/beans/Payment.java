package com.cffreedom.beans;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Original Class: com.cffreedom.beans.Payment
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
public class Payment
{
	private Date paymentDate = null;
	private String paymentCode = null;
	private String customerCode = null;
	private String memo = null;
	private String currency = "usd";
	private BigDecimal gross = BigDecimal.ZERO;
	private BigDecimal fees = BigDecimal.ZERO;
	private boolean paid = false;
	private boolean refunded = false;
	
	public Date getPaymentDate()
	{
		return paymentDate;
	}
	public String getPaymentCode()
	{
		return paymentCode;
	}
	public String getCustomerCode()
	{
		return customerCode;
	}
	public String getMemo()
	{
		return memo;
	}
	public String getCurrency()
	{
		return currency;
	}
	public BigDecimal getGross()
	{
		return gross;
	}
	public BigDecimal getFees()
	{
		return fees;
	}
	public boolean isPaid()
	{
		return paid;
	}
	public boolean isRefunded()
	{
		return refunded;
	}
	
	public void setPaymentDate(Date paymentDate)
	{
		this.paymentDate = paymentDate;
	}
	public void setPaymentCode(String paymentCode)
	{
		this.paymentCode = paymentCode;
	}
	public void setCustomerCode(String customerCode)
	{
		this.customerCode = customerCode;
	}
	public void setMemo(String memo)
	{
		this.memo = memo;
	}
	public void setCurrency(String currency)
	{
		this.currency = currency;
	}
	public void setGross(BigDecimal gross)
	{
		this.gross = gross;
	}
	public void setFees(BigDecimal fees)
	{
		this.fees = fees;
	}
	public void setPaid(boolean paid)
	{
		this.paid = paid;
	}
	public void setRefunded(boolean refunded)
	{
		this.refunded = refunded;
	}
}
