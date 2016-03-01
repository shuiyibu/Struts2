<<<<<<< HEAD
=======
# Struts2

>>>>>>> origin/master
# Basic MVC Architecture

# Struts 2 Overview

# Environment Setup

# Architecture

# Example

## Create Action Class:
>Simply saying for for each URL, you would have to implement one action class and either you can use that class name directly as your action name or you can map to some other name using struts.xml file as shown below.

## Create a Dynamic Web Project:
<<<<<<< HEAD

commons-fileupload-x.y.z.jar

commons-io-x.y.z.jar

commons-lang-x.y.jar

commons-lang3-x.y.jar

commons-logging-x.y.z.jar

commons-logging-api-x.y.jar

freemarker-x.y.z.jar

javassist-.xy.z.GA

ognl-x.y.z.jar

struts2-core-x.y.z.jar

xwork-core.x.y.z.jar

>commons-lang3-x.y.jar

## Enable Detailed Log:

# Configuration Files

## The web.xml file
As discussed earlier, this file provides an entry point for any web application. The entry point of Struts2 application will be a filter defined in deployment descriptor (web.xml). Hence we will define an entry of FilterDispatcher class in web.xml. The web.xml file needs to be created under the folder WebContent/WEB-INF.

## The struts.xml file
> Struts.xml file can grow big over time and so breaking it by packages is one way of modularizing it, but struts offers another way to modularize the struts.xml file. You could split the file into multiple xml files and import them in the following fashion.

## The struts-config.xml file

## The struts.properties file
>This configuration file provides a mechanism to change the default behavior of the framework. Actually all of the properties contained within the struts.properties configuration file can also be configured in the web.xml using the init-param, as well using the constant tag in the struts.xml configuration file. But if you like to keep the things separate and more struts specific then you can create this file under the folder WEB-INF/classes.

# Actions
=======
>>>>>>> origin/master


# Results & Result Types
> Struts allow you to use other markup languages for the view technology to present the results and popular choices include Velocity, Freemaker, XSLT and Tiles.

# Value Stack/OGNL

## The OGNL
>OGNL is based on the idea of having a root or default object within the context. The properties of the default or root object can be referenced using the markup notation, which is the ```pound symbol```.

>Objects in the ActionContext are referred using the pound symbol, however, the objects in the value stack can be directly referenced, for example if employee is a property of an action class then it can ge referenced as follows:
```
<s:property value="name"/>
```
instead of
```
<s:property value="#name"/>
```
If you have an attribute in session called "login" you can retrieve it as follows:
```
<s:property value="#session.login"/>
```
OGNL also supports dealing with collections - namely Map, List and Set. For example to display a dropdown list of colors, you could do:
```
<s:select name="color" list="{'red','yellow','green'}" />
```

# File Uploads
> Note that servers may have a security policy in place that prohibits you from writing to directories other than the temporary directory and the directories that belong to your web application.

## Configuration files
Following are the Struts2 configuration properties that control file uploading process:

SN|	Properties & Description
:--:|--
1	|**struts.multipart.maxSize**<BR>The maximum size (in bytes) of a file to be accepted as a file upload. Default is 250M.
2	|**struts.multipart.parser**<BR>The library used to upload the multipart form. By default is jakarta
3	|**struts.multipart.saveDir**<BR>The location to store the temporary file. By default is javax.servlet.context.tempdir.

In order to change any of theses settings you can use constant tag in your applications struts.xml file, as I did to change the maximum size of a file to be uploaded. Let us have our struts.xml as follows:
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE struts PUBLIC
"-//Apache Software Foundation//DTD Struts Configuration 2.0//EN"
"http://struts.apache.org/dtds/struts-2.0.dtd">

<struts>
   <constant name="struts.devMode" value="true" />
   <constant name="struts.multipart.maxSize" value="1000000" />

   <package name="helloworld" extends="struts-default">
   <action name="upload" class="com.tutorialspoint.struts2.uploadFile">
       <result name="success">/success.jsp</result>
       <result name="error">/error.jsp</result>
   </action>
   </package>
</struts>
```

# Validations Framework

### Q&A
[Why is struts validation not working for me?](http://stackoverflow.com/questions/2298999/why-is-struts-validation-not-working-for-me#)
```
Caused by: java.io.FileNotFoundException: http://www.opensymphony.com/xwork/xwork-validator-1.0.2.dtd
```
---
# Localization, internationalization (i18n)

`localization`
- The UI Tags
- Messages and Errors.
- Within action classes.

`translation or localization enablement`

## Resource Bundles
>Resource bundles are the file that contains the key/value pairs for the default language of your application.

## Access the messages
Need to create following two actions.
- First action a to take care of Locale and display same index.jsp file with different language
- Another action is to take care of submitting form itself. Both the actions will return SUCCESS, but we will take different actions based on return values because our purpose is different for both the actions:

------

# Type Conversion
By default
- Integer, Float, Double, - -Decimal
- Date and Datetime
- Arrays and Collections
- Enumerations
- Boolean
- BigDecimal


# Themes & Templates
Because it is not very much practical to use themes on per tag basis, so simply we can specify the rule in struts.properties file using the following tags:
```
# Standard UI theme
struts.ui.theme=xhtml
# Directory where theme template resides
struts.ui.templateDir=template
# Sets the default template type. Either ftl, vm, or jsp
struts.ui.templateSuffix=ftl
```

# Exception Handling
Let us modify the struts.xml as follows:
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE struts PUBLIC
   "-//Apache Software Foundation//DTD Struts Configuration 2.0//EN"
   "http://struts.apache.org/dtds/struts-2.0.dtd">
<struts>
<constant name="struts.devMode" value="true" />
   <package name="helloworld" extends="struts-default">

      <action name="hello"
         class="com.tutorialspoint.struts2.HelloWorldAction"
         method="execute">
         <exception-mapping exception="java.lang.NullPointerException"
         result="error" />
         <result name="success">/HelloWorld.jsp</result>
         <result name="error">/Error.jsp</result>
      </action>

   </package>
</struts>

```
-------
 # Annotations
