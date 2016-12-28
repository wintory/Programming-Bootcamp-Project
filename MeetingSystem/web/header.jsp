<%@page import="Model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIT:: Meeting System</title>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">         
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css/animate.min.css" type="text/css">
        <link rel="stylesheet" href="css/creative.css" type="text/css">
        <link rel="stylesheet" href="css/mystyle.css" type="text/css">
    </head>
    <body id="page-top">
        <%
            Account a = (Account)request.getSession().getAttribute("account");
        %>
        <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                    </button>
                    <a class="navbar-brand page-scroll" href="#">Meeting System</a>
                </div>
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-left">
                        <%if(a!=null){%>
                        <li>
                            <a class="page-scroll" href="detail.jsp">Home</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="create.jsp">Create Meeting</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="yourmeeting.jsp">Your Meeting</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="Logout">Sign Out</a>
                        </li>
                        <%}%>
                    </ul>
                </div>
            </div>
        </nav>
