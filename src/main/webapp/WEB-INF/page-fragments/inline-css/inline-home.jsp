<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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