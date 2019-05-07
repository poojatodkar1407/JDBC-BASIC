package com.bridgeit.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created By:Pooja Todkar.
 * Date :06/05/2019.
 * Purpose : BAsic Database connectivity and showing the data on console.
 * 1. import 
 * 2.load & register the driver
 * 3.Create connection
 * 4.create Statement
 * 5.execute the query
 * 6.process the results
 * 7.close
 */

public class ConnectionWithDatabase {
	
	//Database connectivitya
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
	
		Class.forName("com.mysql.jdbc.Driver");  
		System.out.println("entering");
		String url = "jdbc:mysql://localhost:3306/EmployeeDetails";
		String userName = "root";
		String password = "admiN@111";
		
		Connection conn = null;
		System.out.println("entering");

		conn = DriverManager.getConnection(url,userName,password);
			System.out.println("entering");
		 
		 //create the statement for executing sql statements
		 
		 Statement statement = conn.createStatement();
		 
		 ResultSet rs = statement.executeQuery("select * from Detail");
		 


		 System.out.println("ID \tNAME \t CITY");
		 System.out.println("======================");
		 while(rs.next())
		 {
			 System.out.print(rs.getInt("Empid") + "\t" + rs.getString("Empname")+"\t"+rs.getString("Empcity"));
			 System.out.println();
		 }
	}
}
