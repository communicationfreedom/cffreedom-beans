package com.cffreedom.beans;

public enum DbType
{
	MYSQL("MYSQL"),
	DB2("DB2_JCC"),
	DB2_JCC("DB2_JCC"),
	DB2_APP("DB2_APP"),
	SQL_SERVER("SQL_SERVER"),
	ODBC("ODBC"),
	SQLITE("SQLITE");
	
	public final String value;
	
	DbType(String value){
		this.value = value;
	}
}