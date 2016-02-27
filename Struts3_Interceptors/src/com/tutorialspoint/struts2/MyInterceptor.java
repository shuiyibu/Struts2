/**
 * 
 */
package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author langdylan
 *
 */
public class MyInterceptor extends AbstractInterceptor
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.opensymphony.xwork2.interceptor.AbstractInterceptor#intercept(com.
	 * opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception
	{
		// TODO Auto-generated method stub
		String output = "Pre-Processing";
		System.out.println(output);

		String result=invocation.invoke();
		
		output = "Post-Precessing";
		System.out.println(output);
		
		return result;
	}

}
