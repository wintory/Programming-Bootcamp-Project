package Servlet;

import Model.Account;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet
  extends HttpServlet
{
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    if ((email != null) && (password != null))
    {
      Account a = Account.getAccount(email);
      if (a != null)
      {
        if (password.equals(a.getPassword()))
        {
          request.getSession().setAttribute("account", a);
          getServletContext().getRequestDispatcher("/detail.jsp").forward(request, response);
        }
        else
        {
          request.setAttribute("message", "Password incorrect!");
          getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
      }
      else
      {
        request.setAttribute("message", "Account not found!");
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
      }
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
