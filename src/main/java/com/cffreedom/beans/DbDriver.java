package com.cffreedom.beans;

public enum DbDriver
{
	MYSQL("com.mysql.jdbc.Driver"),
	DB2_JCC("com.ibm.db2.jcc.DB2Driver"),
	DB2_APP("COM.ibm.db2.jdbc.app.DB2Driver"),
	DB2_NET("COM.ibm.db2.jdbc.net.DB2Driver"),
	SQL_SERVER("com.microsoft.sqlserver.jdbc.SQLServerDriver"),
	SQL_SERVER_2000("com.microsoft.jdbc.sqlserver.SQLServerDriver"),
	ODBC("sun.jdbc.odbc.JdbcOdbcDriver"),
	SQLITE("org.sqlite.JDBC");
	
	public final String value;
	
	DbDriver(String value){
		this.value = value;
	}
}
