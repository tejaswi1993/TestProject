package com.shp.automation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBReader {

	//Create a reusable method
	public static String getFirstProduct() throws SQLException, ClassNotFoundException {
		// Get the dynamic data from database
				String product = null;

				// Step 1:Load the vendor specific driver ,i.e.mysql
				Class.forName("com.mysql.jdbc.Driver");

				// Step 2 : craete the connection
				Connection connection = DriverManager.getConnection("jdbc:mysql://162.253.126.0:3306/mishopp1_shoppingcartqa",
						"mishopp1_tempqa1", "Enex@sGl0ba!");

				// Step 3 :create statement to write the query in it.
				// similar to sql query in datagrip
				Statement stmt = connection.createStatement();

				// Step 4 : write the query and execute it
				ResultSet set = stmt.executeQuery("select * from product");

				while (set.next()) {  //here set is object of ResultSet and next() is your next row in the ResultSet
				
					//But here in this case we want only one row(first row)
					//To get all the rows to be printed, we need to remove "break"
					product = set.getString("name");  //In db, we are taking name column
					System.out.println("The product is :" + product);
					System.out.println("category is "+set.getString("category"));
					System.out.println("The column no 4 is "+set.getString(4));
					break;
				}
				return product;
	}
	
	public static String getExpensiveProduct() throws ClassNotFoundException, SQLException {
		//Step 1 : get the dynamic data from the table
		String product = null;
		
		//Step 2 :load the vendor specific driver i.e mysql
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step 3 : Create connection to teh db
		Connection connection = DriverManager.getConnection("jdbc:mysql://162.253.126.0:3306/mishopp1_shoppingcartqa",
				"mishopp1_tempqa1", "Enex@sGl0ba!");

		//Step 4 :Create statment to write the sql query
		//similar to writing sql query in datagrip
		Statement stmt = connection.createStatement();
		
		//Step 5 : Write the query and execute it
		ResultSet set = stmt.executeQuery("select * from product where price = (select max(price) from product)");
		
		while(set.next()) {
			product = set.getString("name");
			System.out.println("The product is :"+product);
			System.out.println("The category is :"+set.getString("category"));
			break;
		}
		return product;
		
	}
	public static String categoryProductTest() throws ClassNotFoundException, SQLException {
		//Step 1 : get the dynamic data from the table
		
		String product = null;
		
		//step 2 : load  vendor specific driver i.e mysql
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step 3 : Create connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://162.253.126.0:3306/mishopp1_shoppingcartqa",
				"mishopp1_tempqa1", "Enex@sGl0ba!");
		
		//Step 4 : Create statement to write the query
		Statement stmt = connection.createStatement();
		
		//Step 5 : write the query and execute it
		ResultSet set = stmt.executeQuery("select * from product where category = 'crime';");
		 
		while(set.next()) {
			product = set.getString("name");
			System.out.println("The product is :"+product);
			System.out.println("The category is :"+set.getString("category"));
			System.out.println("The column number is :"+set.getString(4));
		}
		return product;
		
	}
}
