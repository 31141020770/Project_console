<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	%>
<%
	/* String contextPath = pageContext.getRequest().getServletContext(); */
	String contextPath = request.getContextPath(); //or pageContext
	/* int length = menulist.size(); */
	int length = (int)request.getAttribute("test");
%>
<!DOCTYPE html>
<html lang="en"><!-- Basic -->
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
 
     <!-- Site Metas -->
    <title>Live Dinner Restaurant</title>  
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Site Icons -->

    <link rel="apple-touch-icon" href="<%=contextPath %>/images/apple-touch-icon.png">

	<!-- Site CSS -->
    <link rel="stylesheet" href="<%=contextPath %>/css/style.css">    
    <!-- Custom CSS -->
    <link rel="stylesheet" href="<%=contextPath %>/css/custom.css">

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
				  <li><%= length%></li>
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
	
	<!-- Start slides -->
	<div id="slides">
		<ul >
			<li id = "slider01" class="slide" >
				<img src="<%=contextPath%>/images/slider-01.jpg" alt="">
				<div class="content__slide">
					<div >
						<div >
							<h1 ><strong>Welcome To <br> Live Dinner Restaurant</strong></h1>
							<p >See how your users experience your website in realtime or view  <br> 
							trends to see any changes in performance over time.</p>
							<p><a href="#">Reservation</a></p>
						</div>
					</div>
				</div>
			</li>
			<li class="slide">
				<img src="<%=contextPath%>/images/slider-02.jpg" alt="">
				<div class="content__slide">
					<div >
						<div >
							<h1 ><strong>Welcome To <br> Live Dinner Restaurant</strong></h1>
							<p >See how your users experience your website in realtime or view  <br> 
							trends to see any changes in performance over time.</p>
							<p><a href="#">Reservation</a></p>
						</div>
					</div>
				</div>
			</li>
			<li class="slide">
				<img src="<%=contextPath%>/images/slider-03.jpg" alt="">
				<div class="content__slide">
					<div >
						<div >
							<h1 ><strong>Welcome To <br> Yamifood Restaurant</strong></h1>
							<p >See how your users experience your website in realtime or view  <br> 
							trends to see any changes in performance over time.</p>
							<p><a href="#">Reservation</a></p>
						</div>
					</div>
				</div>
			</li>
		</ul>
		<div class="button__slide">
			<a class="button__left" href="#"><i onclick="slides__next(-2);" class="fas fa-chevron-left"></i></a>
			<a class="button__right" href="#"><i onclick="slides__next(0);" class="fas fa-chevron-right"></i></a>
		</div>
		<div class="button__pagination">
			<a name="change_color" onclick="slides__button(0)"></a>
			<a name="change_color" onclick="slides__button(1)"></a>
			<a name="change_color" onclick="slides__button(2)"></a>
		</div>
	</div>
	<!-- End slides -->
	
	<!-- Start About -->
	<div class="section__1">
		<div class="container">
			<div class="row">
				<div class="col-6">
					<div >
						<h1>Welcome To <span>Live Dinner Restaurant</span></h1>
						<h4>Little Story</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque auctor suscipit feugiat. Ut at pellentesque ante, sed convallis arcu. Nullam facilisis, eros in eleifend luctus, odio ante sodales augue, eget lacinia lectus erat et sem. </p>
						<p>Sed semper orci sit amet porta placerat. Etiam quis finibus eros. Sed aliquam metus lorem, a pellentesque tellus pretium a. Nulla placerat elit in justo vestibulum, et maximus sem pulvinar.</p>
						<a href="#">Reservation</a>
					</div>
				</div>
				<div class="col-6 ima___fix">
					<img src="<%=contextPath%>/images/about-img.jpg" alt="" >
				</div>
			</div>
		</div>
	</div>
	<!-- End About -->
	
	<!-- Start QT -->
	<div class="startQT">
		<div >
			<div >
				<div class="test_center">
					<p>
						" If you're not the one cooking, stay out of the way and compliment the chef. "
					</p>
					<span>Michael Strahan</span>
				</div>
			</div>
		</div>
	</div>
	<!-- End QT -->
	
	<!-- Start Menu -->
	<div>
		<div id = "menu___1">
			<div class="test_center" >
				<div>
					<div >
						<h2>Special Menu</h2>
						<p>Lorem Ipsum is simply dummy text of the printing and typesetting</p>
					</div>
				</div>
			</div>
			
			<div class="container" >
				<div class="col-25" >
					<div id="v-pills-tab" role="tablist" aria-orientation="vertical" class="menu_mini">
						<a id="v-pills-home-tab" class="home" onclick="change__menu(0);" data-toggle="pill" role="tab" aria-controls="v-pills-home" aria-selected="true">All</a>
						<a id="v-pills-profile-tab" onclick="change__menu(1);" data-toggle="pill"  role="tab" aria-controls="v-pills-profile" aria-selected="false">Drinks</a>
						<a id="v-pills-messages-tab" onclick="change__menu(2);" data-toggle="pill" role="tab" aria-controls="v-pills-messages" aria-selected="false">Lunch</a>
						<a id="v-pills-settings-tab" onclick="change__menu(3);" data-toggle="pill" role="tab" aria-controls="v-pills-settings" aria-selected="false">Dinner</a>
					</div>
				</div>
				
				<div class="col-75">
					<div id="v-pills-tabContent">
						<div class = "showOrHide" id="v-pills-home" role="tabpanel" aria-labelledby="v-pills-home-tab">
							<div class="row">
								<div class="col-333"  >
									<div class="show-text" >
										<img src="<%=contextPath%>/images/img-01.jpg" alt="Image" onmouseover="onmouseover_menu(0)">
										<div class="text" onmouseleave="onmouseout_menu(0)">
											<h4>Special Drinks 1</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $7.79</h5>
										</div>
									</div>
								</div>
								
								<div class="col-333" >
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-02.jpg" alt="Image" onmouseover="onmouseover_menu(1)">
										<div class="text" onmouseleave="onmouseout_menu(1)">
											<h4>Special Drinks 2</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $9.79</h5>
										</div>
									</div>
								</div>
								
								<div class="col-333">
									<div class="show-text" >
										<img src="<%=contextPath%>/images/img-03.jpg" alt="Image" onmouseover="onmouseover_menu(2)">
										<div class="text" onmouseleave="onmouseout_menu(2)">
											<h4>Special Drinks 3</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $10.79</h5>
										</div>
									</div>
								</div>
							</div>	
							<div class="row">	
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-04.jpg" alt="Image" onmouseover="onmouseover_menu(3)">
										<div class="text" onmouseleave="onmouseout_menu(3)">
											<h4>Special Lunch 1</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $15.79</h5>
										</div>
									</div>
								</div>
								
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-05.jpg" alt="Image" onmouseover="onmouseover_menu(4)">
										<div class="text" onmouseleave="onmouseout_menu(4)">
											<h4>Special Lunch 2</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $18.79</h5>
										</div>
									</div>
								</div>
								
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-06.jpg" alt="Image" onmouseover="onmouseover_menu(5)">
										<div class="text" onmouseleave="onmouseout_menu(5)">
											<h4>Special Lunch 3</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $20.79</h5>
										</div>
									</div>
								</div>
							</div>
							<div class="row">	
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-07.jpg" alt="Image" onmouseover="onmouseover_menu(6)">
										<div class="text" onmouseleave="onmouseout_menu(6)">
											<h4>Special Dinner 1</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $25.79</h5>
										</div>
									</div>
								</div>
								
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-08.jpg" alt="Image" onmouseover="onmouseover_menu(7)">
										<div class="text" onmouseleave="onmouseout_menu(7)">
											<h4>Special Dinner 2</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $22.79</h5>
										</div>
									</div>
								</div>
								
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-09.jpg" alt="Image" onmouseover="onmouseover_menu(8)">
										<div class="text" onmouseleave="onmouseout_menu(8)">
											<h4>Special Dinner 3</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $24.79</h5>
										</div>
									</div>
								</div>
							</div>
						</div>	
						</div>
						<div class = "showOrHide" id="v-pills-profile" role="tabpanel" aria-labelledby="v-pills-profile-tab">
							<div class="row">
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-01.jpg" alt="Image" onmouseover="onmouseover_menu(9)">
										<div class="text" onmouseleave="onmouseout_menu(9)" >
											<h4>Special Drinks 1</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $7.79</h5>
										</div>
									</div>
								</div>
								
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-02.jpg" alt="Image"onmouseover="onmouseover_menu(10)">
										<div class="text" onmouseleave="onmouseout_menu(10)">
											<h4>Special Drinks 2</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $9.79</h5>
										</div>
									</div>
								</div>
								
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-03.jpg" alt="Image" onmouseover="onmouseover_menu(11)">
										<div class="text" onmouseleave="onmouseout_menu(11)">
											<h4>Special Drinks 3</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $10.79</h5>
										</div>
									</div>
								</div>
							</div>
							
						</div>
						<div class = "showOrHide"id="v-pills-messages" role="tabpanel" aria-labelledby="v-pills-messages-tab">
							<div class="row">
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-04.jpg" alt="Image" onmouseover="onmouseover_menu(12)">
										<div class="text" onmouseleave="onmouseout_menu(12)">
											<h4>Special Lunch 1</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $15.79</h5>
										</div>
									</div>
								</div>
								
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-05.jpg" alt="Image" onmouseover="onmouseover_menu(13)">
										<div class="text" onmouseleave="onmouseout_menu(13)">
											<h4>Special Lunch 2</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $18.79</h5>
										</div>
									</div>
								</div>
								
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-06.jpg" alt="Image" onmouseover="onmouseover_menu(14)">
										<div class="text" onmouseleave="onmouseout_menu(14)">
											<h4>Special Lunch 3</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $20.79</h5>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class = "showOrHide" id="v-pills-settings" role="tabpanel" aria-labelledby="v-pills-settings-tab">
							<div class="row">
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-07.jpg" alt="Image"onmouseover="onmouseover_menu(15)">
										<div class="text" onmouseleave="onmouseout_menu(15)">
											<h4>Special Dinner 1</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $25.79</h5>
										</div>
									</div>
								</div>
								
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-08.jpg" alt="Image" onmouseover="onmouseover_menu(16)">
										<div class="text" onmouseleave="onmouseout_menu(16)">
											<h4>Special Dinner 2</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $22.79</h5>
										</div>
									</div>
								</div>
								
								<div class="col-333">
									<div class="show-text">
										<img src="<%=contextPath%>/images/img-09.jpg" alt="Image" onmouseover="onmouseover_menu(17)">
										<div class="text" onmouseleave="onmouseout_menu(17)">
											<h4>Special Dinner 3</h4>
											<p>Sed id magna vitae eros sagittis euismod.</p>
											<h5> $24.79</h5>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</div>
	<!-- End Menu -->
	
	<!-- Start Gallery -->
	<div >
		<div >
			<div class="test_center" >
				<div >
					<div >
						<h2>Gallery</h2>
						<p>Lorem Ipsum is simply dummy text of the printing and typesetting</p>
					</div>
				</div>
			</div>
			<div class="container none_flex">
				<div class="row">
					<div class="col-333 gallery__inner" >
						<a>
							<img src="<%=contextPath%>/images/gallery-img-01.jpg" alt="Gallery Images">
						</a>
					</div>
					<div class="col-333 gallery__inner">
						<a>
							<img src="<%=contextPath%>/images/gallery-img-02.jpg" alt="Gallery Images">
						</a>
					</div>
					<div class="col-333 gallery__inner">
						<a>
							<img src="<%=contextPath%>/images/gallery-img-03.jpg" alt="Gallery Images">
						</a>
					</div>
				</div>
				<div class="row">
					<div class="col-333 gallery__inner">
						<a >
							<img src="<%=contextPath%>/images/gallery-img-04.jpg" alt="Gallery Images">
						</a>
					</div>
					<div class="col-333 gallery__inner">
						<a>
							<img src="<%=contextPath%>/images/gallery-img-05.jpg" alt="Gallery Images">
						</a>
					</div> 
					<div class="col-333 gallery__inner">
						<a>
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
			<div class="test_center">
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
						<div class="row hiddden__">
							<div class="show_slide" style="">
								<div class="img_box">
									<img src="<%=contextPath%>/images/quotations-button.png" alt="">
								</div>
								<h5><strong >Paul Mitchel</strong></h5>
								<h6>Web Developer</h6>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui. Mauris magna metus, dapibus nec turpis vel, semper malesuada ante. Idac bibendum scelerisque non non purus. Suspendisse varius nibh non aliquet.</p>
							</div>
							<div class="show_slide"style="">
								<div class="img_box">
									<img src="<%=contextPath%>/images/quotations-button.png" alt="">
								</div>
								<h5><strong>Steve Fonsi</strong></h5>
								<h6>Web Designer</h6>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui. Mauris magna metus, dapibus nec turpis vel, semper malesuada ante. Idac bibendum scelerisque non non purus. Suspendisse varius nibh non aliquet.</p>
							</div>
							<div class="show_slide" style="">
								<div class="img_box">
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