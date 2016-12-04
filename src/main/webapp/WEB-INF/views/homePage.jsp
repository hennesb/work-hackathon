<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Optimizations Test Home page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<c:import url="/WEB-INF/page-fragments/global/css-embed.jsp"/>
<c:import url="/WEB-INF/page-fragments/inline-css/inline-home.jsp"/>
</head>


<body>


	<div class="container-fluid">
		<c:import url="/WEB-INF/page-fragments/home-page/breadcrumbs.jsp" />
		<div class="row">
			<c:import url="/WEB-INF/page-fragments/home-page/video-embed.jsp" />
			<c:import url="/WEB-INF/page-fragments/home-page/image-embed.jsp" />
			<c:import url="/WEB-INF/page-fragments/home-page/basecard-embed.jsp" />
		</div>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootcards/1.0.0/js/bootcards.min.js"></script>
	<script>

bootcards.init({
	  offCanvasBackdrop: true,
	  offCanvasHideOnMainClick: true,
	  enableTabletPortraitMode: true,
	  disableRubberBanding: true
	});

</script>
</body>
</html>

















