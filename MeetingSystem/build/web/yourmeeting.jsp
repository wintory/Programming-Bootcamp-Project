<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="Model.Event"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"/>
<header>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column" style="margin-top:100px;">
                <h1>
                    Your Created Meeting
                </h1>

                <table class="table table-bordered" style="background:white;">
                    <tr>
                        <td style="text-align:center;">No</td>
                        <td style="text-align:center;">Event Name</td>
                        <td style="text-align:center;">Event Date</td>
                        <td style="text-align:center;">Number of Participle</td>
                        <td style="text-align:center;">Info</td>
                    </tr>
                    <%
                        List<Event> all = Event.getAllEvent();
                        if (all != null) {
                            int count = 1;
                            for (Event a : all) {
                    %>
                    <tr>
                        <td><%=count%></td>
                        <td><%=a.getMeetname()%></td>
                        <td style="text-align:center;"><%=a.getMeetdate()%></td>
                        <td style="text-align:center;"><%=a.getNumber()%></td>
                        <td style="text-align:center;"><a href="ShowEvent?meetid=<%=a.getMeetid()%>"<span class="glyphicon glyphicon-search" aria-hidden="true"></span></td>
                    </tr>
                    <%}
                    } else {
                    %>
                    <tr>
                        <td colspan="5" style="text-align: center;">No event now!</td>
                    </tr>
                    <%}%>
                </table>
                </table>

            </div>
        </div>


</header>

<jsp:include page="footer.jsp"/>