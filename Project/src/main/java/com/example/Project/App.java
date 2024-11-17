
package com.example.Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println( "Hello World!" );
    	String url="jdbc:mysql://localhost:3306/user";
       
        try {
			Connection con=DriverManager.getConnection(url,"root","sani@npk23");
			System.out.println("connected Successfully..");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
