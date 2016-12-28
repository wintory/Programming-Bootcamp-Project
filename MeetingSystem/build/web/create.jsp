<%@page import="Model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"/>
<%
    long stdid =0;
    if (request.getSession().getAttribute("account") != null) {
        Account a = ((Account) request.getSession().getAttribute("account"));
        stdid = a.getStdid();
    } else {
        response.sendRedirect("index.jsp");
    }
%>
<header>
    <div class="container">
        <div class="row clearfix" >
            <form role="form" method="POST" action="AddEvent">
                <div class="col-md-12 column" style="margin-top:100px;">
                    <h1>
                        Create Meeting
                    </h1><br><br>
                </div>
        </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="form-title">Meeting Name</div>
                    <input class="form-field" type="text" name="meetname" id="meeting_name"/>
                    <input class="form-field" type="text" name="stdid" value="<%=stdid%>" hidden/>
                </div>
                <div class="col-md-6">
                    <div class="form-title">Meeting Date</div>
                    <input class="form-field" type="date" name="meetdate" id="date"/>
                </div>
                <div class="col-md-6">
                    <div class="form-title">Meeting Time</div>
                    <input class="form-field" type="time" name="meettime" id="time"/>
                </div>
                <div class="col-md-6">
                    <div class="form-title">Location</div>
                    <input class="form-field" type="text" name="location" id="location" />
                </div>
                <div class="col-md-6">
                    <div class="form-title">Charges</div>
                    <input class="form-field" type="text" name="charges" id="pay"/>
                </div>
                <div class="col-md-6">
                    <div class="form-title">Detail</div>
                    <input class="form-field" type="text" name="detail" id="detail"/>
                </div>
                <div class="col-md-6">
                    <div class="form-title">Number of participants</div>
                    <input class="form-field" type="text" name="numofpart" id="gen"/>
                </div>


                <div class="col-md-12 column">
                    <a id="modal-784099" href="#modal-container-784099" role="button" class="btn" data-toggle="modal" style="font-size: 20px;" onclick="create();">Create</a>
                    <br><br>
                </div>
                <div class="modal fade" id="modal-container-784099" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                <h4 class="modal-title" id="myModalLabel" style="color:black;">
                                    Attention
                                </h4>
                            </div>
                            <div class="modal-body">
                                <p id="showw" style="color:black;">Do you want to create meeting?</p>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>  <button type="submit" class="btn btn-warning">Confirm</button>
                            </div>
                        </div>
                        </form>
                    </div>

                </div>

            </div>
    </div>


</header>


<jsp:include page="footer.jsp"/>