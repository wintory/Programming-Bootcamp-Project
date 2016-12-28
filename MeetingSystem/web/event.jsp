<%@page import="java.util.List"%>
<%@page import="Model.Account"%>
<%@page import="Model.Event"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"/>
<%
    Event e = (Event) request.getAttribute("event");
    Account a = (Account) request.getSession().getAttribute("account");
    
    if (e == null || a == null) {
        response.sendRedirect("detail.jsp");
    }
    List<Account> ac = Event.getEventAccount(e.getMeetid());

    
%>
<style>
    p{
        font-size:1.3em !important;
    }
</style>
<header>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column" style="margin-top:50px;">
                <h1>
                    Event Detail
                </h1>
                <div class="container">
                    <div class="row clearfix">
                        <div class="col-md-12 column">
                            <div class="jumbotron" style="color:black; min-height:340px;">
                                <div class="col-md-12 column" style="margin-top:-40px; text-align:center;">
                                    <h1 style="margin-left:15%;"><%=e.getMeetname()%></h1>
                                </div>
                                <div class="col-md-12 column" style="margin-left:-80px;">
                                    <div class="col-md-4 column">
                                        <img src="img/noimg.png" style="height:150px;">
                                    </div>
                                    <div class="col-md-8 column" style="text-align:left;">
                                        <div class="col-md-6 column">
                                            <p><b>Meeting Date : <%=e.getMeetdate()%></b></p>
                                            <p><b>Meeting Time : <%=e.getTime()%></b></p>
                                            <p><b>Location : <%=e.getLocation()%></b></p>

                                        </div>
                                        <div class="col-md-6 column" style="text-align:left;">
                                            <p><b>Charge : <%=e.getCharges()%></b></p>
                                            <p><b>Detail : <%=e.getDetail()%></b></p>
                                            <p><b>Number of participants : <%=e.getNumber()%></b></p>
                                            <br>
                                        </div>
                                        <div class="col-md-12 column" style="text-align:center;">
                                            <p>
                                                <a id="join" class="btn btn-primary btn-large" href="JoinEvent?meetid=<%=e.getMeetid()%>" >Join</a>
                                                <a id="cancel" class="btn btn-primary btn-large" href="CancelEvent?meetid=<%=e.getMeetid()%>" onclick="show();">Cancel</a>
                                            </p>
                                        </div>

                                    </div>
                                </div>

                            </div>
                        </div>


                        <table class="table table-bordered" style="background:white;">

                            <tr>
                                <td style="text-align:center;">No</td>
                                <td style="text-align:center;">Joined Name</td>
                            </tr>
                            <%
                                if(ac!=null){
                                    int count = 1;
                                    for(Account aa : ac){
                            %>
                            <tr>
                                <td style="text-align:center;"><%=count%></td>
                                <td><%=aa.getName() + " " + aa.getSurname()%></td>
                            </tr>
                            <%}}else{%>
                            <tr>
                                <td colspan="2" style="font-weight:bolder; text-align: center;">No people join this event</td>
                            </tr>
                            <%}%>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
<jsp:include page="footer.jsp"/>