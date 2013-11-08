package com.cffreedom.beans;

public enum DbType
{
	MYSQL("MYSQL"),
	DB2("DB2"),
	SQL_SERVER("SQL_SERVER"),
	ODBC("ODBC"),
	SQLITE("SQLITE");
	
	public final String value;
	
	DbType(String value){
		this.value = value;
	}
}
