/**
 * 
 */
package com.tutorialspoint.struts2;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author langdylan
 *
 *         Feb 27, 2016 2:59:49 PM
 */
public class UploadFile extends ActionSupport
{
	private File myFile;
	private String myFileContentType;
	private String myFileFileName;
	private String destPath;

	@Override
	public String execute() throws Exception
	{
		// TODO Auto-generated method stub
		destPath = "./";
		try
		{
			System.out.println("Src File name: " + myFile);
			System.out.println("Dst File name: " + myFileFileName);

			File destFile = new File(destPath, myFileFileName);
			System.out.println(destFile.getAbsolutePath());
			FileUtils.copyFile(myFile, destFile);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			return ERROR;
		}
		return SUCCESS;
	}

	/**
	 * @return the myFile
	 */
	public File getMyFile()
	{
		return myFile;
	}

	/**
	 * @param myFile the myFile to set
	 */
	public void setMyFile(File myFile)
	{
		this.myFile = myFile;
	}

	/**
	 * @return the myFileContentType
	 */
	public String getMyFileContentType()
	{
		return myFileContentType;
	}

	/**
	 * @param myFileContentType the myFileContentType to set
	 */
	public void setMyFileContentType(String myFileContentType)
	{
		this.myFileContentType = myFileContentType;
	}

	/**
	 * @return the myFileFileName
	 */
	public String getMyFileFileName()
	{
		return myFileFileName;
	}

	/**
	 * @param myFileFileName the myFileFileName to set
	 */
	public void setMyFileFileName(String myFileFileName)
	{
		this.myFileFileName = myFileFileName;
	}

	/**
	 * @return the destPath
	 */
	public String getDestPath()
	{
		return destPath;
	}

	/**
	 * @param destPath the destPath to set
	 */
	public void setDestPath(String destPath)
	{
		this.destPath = destPath;
	}
	
	
}
