package com.training.automation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBReafer {

	//Create Resuable method
	public static String getFirstProduct() throws ClassNotFoundException, SQLException {
		String product = null;
		 
		//load the vendor specific driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Create COnnection to the db
		Connection connection=DriverManager.getConnection("jdbc:mysql://162.253.126.0:3306/mishopp1_shoppingcartqa",
				"mishopp1_tempqa1", "Enex@sGl0ba!");
		
		//Create Statement to write the query
		Statement stmt = connection.createStatement();
		
		//Write the query to execute it
		ResultSet set = stmt.executeQuery("select * from product");
		
		while(set.next()) //here set is ResultSet object and next() is next row in ResultSet
		{
			product=set.getString("name");
			System.out.println("THe product is :" +product);
			System.out.println("The category is : "+set.getString("category"));
			System.out.println("The column number 4 is "+set.getString(4));
			break;
		}
		return product;
		
	}
}
