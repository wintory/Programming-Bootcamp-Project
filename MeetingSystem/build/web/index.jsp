<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"/>
<header>
    <div class="header-content"  style="position:absolute; z-index:0;">
        <div class="header-content-inner" style="margin-top:50px" >
            <h1>Meeting System</h1>
            <p>I don’t remember how we happened to meet each other.
                I don’t remember who got along with whom first.
                All I can remember is all of us together…always.</p>
            <form action="Login" method="post" class="form-container" style="margin-left:35%">
                <div class="form-title"><h2>Sign in</h2></div>
                <div class="form-title">Email</div>
                <input class="form-field" type="text" name="email" /><br />
                <div class="form-title">Password</div>
                <input class="form-field" type="password" name="password" /><br />
                <a class='submit-button' href="signup.jsp">Sign up</a>
                <input class="submit-button" type="submit" value="Login" />
                <h1 style="color:red;">${message}</h1>
            </form>
            <span style="color:red;"></span>
        </div>
    </div>
</header>
<section class="bg-primary" style=" background-color: #3A3635;"id="about" style="margin-top:100px">
    <div class="container">
        <div style="margin-left:46%"><h2>Our System</h2></div>
        <div class="row">
            <div class="col-lg-3 col-md-6 text-center">
                <div class="service-box">
                    <i class="fa fa-4x fa-diamond wow bounceIn text-primary"></i>

                    <p class="text-muted">SIT</p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 text-center">
                <div class="service-box">
                    <i class="fa fa-4x fa-paper-plane wow bounceIn text-primary" data-wow-delay=".1s"></i>
                    <p class="text-muted">Family</p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 text-center">
                <div class="service-box">
                    <i class="fa fa-4x fa-newspaper-o wow bounceIn text-primary" data-wow-delay=".2s"></i>
                    <p class="text-muted">News</p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 text-center">
                <div class="service-box">
                    <i class="fa fa-4x fa-heart wow bounceIn text-primary" data-wow-delay=".3s"></i>
                    <p class="text-muted">Relation</p>
                </div>
            </div>
        </div>
    </div>
</section>
<section id="contact">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 text-center">
                <h2 class="section-heading">Contact us</h2>
                <hr class="primary">
            </div>
            <div class="col-lg-4 col-lg-offset-2 text-center">
                <i class="fa fa-phone fa-3x wow bounceIn"></i>
                <p>02-123-4567</p>
            </div>
            <div class="col-lg-4 text-center">
                <i class="fa fa-envelope-o fa-3x wow bounceIn" data-wow-delay=".1s"></i>
                <p><a href="mailto:your-email@your-domain.com">alumini@gmail.com</a></p>
            </div>
        </div>
    </div>
</section>

<jsp:include page="footer.jsp"/>