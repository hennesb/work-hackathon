<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Optimizations Test Home page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<c:import url="/WEB-INF/page-fragments/global/css-embed.jsp"
	charEncoding="UTF-8" />
</head>
<c:import url="/WEB-INF/page-fragments/inline-css/inline-home.jsp"
	charEncoding="UTF-8" />

<body>
    <c:out value="${ togglz }"/>
    
	<div class="container-fluid">

		<div class="row">
			<c:import url="/WEB-INF/page-fragments/home-page/video-embed.jsp"
				charEncoding="UTF-8" />
			<c:import url="/WEB-INF/page-fragments/home-page/image-embed.jsp"
				charEncoding="UTF-8" />
			<c:import url="/WEB-INF/page-fragments/home-page/basecard-embed.jsp"
				charEncoding="UTF-8" />
		</div>

		<hr>

		<div class="row no-gutters">
	        <c:import url="/WEB-INF/page-fragments/home-page/image-and-video-component.jsp" charEncoding="UTF-8"/>
		</div>
        <hr>
	</div>

	<c:import url="/WEB-INF/page-fragments/home-page/home-javascript.jsp"
		charEncoding="UTF-8" />
</body>
</html>

















