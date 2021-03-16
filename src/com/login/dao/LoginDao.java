package com.login.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class LoginDao 
{
	public boolean check(String user,String pass) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/firstspring","root","root");
		PreparedStatement st=(PreparedStatement) con.prepareStatement("select*from login where user=? and pass=?");
		st.setString(1,user); 
		st.setString(2,pass);
		ResultSet rs=(ResultSet) st.executeQuery();
		if(rs.next())
		{
			return true;
		}
		return false;
		
	}
	
}
