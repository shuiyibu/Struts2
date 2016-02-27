/**
 * 
 */
package com.tutorialspoint.struts2;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * @author langdylan
 *
 */
public class HelloWorldAction extends ActionSupport
{
	private String name;

	public String execute()
	{
		ValueStack stack=ActionContext.getContext().getValueStack();
		Map<String, Object> context=new HashMap<>();
		context.put("key1", new String("This is key1"));
		context.put("key2", new String("This is key2"));
		stack.push(context);
		
		System.out.println("The size of stackValue is: "+stack.size());
		if("SECRET".equals(name)){
			return "success";
		}else{
			return "error";
		}
		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
