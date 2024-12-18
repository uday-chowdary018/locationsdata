<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h3><b>LOCATIONS:</b></h3>
 <table>
 <tr>
 <th>id</th>
 <th>code</th>
 <th>name</th>
 <th>type</th>
 </tr>
 
 
 <c:forEach items="${lists}" var="list">
 <tr>
 <td>${list.id}</td>
 <td>${list.code}</td>
 <td>${list.name}</td>
 <td>${list.type}</td>
 <td><a href="showUpdate?id=${list.id}">edit</a></td>
 <td><a href="deleteLocation?id=${list.id}">delete</a></td>
 </tr>
 </c:forEach>
 
  </table>
<a href="showCreate"> Add Location</a>
 
 
 

</body>
</html>




