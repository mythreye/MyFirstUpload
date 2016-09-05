<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" href="resources/img/favicon.ico" type="image/x-icon">
<link rel="shortcut icon" href="resources/img/favicon.ico" type="image/x-icon">
<link rel="stylesheet" href="resources/css/bootstrap.css" type="text/css" media="screen">
<link rel="stylesheet" href="resources/css/responsive.css" type="text/css" media="screen">
<link rel="stylesheet" href="resources/css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="resources/css/touchTouch.css" type="text/css" media="screen">
<link rel="stylesheet" href="resources/css/kwicks-slider.css" type="text/css" media="screen">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300' rel='stylesheet' type='text/css'>
<script src="resources/js/jquery.js"></script>
<script src="resources/js/superfish.js"></script>
<script src="resources/js/jquery.flexslider-min.js"></script>
<script src="resources/js/jquery.kwicks-1.5.1.js"></script>
<script src="resources/js/jquery.easing.1.3.js"></script>
<script src="resources/js/jquery.cookie.js"></script>
<script src="resources/js/touchTouch.jquery.js"></script>
<script>
if ($(window).width() > 1024) {
    document.write("<" + "script src='resources/js/jquery.preloader.js'></" + "script>");
}
</script>
<script>

jQuery(window).load(function () {
    $x = $(window).width();
    if ($x > 1024) {
        jQuery("#content .row").preloader();
    }
    jQuery('.magnifier').touchTouch();
    jQuery('.spinner').animate({
        'opacity': 0
    }, 1000, 'easeOutCubic', function () {
        jQuery(this).css('display', 'none')
    });
});
</script>
<title>CASA MOBEL</title>
</head>
<body>
  <div class="container">
    <div class="row">
      <div class="span12">
        <div class="navbar navbar_">
          <div class="container">
            <h1 class="brand brand_"><a href="index.html"><img alt="" src="resources/img/logo.jpg"> </a></h1>
            <a class="btn btn-navbar btn-navbar_" data-toggle="collapse" data-target=".nav-collapse_">Menu <span class="icon-bar"></span> </a>
            <div class="nav-collapse nav-collapse_  collapse">
              <ul class="nav sf-menu">
                <li><a href="index.jsp">Home</a></li>
                <li><a href="about">About</a></li>
                <li><a href="contactus">Contact</a></li>
                <li><a href="login">Log In</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <script src="resources/WebContent/js/bootstrap.js"></script>
  </body>
</html>