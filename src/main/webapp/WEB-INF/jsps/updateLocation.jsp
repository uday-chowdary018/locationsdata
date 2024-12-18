<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Location</title>
</head>
<body>

<form action="updateLoc" method="post">
<pre>
Id:<input type="text" name="id" value=${location.id} readonly id=""/>
Code:<input type="text" name="code" value=${location.code} id=""/>
Name:<input type="text" name="name"  value=${location.name}  id=""/>
Type:Urban<input type="checkbox" name="type" id="" value="Urban" ${location.type=='Urban'? 'checked':''}/>
     Rural<input type="checkbox" name="type" id="" value="Rural" ${location.type=='Rural'? 'checked':''}/>
<input type="submit" value="save"/>
</pre> 
</form>


</body>
</html>