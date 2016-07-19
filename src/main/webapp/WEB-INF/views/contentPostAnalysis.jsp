
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
<h2>Whats up: <p>${fname} ${lname}</p></h2>
    
<footer>Whats Up!</footer>

</div>

</body>
</html>

