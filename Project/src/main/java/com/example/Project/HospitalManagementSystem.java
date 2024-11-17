package com.example.Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//This class is used to get connection with DB
public class HospitalManagementSystem {

	static public Connection getConnection() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/hospital";
	   return DriverManager.getConnection(url,"root","sani@npk23");	
	}
	
}