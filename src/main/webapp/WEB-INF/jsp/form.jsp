<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<body>
	<form action="<%=request.getContextPath()%>/sendform" method="post">
		<label for="nombre">Nombre</label> <input type="text" name="nombre"
			id="nombre">
		<button type="submit">Enviar</button>
	</form>
</body>