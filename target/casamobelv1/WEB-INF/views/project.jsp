<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"/>
<table>
<c:forEach var="myobj" items="${list} ">
<tr>
<td>${myobj.ProductId}</td>
<td>${myobj.ProducName}</td>
<td>${myobj.ProductCatagory}</td>
<td>${myobj.ProductDescription}</td>
</tr>
</c:forEach>
</table>
<jsp:include page="footer.jsp"/>