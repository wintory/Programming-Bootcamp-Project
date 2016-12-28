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

public class SignUpServlet
  extends HttpServlet
{
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    response.setContentType("text/html;charset=UTF-8");
    String message = "";
    String stdid = request.getParameter("stdid");
    String name = request.getParameter("firstname");
    String surname = request.getParameter("lastname");
    String password = request.getParameter("password");
    String conpassword = request.getParameter("conpassword");
    String phone = request.getParameter("tel");
    String email = request.getParameter("email");
    if ((stdid != null) && (name != null) && (surname != null) && (password != null) && (phone != null) && (email != null) && (password.equals(conpassword)))
    {
      Account a = new Account();
      a.setStdid(Long.parseLong(stdid));
      a.setName(name);
      a.setSurname(surname);
      a.setPassword(password);
      a.setPhone(phone);
      a.setEmail(email);
      message = Account.addAccount(a);
      Account ai = Account.getAccount(email);
      request.getSession().setAttribute("account", ai);
      getServletContext().getRequestDispatcher("/detail.jsp").forward(request, response);
    }
    else
    {
      message = "Input incorrect!";
      request.setAttribute("message", message);
      getServletContext().getRequestDispatcher("/signup.jsp").forward(request, response);
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
