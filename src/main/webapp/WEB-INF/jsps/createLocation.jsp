<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Location</title>
</head>
<body>

<form action="saveLoc" method="post">
<pre>
Id:<input type="text" name="id" id=""/>
Code:<input type="text" name="code" id=""/>
Name:<input type="text" name="name" id=""/>
Type:Urban<input type="checkbox" name="type" id="" value="Urban"/>
     Rural<input type="checkbox" name="type" id="" value="Rural"/>
<input type="submit" value="save"/>
</pre> 
</form>
${msg}

<a href="displayLocation">View All</a>

</body>
</html>