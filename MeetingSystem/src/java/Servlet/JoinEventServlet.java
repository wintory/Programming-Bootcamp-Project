package Servlet;

import Model.Account;
import Model.Event;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class JoinEventServlet
  extends HttpServlet
{
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    response.setContentType("text/html;charset=UTF-8");
    String meetid = request.getParameter("meetid");
    Account a = (Account)request.getSession().getAttribute("account");
    Long stdid = Long.valueOf(a.getStdid());
    if (meetid != null)
    {
      Event.joinEvent(Integer.parseInt(meetid), stdid + "");
      Event e = Event.getEvent(Integer.parseInt(meetid));
      getServletContext().getRequestDispatcher("/detail.jsp").forward(request, response);
    }
    else
    {
      response.sendRedirect("/index.jsp");
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
