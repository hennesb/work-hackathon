<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<style>
div.container {
    width: 100%;
    border: 1px solid gray;
}

header, footer {
    padding: 1em;
    color: white;
    background-color: black;
    clear: left;
    text-align: center;
}

nav {
    float: left;
    max-width: 160px;
    margin: 0;
    padding: 1em;
}

nav ul {
    list-style-type: none;
    padding: 0;
}
   
nav ul a {
    text-decoration: none;
}

article {
    margin-left: 170px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}
</style>
</head>
<body>

<div class="container">

<header>
   <h1>Dublin City</h1>
</header>
  
<nav>
  <ul>
    <li><a href="#">Dublin</a></li>
    <li><a href="#">Galway</a></li>
    <li><a href="#">Cork</a></li>
  </ul>
</nav>

<article>
  <h1>Welcome to Dublin</h1>
</article>

<h2>Please Enter Your Details: </h2>
<form:form method="POST" action="${pageContext.request.contextPath}/app/content-post-analysis" modelAttribute="analysis">
   <table>
    <tr>
        <td><form:label path="fname">Fname</form:label></td>
        <td><form:input path="fname" /></td>
    </tr>
    <tr>
        <td><form:label path="lname">Lname</form:label></td>
        <td><form:input path="lname" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
<%-- <form action="#" th:action="@{/app/content-post-analysis}" th:object="${contentAnalysis}" method="post"> --%>
<!--     	<p>Fname: <input type="text" th:field="*{fname}" /></p> -->
<!--         <p>Lname: <input type="text" th:field="*{lname}" /></p> -->
<!--         <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p> -->
<%--     </form> --%>
<footer>Whats Up!</footer>

</div>

</body>
</html>

