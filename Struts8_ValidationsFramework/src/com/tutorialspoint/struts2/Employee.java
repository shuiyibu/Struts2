/**
 * 
 */
package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author langdylan
 *
 *         Feb 28, 2016 9:44:35 AM
 */
public class Employee extends ActionSupport
{
	private String name;
	private int age;

	@Override
	public String execute() throws Exception
	{
		return SUCCESS;
	}

	@Override
	public void validate()
	{
		if (name == null || "".equals(name.trim()))
		{
			addFieldError("name", "The name is required....");
		}
		if (age < 28 || age > 65)
		{
			addFieldError("age", "Age must be between 28 and 65....");
		}
		super.validate();
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

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

}
