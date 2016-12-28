package Model;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Event
{
  private int meetid;
  private String meetname;
  private String meetdate;
  private String location;
  private double charges;
  private String detail;
  private String time;
  private int number;
  private String stdid;
  private String created;
  
  public String getStdid()
  {
    return this.stdid;
  }
  
  public void setStdid(String stdid)
  {
    this.stdid = stdid;
  }
  
  public String getTime()
  {
    return this.time;
  }
  
  public void setTime(String time)
  {
    this.time = time;
  }
  
  public int getMeetid()
  {
    return this.meetid;
  }
  
  public void setMeetid(int meetid)
  {
    this.meetid = meetid;
  }
  
  public String getMeetname()
  {
    return this.meetname;
  }
  
  public void setMeetname(String meetname)
  {
    this.meetname = meetname;
  }
  
  public String getMeetdate()
  {
    return this.meetdate;
  }
  
  public void setMeetdate(String meetdate)
  {
    this.meetdate = meetdate;
  }
  
  public String getLocation()
  {
    return this.location;
  }
  
  public void setLocation(String location)
  {
    this.location = location;
  }
  
  public double getCharges()
  {
    return this.charges;
  }
  
  public void setCharges(double charges)
  {
    this.charges = charges;
  }
  
  public String getDetail()
  {
    return this.detail;
  }
  
  public void setDetail(String detail)
  {
    this.detail = detail;
  }
  
  public int getNumber()
  {
    return this.number;
  }
  
  public void setNumber(int number)
  {
    this.number = number;
  }
  
  public String getCreated()
  {
    return this.created;
  }
  
  public void setCreated(String created)
  {
    this.created = created;
  }
  
  public static String addEvent(Event e)
  {
    String message = "";
    Connection con = ConnectionBuilder.getConnection();
    String sql = "INSERT INTO Event(meetname,meetdate,meettime,location,charges,detail,number,stdid) VALUE(?,?,?,?,?,?,?,?)";
    try
    {
      PreparedStatement pstm = con.prepareStatement(sql);
      pstm.setString(1, e.getMeetname());
      pstm.setString(2, e.getMeetdate());
      pstm.setString(3, e.getTime());
      pstm.setString(4, e.getLocation());
      pstm.setDouble(5, e.getCharges());
      pstm.setString(6, e.getDetail());
      pstm.setInt(7, e.getNumber());
      pstm.setString(8, e.getStdid());
      pstm.executeUpdate();
    }
    catch (SQLException ex)
    {
      Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
    }
    return message;
  }
  
  public static List<Event> getAllEvent()
  {
    Event a = null;
    List<Event> all = null;
    Connection con = ConnectionBuilder.getConnection();
    String sql = "SELECT * FROM Event";
    try
    {
      PreparedStatement pstm = con.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      while (rs.next())
      {
        a = new Event();
        a.setMeetid(rs.getInt("meetid"));
        a.setMeetname(rs.getString("meetname"));
        a.setMeetdate(rs.getString("meetdate"));
        a.setTime(rs.getString("meettime"));
        a.setLocation(rs.getString("location"));
        a.setCharges(rs.getDouble("charges"));
        a.setDetail(rs.getString("detail"));
        a.setNumber(rs.getInt("number"));
        a.setCreated(rs.getString("createdtime"));
        a.setStdid(rs.getString("stdid"));
        if (all == null) {
          all = new ArrayList();
        }
        all.add(a);
      }
    }
    catch (SQLException e)
    {
      System.out.println(e);
    }
    return all;
  }
  
  public static void joinEvent(int meetid, String stdid)
  {
    Connection con = ConnectionBuilder.getConnection();
    String sql = "INSERT INTO ActMeet VALUES(?,?)";
    try
    {
      PreparedStatement pstm = con.prepareStatement(sql);
      pstm.setString(1, stdid);
      pstm.setInt(2, meetid);
      pstm.executeUpdate();
    }
    catch (SQLException ex)
    {
      Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public static void cancelEvent(int meetid, String stdid)
  {
    Connection con = ConnectionBuilder.getConnection();
    String sql = "DELETE FROM ActMeet WHERE stdid = ? AND meetid = ?";
    try
    {
      PreparedStatement pstm = con.prepareStatement(sql);
      pstm.setString(1, stdid);
      pstm.setInt(2, meetid);
      pstm.executeUpdate();
    }
    catch (SQLException ex)
    {
      Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public static List<Account> getEventAccount(int meetid)
  {
    List<Account> all = null;
    Account a = null;
    Connection con = ConnectionBuilder.getConnection();
    String sql = "SELECT DISTINCT a.fname,a.lname FROM Account a JOIN ActMeet b ON a.stdid = b.stdid WHERE b.meetid=?";
    try
    {
      PreparedStatement pstm = con.prepareStatement(sql);
      pstm.setInt(1, meetid);
      ResultSet rs = pstm.executeQuery();
      while (rs.next())
      {
        a = new Account();
        a.setName(rs.getString("fname"));
        a.setSurname(rs.getString("lname"));
        if (all == null) {
          all = new ArrayList();
        }
        all.add(a);
      }
    }
    catch (SQLException e)
    {
      System.out.println(e);
    }
    return all;
  }
  
  public static Event getEvent(int meetid)
  {
    Event a = null;
    Connection con = ConnectionBuilder.getConnection();
    String sql = "SELECT * FROM Event WHERE meetid = ?";
    try
    {
      PreparedStatement pstm = con.prepareStatement(sql);
      pstm.setInt(1, meetid);
      ResultSet rs = pstm.executeQuery();
      if (rs.next())
      {
        a = new Event();
        a.setMeetid(rs.getInt("meetid"));
        a.setMeetname(rs.getString("meetname"));
        a.setMeetdate(rs.getString("meetdate"));
        a.setTime(rs.getString("meettime"));
        a.setLocation(rs.getString("location"));
        a.setCharges(rs.getDouble("charges"));
        a.setDetail(rs.getString("detail"));
        a.setNumber(rs.getInt("number"));
        a.setCreated(rs.getString("createdtime"));
        a.setStdid(rs.getString("stdid"));
      }
    }
    catch (SQLException e)
    {
      System.out.println(e);
    }
    return a;
  }
}
