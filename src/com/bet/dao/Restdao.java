package com.bet.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bet.model.User;





public class Restdao {
	public  Connection getconnection() {
		   
 
    Connection conn = null;
    try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   

    
    try {
        // connect way #1
        /*String url1 = "jdbc:mysql://58.68.10.75:3306/dtsdb01";
        String user = "dts";
        String password = "daemon@123";*/
    	
    	String url1 = "jdbc:mysql://192.168.1.228:3306/betting";
        String user = "ezload";
        String password = "passpass";
        conn = DriverManager.getConnection(url1, user, password);
        if (conn != null) {
            System. out.println("Connected to the database test1");
            return conn;
        }
        
        
        // connect way #2
    // conn.close();
    } catch (SQLException ex) {
        System.out.println("An error occurred. Maybe user/password is invalid");
        ex.printStackTrace();
    }
	return conn;

	 } 

	public  int register(User user){
		Statement stmt = null;
	    /*String query ="INSERT INTO user (Frstname, username, lastname, email, password) VALUES " +
	    		"("+user.getFirstName()+","+user.getUsername()+"" +
	    				","+user.getLastName()+","+user.getEmail()+","+user.getPassword()+")";
	    	System.out.println(query);
	    int acc =0;   
*/int rs = 0 ;
	    try {
	        /*stmt = getconnection().createStatement();
	         rs = stmt.executeUpdate(query);
	        System.out.println(rs);
	        stmt.close();*/
	    	PreparedStatement ps=getconnection().prepareStatement
	                  ("insert into user (Frstname, username, lastname, email, password)  values(?,?,?,?,?)");

	        ps.setString(1, user.getFirstName());
	        ps.setString(2, user.getUsername());
	        ps.setString(3, user.getLastName());
	        ps.setString(4, user.getEmail());
	        ps.setString(5, user.getPassword());
	        rs = ps.executeUpdate();
	    }
	    catch(Exception e){
	    	System.out.println("Exception"+e);

	    }
	    return rs;
	}
	
	public  int login(String username,String password){
		Statement stmt = null;
	    String query ="select * from user where username='"+username+"' and password='"+password+"'";
	    	System.out.println(query);
	    int acc =0;   

	    try {
	        stmt = getconnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        System.out.println(rs);
	        while(rs.next())
	        {
	        	System.out.println(rs.getInt(1));
	        acc=rs.getInt(1);
	        }
	        stmt.close();
	    	
	    }
	    catch(Exception e){
	    	System.out.println("Exception"+e);

	    }
	    return acc;
	}
	
	
	
	        	
	
}

