package Model;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Account
{
  private long stdid;
  private String name;
  private String surname;
  private String password;
  private String phone;
  private String email;
  
  public long getStdid()
  {
    return this.stdid;
  }
  
  public void setStdid(long stdid)
  {
    this.stdid = stdid;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getSurname()
  {
    return this.surname;
  }
  
  public void setSurname(String surname)
  {
    this.surname = surname;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }
  
  public String getPhone()
  {
    return this.phone;
  }
  
  public void setPhone(String phone)
  {
    this.phone = phone;
  }
  
  public String getEmail()
  {
    return this.email;
  }
  
  public void setEmail(String email)
  {
    this.email = email;
  }
  
  public static String addAccount(Account a)
  {
    String message = "";
    Connection con = ConnectionBuilder.getConnection();
    String sql = "INSERT INTO Account VALUE(?,?,?,?,?,?)";
    try
    {
      PreparedStatement pstm = con.prepareStatement(sql);
      pstm.setLong(1, a.getStdid());
      pstm.setString(2, a.getName());
      pstm.setString(3, a.getSurname());
      pstm.setString(4, a.getPassword());
      pstm.setString(5, a.getPhone());
      pstm.setString(6, a.getEmail());
      pstm.executeUpdate();
      message = "Success";
    }
    catch (SQLException e)
    {
      message = "Fail";
    }
    return message;
  }
  
  public static Account getAccount(String email)
  {
    Account a = null;
    Connection con = ConnectionBuilder.getConnection();
    String sql = "SELECT * FROM Account WHERE email = ?";
    try
    {
      PreparedStatement pstm = con.prepareStatement(sql);
      pstm.setString(1, email);
      ResultSet rs = pstm.executeQuery();
      if (rs.next())
      {
        a = new Account();
        a.setStdid(rs.getLong("stdid"));
        a.setName(rs.getString("fname"));
        a.setSurname(rs.getString("lname"));
        a.setPassword(rs.getString("password"));
        a.setPhone(rs.getString("phone"));
        a.setEmail(rs.getString("email"));
      }
    }
    catch (SQLException e)
    {
      System.out.println(e);
    }
    return a;
  }
}
