package Servlet;

import Model.Event;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//
public class AddEventServlet
  extends HttpServlet
{
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    response.setContentType("text/html;charset=UTF-8");
    String meetname = request.getParameter("meetname");
    String stdid = request.getParameter("stdid");
    String meetdate = request.getParameter("meetdate");
    String meettime = request.getParameter("meettime");
    String location = request.getParameter("location");
    String charges = request.getParameter("charges");
    String detail = request.getParameter("detail");
    String numofpart = request.getParameter("numofpart");
    if ((meetname != null) && (stdid != null) && (meetdate != null) && (location != null) && (charges != null) && (detail != null) && (numofpart != null))
    {
      Event e = new Event();
      e.setMeetname(meetname);
      e.setStdid(stdid);
      e.setMeetdate(meetdate);
      e.setMeetname(meetname);
      e.setTime(meettime);
      e.setLocation(location);
      e.setCharges(Double.parseDouble(charges));
      e.setDetail(detail);
      e.setNumber(Integer.parseInt(numofpart));
      Event.addEvent(e);
      getServletContext().getRequestDispatcher("/detail.jsp").forward(request, response);
    }
    else
    {
      request.setAttribute("message", "Input Incorrect!");
      getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
    }
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    processRequest(request, response);
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    processRequest(request, response);
  }
  
  public String getServletInfo()
  {
    return "Short description";
  }
}
