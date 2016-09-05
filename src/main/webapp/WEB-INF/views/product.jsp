<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"/>
<table>
<c:forEach var="myobj" items="${list}">
<tr>
<td>${myobj.pid}</td>
<td>${myobj.pname}</td>
<td>${myobj.catagory}</td>
<td>${myobj.description}</td>
</tr>
</c:forEach>
</table>
<jsp:include page="footer.jsp"/>