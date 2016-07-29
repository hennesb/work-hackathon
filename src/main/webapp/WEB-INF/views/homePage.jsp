<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title></title>



</head>
<body>

<c:if test="${ featureEnabled }">
   <h1 style="color:green;">Feature is ENABLED</h1>
</c:if>
    
<c:if test="${ !featureEnabled }">
<h1 style="color:red;">  Feature is DISABLED</h1>
 
</c:if>

</body>
</html>






