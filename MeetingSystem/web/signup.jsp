<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"/>
<header style="padding-bottom:30px;">
    <div class="container">
        <div class="row clearfix">
            <form role="form" action="SignUp" method="post">
                <div class="col-md-12 column" style="margin-top:100px;">
                    <h1>
                        Register
                    </h1><br><br>
                </div>
        </div>
            <div class="row">
                <h1 style="color:red;">${message}</h1>
                <div class="col-md-6">
                    <div class="form-title">Student ID</div>
                    <input id="idd" class="form-field" type="number" name="stdid" required/>
                </div>
                <div class="col-md-6">
                    <div class="form-title">Name</div>
                    <input id="firstname" class="form-field" type="text" name="firstname" required />
                </div>
                <div class="col-md-6">
                    <div class="form-title">Surname</div>
                    <input id="lastname" class="form-field" type="text" name="lastname" required/>
                </div>
                <div class="col-md-6">

                    <div class="form-title">Password</div>
                    <input id="password" class="form-field" type="password" name="password" required/>
                </div>
                <div class="col-md-6">
                    <div class="form-title">Repeat Password</div>
                    <input id="conpassword" class="form-field" type="password" name="conpassword" required/>
                </div>

                <div class="col-md-6">
                    <div class="form-title">Phone</div>
                    <input id="tel" class="form-field" type="phone" name="tel" required/><br />
                </div>
                <div class="col-md-6">
                    <div class="form-title">Email</div>
                    <input id="email" class="form-field" type="email" name="email" required/><br/>
                </div>
                <div class="col-md-6">
                    <button type="submit" class="btn btn-warning">Sign Up</button>
                </div>
        </form>
    </div>
</div>
</header>

<jsp:include page="footer.jsp"/>
