<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Upload File</title>
</head>
<body>
	<form action="upload" method="post" enctype="multipart/form-data">
		<label for="myFile">Upload your file</label> 
		<input type="file" name="myFile" /><br>
		<input type="submit" value="Upload"/>
	</form>
</body>
</html>