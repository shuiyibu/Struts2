/**
 * 
 */
package com.tutorialspoint.struts2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author langdylan
 *
 */
public class LoginAction extends ActionSupport
{
	private String user;
	private String password;
	private String name;

	@Override
	public String execute() throws Exception
	{
		String ret = ERROR;
		Connection conn = null;
		try
		{
			String url = "jdbc:mysql://localhost/struts_tutorial";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, "root", "");
			String sql = "SELECT name FROM login WHERE";
			sql += " user = ? AND password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
				name = rs.getString("name");
				ret = SUCCESS;
			}
		}
		catch (Exception e)
		{
			ret = ERROR;
		}finally {
			if(conn!=null){
				conn.close();
			}
		}

		return ret;
	}

	/**
	 * @return the user
	 */
	public String getUser()
	{
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(String user)
	{
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

}
