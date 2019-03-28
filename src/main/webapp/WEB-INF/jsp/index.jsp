<%@taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Enter your name</title>
</head>
<body>
<stripes:form beanclass="com.zetcode.action.HelloActionBean">
    <stripes:errors/>
    Enter your name:
    <stripes:text name="userName"/>
    <stripes:submit name="save" value="Submit"/>
</stripes:form>
</body>
</html>