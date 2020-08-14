<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	%>
<%
	/* String contextPath = pageContext.getRequest().getServletContext(); */
	String contextPath = request.getContextPath(); //or pageContext
	/* int length = menulist.size(); */
%>
<!DOCTYPE html>
<html lang="en"><!-- Basic -->
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   
   
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
 
     <!-- Site Metas -->
    <title>Live Dinner Restaurant</title>  
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Site Icons -->
    <link rel="shortcut icon" href="<%=contextPath%>/images/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon" href="<%=contextPath%>/images/apple-touch-icon.png">

	<!-- Site CSS -->
    <link rel="stylesheet" href="<%=contextPath%>/css/style.css">    
    <!-- Custom CSS -->
    <link rel="stylesheet" href="<%=contextPath%>/css/custom.css">

    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
	<!-- Start header -->
	<header>
		<nav>
			<div class="container">
				<a href="index.html">
					<img src="<%=contextPath%>/images/logo.png" alt="" />
				</a>
				<button id = "button__menu" onclick="ShowMenu()" type="button" data-toggle="collapse" data-target="#navbars-rs-food" aria-controls="navbars-rs-food" aria-expanded="false" aria-label="Toggle navigation">
				  <li></li>
				  <li></li>
				  <li></li>
				</button>
				<div id="navbars-rs-food">
					<ul id="Mainmenu">
						<li><a href="index.html" class = "home">Home</a></li>
						<li><a href="<%=contextPath%>/menu/list">Menu</a></li>
						<li><a href="about.html">About</a></li>
						<li onmouseleave="MouseEvent()">
							<a href="#" id="dropdown-a" data-toggle="dropdown" onclick="view('s1');">Pages</a>
							<div class = "submenu" id ="s1" aria-labelledby="dropdown-a" >
								<a href="reservation.html">Reservation</a>
								<a href="stuff.html">Stuff</a>
								<a href="gallery.html">Gallery</a>
							</div>
						</li>
						<li onmouseleave="MouseEvent()">
							<a href="#" id="dropdown-a" data-toggle="dropdown" onclick="view('s2');">Blog</a>
							<div class = "submenu" id ="s2" aria-labelledby="dropdown-a">
								<a href="blog.html">blog</a>
								<a href="blog-details.html">blog Single</a>
							</div>
						</li>
						<li><a href="contact.html">Contact</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- End header -->
	
	<!-- Start All Pages -->
	<div >
		<div >
			<div >
				<div >
					<h1>Gallery</h1>
				</div>
			</div>
		</div>
	</div>
	<!-- End All Pages -->
	
	<!-- Start Gallery -->
	<div >
		<div >
			<div >
				<div >
					<div >
						<h2>Gallery</h2>
						<p>Lorem Ipsum is simply dummy text of the printing and typesetting</p>
					</div>
				</div>
			</div>
			<div >
				<div >
					<div >
						<a href="<%=contextPath%>/images/gallery-img-01.jpg">
							<img src="<%=contextPath%>/images/gallery-img-01.jpg" alt="Gallery Images">
						</a>
					</div>
					<div >
						<a href="<%=contextPath%>/images/gallery-img-02.jpg">
							<img src="<%=contextPath%>/images/gallery-img-02.jpg" alt="Gallery Images">
						</a>
					</div>
					<div >
						<a href="<%=contextPath%>/images/gallery-img-03.jpg">
							<img src="<%=contextPath%>/images/gallery-img-03.jpg" alt="Gallery Images">
						</a>
					</div>
					<div >
						<a href="<%=contextPath%>/images/gallery-img-04.jpg">
							<img src="<%=contextPath%>/images/gallery-img-04.jpg" alt="Gallery Images">
						</a>
					</div>
					<div >
						<a href="<%=contextPath%>/images/gallery-img-05.jpg">
							<img src="<%=contextPath%>/images/gallery-img-05.jpg" alt="Gallery Images">
						</a>
					</div> 
					<div >
						<a href="<%=contextPath%>/images/gallery-img-06.jpg">
							<img src="<%=contextPath%>/images/gallery-img-06.jpg" alt="Gallery Images">
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Gallery -->
	
	<!-- Start Customer Reviews -->
	<div>
		<div >
			<div >
				<div >
					<div>
						<h2>Customer Reviews</h2>
						<p>Lorem Ipsum is simply dummy text of the printing and typesetting</p>
					</div>
				</div>
			</div>
			<div >
				<div>
					<div id="reviews" data-ride="carousel">
						<div>
							<div>
								<div>
									<img src="<%=contextPath%>/images/quotations-button.png" alt="">
								</div>
								<h5><strong >Paul Mitchel</strong></h5>
								<h6>Web Developer</h6>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui. Mauris magna metus, dapibus nec turpis vel, semper malesuada ante. Idac bibendum scelerisque non non purus. Suspendisse varius nibh non aliquet.</p>
							</div>
							<div >
								<div>
									<img src="<%=contextPath%>/images/quotations-button.png" alt="">
								</div>
								<h5><strong>Steve Fonsi</strong></h5>
								<h6>Web Designer</h6>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui. Mauris magna metus, dapibus nec turpis vel, semper malesuada ante. Idac bibendum scelerisque non non purus. Suspendisse varius nibh non aliquet.</p>
							</div>
							<div >
								<div>
									<img src="<%=contextPath%>/images/quotations-button.png" alt="">
								</div>
								<h5><strong >Daniel vebar</strong></h5>
								<h6>Seo Analyst</h6>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui. Mauris magna metus, dapibus nec turpis vel, semper malesuada ante. Idac bibendum scelerisque non non purus. Suspendisse varius nibh non aliquet.</p>
							</div>
						</div>
						<a href="#reviews" role="button" data-slide="prev">
							<i aria-hidden="true"></i>
							<span >Previous</span>
						</a>
						<a href="#reviews" role="button" data-slide="next">
							<i aria-hidden="true"></i>
							<span>Next</span>
						</a>
                    </div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Customer Reviews -->

	
	<!-- Start Contact info -->
	<div>
		<div >
			<div >
				<div>
					<i></i>
					<div>
						<h4>Phone</h4>
						<p>
							+01 123-456-4590
						</p>
					</div>
				</div>
				<div>
					<i></i>
					<div>
						<h4>Email</h4>
						<p>
							yourmail@gmail.com
						</p>
					</div>
				</div>
				<div>
					<i></i>
					<div>
						<h4>Location</h4>
						<p>
							800, Lorem Street, US
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Contact info -->
	
	<!-- Start Footer -->
	<footer>
		<div >
			<div >
				<div>
					<h3>About Us</h3>
					<p>Integer cursus scelerisque ipsum id efficitur. Donec a dui fringilla, gravida lorem ac, semper magna. Aenean rhoncus ac lectus a interdum. Vivamus semper posuere dui.</p>
				</div>
				<div>
					<h3>Subscribe</h3>
					<div>
						<form>
							<input name="EMAIL" id="subs-email" placeholder="Email Address..." type="email">
							<button type="submit" >SUBSCRIBE</button>
							<div ></div>
						</form>
					</div>
					<ul>
						<li><a href="#"><i aria-hidden="true"></i></a></li>
						<li><a href="#"><i aria-hidden="true"></i></a></li>
						<li><a href="#"><i aria-hidden="true"></i></a></li>
						<li><a href="#"><i aria-hidden="true"></i></a></li>
						<li><a href="#"><i aria-hidden="true"></i></a></li>
					</ul>
				</div>
				<div>
					<h3>Contact information</h3>
					<p>Ipsum Street, Lorem Tower, MO, Columbia, 508000</p>
					<p><a href="#">+01 2000 800 9999</a></p>
					<p><a href="#"> info@admin.com</a></p>
				</div>
				<div>
					<h3>Opening hours</h3>
					<p><span>Monday: </span>Closed</p>
					<p><span>Tue-Wed :</span> 9:Am - 10PM</p>
					<p><span>Thu-Fri :</span> 9:Am - 10PM</p>
					<p><span>Sat-Sun :</span> 5:PM - 10PM</p>
				</div>
			</div>
		</div>
		
		<div>
			<div >
				<div >
					<div>
						<p>All Rights Reserved. &copy; 2018 <a href="#">Live Dinner Restaurant</a> Design By : 
					<a href="#">html design</a></p>
					</div>
				</div>
			</div>
		</div>
		
	</footer>
	<!-- End Footer -->
	
	<a href="#" id="back-to-top" title="Back to top" style="display: none;"><i aria-hidden="true"></i></a>

	<!-- ALL JS FILES -->
    <!-- ALL PLUGINS -->
    <script src="<%=contextPath%>/js/custom.js"></script>
</body>
</html>