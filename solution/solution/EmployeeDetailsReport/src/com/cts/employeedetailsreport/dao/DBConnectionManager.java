package com.cts.employeedetailsreport.dao;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cts.employeedetailsreport.exception.InvalidEmployeeNumberException;


public class DBConnectionManager {
	public static final String PROPERTY_FILE = "database.properties";
	public static final String DRIVER = "drivername";
	public static final String URL = "url";
	public static final String USER_NAME = "username";
	public static final String PASSWORD = "password";
	private static Properties props = null;



	 private static Connection con = null;
	 private static DBConnectionManager instance;
	public  DBConnectionManager()  throws InvalidEmployeeNumberException
	{
		FileInputStream fis=null;
		
		try {
			fis = new FileInputStream(PROPERTY_FILE);
			props = new Properties();
			props.load(fis);
		Class.forName(props.getProperty(DRIVER));
		DBConnectionManager.con =
		DriverManager.getConnection(props.getProperty(URL),
		props.getProperty(USER_NAME),
		props.getProperty(PASSWORD));
		} catch (ClassNotFoundException ex) {

			throw new InvalidEmployeeNumberException();
			} catch (SQLException e) {
			throw new InvalidEmployeeNumberException();
			}
		catch (FileNotFoundException e) {

			throw new InvalidEmployeeNumberException();
			} catch (IOException e) {
				throw new InvalidEmployeeNumberException();
			} 
		finally {
			if (fis != null) {
			try {
			fis.close();
			} catch (IOException e) {
				throw new InvalidEmployeeNumberException();

			}
			}
			}

		//Class.forName(com.mysql.cj.jdbc.Driver);
		//FILL THE CODE HERE
	}
	public static DBConnectionManager getInstance() throws InvalidEmployeeNumberException {
		//FILL THE CODE HERE

		return instance;
	}
	public Connection getConnection() {
		return con;
	}
}
