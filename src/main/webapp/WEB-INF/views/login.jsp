<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
    <body>
      <form action="/logon" method="POST">
        <label for="username">User Name:</label>
        <input id="username" name="j_username" type="text"/>
        <label for="password">Password:</label>
        <input id="password" name="j_password" type="password"/>
        <input type="submit" value="Log In"/>
      </form>
    </body>