<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<body>
	<form action="<%=request.getContextPath()%>/calcular" method="post">
		<label for="nombre">Operador 1</label> <input type="text" name="ope_1"
			id="ope_1"> <label for="nombre">Operador 2</label> <input
			type="text" name="ope_2" id="ope_2">
		<button type="submit">Enviar</button>
	</form>
</body>