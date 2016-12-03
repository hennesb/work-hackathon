<%-- <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


<!-- Bootcards CSS for iOS: -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootcards/1.0.0/css/bootcards-ios.min.css">

<!-- Bootcards CSS for Android: -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootcards/1.0.0/css/bootcards-android.min.css">

<!-- Bootcards CSS for desktop: -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootcards/1.0.0/css/bootcards-desktop.min.css">


<script src="https://use.fontawesome.com/073982fe32.js"></script>



<style>
@media only screen and (min-width : 768px) {
	.is-table-row {
		display: table;
	}
	.is-table-row [class*="col-"] {
		float: none;
		display: table-cell;
		vertical-align: top;
	}
	.my-color {
		background-color: yellow;
	}
}

.base {
	top: 150px;
	position: absolute;
}

.wrapper {
	width: 75%;
	/* whatever width you want */
	display: inline-block;
	position: relative;
}

.main {
	position: absolute;
}

.wrapper-with-intrinsic-ratio {
	position: relative;
	padding-bottom: 20%;
	height: 0;
}

.element-to-stretch {
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
}

.containingBlock {
	width: 75%;
}

.inner-block {
	position: relative;
}

.videoWrapper {
	position: relative;
	padding-bottom: 56.25%;
	padding-top: 25px;
	height: 0;
}

.videoWrapper video {
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
}

.test-color-1 {
	background: teal;
}

.test-color-2 {
	background: red;
}

.nopadding {
	padding: 0 !important;
	margin: 0 !important;
}

div.inline {
	display: inline;
}

img.videotemplate-d {
	width: 100%;
}

.the-wrap {
	position: fixed;
	left: 0;
	top: 0;
}

.embed-responsive-image {
	padding-bottom: 98.75%;
}

.thumbnaila img {
	max-width: 100%; /* do not stretch the bootstrap column */
}

.img-wrapper {
	width: 100%;
	padding-bottom: 100%; /* your aspect ratio here! */
	position: relative;
}

.img-wrapper img {
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	min-height: 100%;
	/* optional: if you want the smallest images to fill the .thumbnail */
}

.img-wrapper video {
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	width: 100%;
	heigth: 101%;
	min-height: 100%;
}

.space-img {
	padding-bottom: 15px;
}

.row.no-gutters {
	margin-right: 0;
	margin-left: 0;
}

.row.no-gutters>[class^="col-"], .row.no-gutters>[class*=" col-"] {
	padding-right: 0;
	padding-left: 0;
}
</style>
</head>
<title></title>


<body>


	<div class="container-fluid">
		<div class="row">

			<div class="col-sm-offset-1 col-sm-3 col-xs-12">

				<div class="panel panel-default bootcards-media">
					<div class="panel-heading">
						<h3 class="panel-title">Family plan</h3>
					</div>
					<div class="panel-body">Special offer prices start at &euro;1000</div>

					<div class="embed-responsive embed-responsive-16by9">
						<video
							src="https://storage.googleapis.com/vhi_life_video/fertility/fertility.mp4"
							controls>
						</video>
					</div>
					<!-- <iframe class="embed-responsive-item" src="//www.youtube.com/embed/ePbKGoIGAXY"></iframe>  -->





					<!--  <img src="http://www.teamstudio.com/Portals/218295/images/istock_000001242290small.jpg" class="img-responsive"/> -->
					<div class="panel-footer">
						<div class="btn-group btn-group-justified">
							<div class="btn-group">
								<button class="btn btn-default">
									<i class="fa fa-weixin" aria-hidden="true"></i> Chat to us
								</button>
							</div>
							<div class="btn-group">
								<button class="btn btn-default">
									<i class="fa fa-plus-circle"></i> Get a quote
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>


			<div class="col-sm-3 col-xs-12">

				<div class="panel panel-default bootcards-media">
					<div class="panel-heading">
						<h3 class="panel-title">One Plan Plus</h3>
					</div>
					<div class="panel-body">Special offer </div>

 <img sizes="(max-width: 837px) 70vw, 586px" srcset="${pageContext.request.contextPath}/images/fertility_gtufuy_dpwaqs_ar_4_3,c_fill,g_auto__c_scale,w_200.jpg 200w,
${pageContext.request.contextPath}/images/fertility_gtufuy_dpwaqs_ar_4_3,c_fill,g_auto__c_scale,w_323.jpg 323w,
${pageContext.request.contextPath}/images/fertility_gtufuy_dpwaqs_ar_4_3,c_fill,g_auto__c_scale,w_418.jpg 418w,
${pageContext.request.contextPath}/images/fertility_gtufuy_dpwaqs_ar_4_3,c_fill,g_auto__c_scale,w_498.jpg 498w,
${pageContext.request.contextPath}/images/fertility_gtufuy_dpwaqs_ar_4_3,c_fill,g_auto__c_scale,w_571.jpg 571w,
${pageContext.request.contextPath}/images/fertility_gtufuy_dpwaqs_ar_4_3,c_fill,g_auto__c_scale,w_586.jpg 586w"
src="${pageContext.request.contextPath}/images/fertility_gtufuy_dpwaqs_ar_4_3,c_fill,g_auto__c_scale,w_586.jpg"
alt="Fertility Images" class="img-responsive">  



					<!--  <img src="http://www.teamstudio.com/Portals/218295/images/istock_000001242290small.jpg" class="img-responsive"/> -->
					<div class="panel-footer">
						<div class="btn-group btn-group-justified">
							<div class="btn-group">
								<button class="btn btn-default">
									<i class="fa fa-weixin" aria-hidden="true"></i> Chat to us
								</button>
							</div>
							<div class="btn-group">
								<button class="btn btn-default">
									<i class="fa fa-plus-circle"></i> Get a quote
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>


  <div class="col-sm-3 col-xs-12">
<div class="panel panel-default">
  <div class="panel-heading clearfix">
    <h3 class="panel-title pull-left">Company Plan</h3>
      <a class="btn btn-success pull-right" href="#">
        <i class="fa fa-shopping-cart"></i>
        Special Offer
      </a>
    </div>
    <div class="list-group">
      <div class="list-group-item">
      
        <h4 class="list-group-item-heading">Price : &euro;500</h4>
        <p>Start Date : 01/01/2017</p>
      </div>
      <div class="list-group-item">
        <h4 class="list-group-item-heading">Benefits</h4>
        <p class="list-group-item-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident Excepteur sint occaecat</p>
      </div>
      <div class="list-group-item">
      
    </div>
  <div class="panel-footer">
    <small>Price based on one adult aged 34</small>
  </div>
</div>
  </div>

</div>
		</div> <!-- row -->



	</div> <!-- container -->

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootcards/1.0.0/js/bootcards.min.js"></script>
	<script>

$(".pseudo-click").on("click", function(){
	$(".show-me").removeClass("hidden");
	console.log("Show displayed");
	$(".dynamicContent").html("I have written to the dom ");
	console.log("Dynamic content displayed");
});

bootcards.init({
	  offCanvasBackdrop: true,
	  offCanvasHideOnMainClick: true,
	  enableTabletPortraitMode: true,
	  disableRubberBanding: true
	});

</script>
</body>
</html>

















