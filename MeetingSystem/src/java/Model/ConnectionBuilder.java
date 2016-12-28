package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionBuilder
{
  public static Connection getConnection()
  {
    Connection con = null;
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://th.jilapat.com/meetingsystem?useEncoding=true&characterEncoding=UTF-8", "meetingsystem", "1234567890");
    }
    catch (ClassNotFoundException|SQLException ex)
    {
      Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
    }
    return con;
  }
}
