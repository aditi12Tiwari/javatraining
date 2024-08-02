import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.awt.*;
import javax.awt.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JDBC {
 public static void main(String[] args){
    String url = "jdbc:mysql://localhost:3306/RailwayBookingSystem";
    String username ="root";
    String password="";


    try (Connection conn = DriverManager.getConnection(url,username,password)) {
      System.out.println("DB connected");


      JFrame frame = new JFrame("Railway Booking System");
      

      JLabel personal_label= new JLabel("Personal Details");
      personal_label.setBounds(310,10,120,30);
      frame.add(personal_label);


      JLabel ticket_details_label= new JLabel("Ticket Details");
      ticket_details_label.setBounds(10,10,120,30);
      frame.add(ticket_details_label);

      JLabel username_label= new JLabel("Add Username");
      username_label.setBounds(10,50,120,30);
      frame.add(username_label);


      JTextField username_field = new JTextField();
      username_field.setBounds(130,50,100,30);
      frame.add(username_field);


      JLabel date_of_journey_label= new JLabel("Add Username");
      date_of_journey_label.setBounds(310,50,120,30);
      frame.add(date_of_journey_label);


      JTextField date_of_journey_field= new JTextField();
      date_of_journey_field.setBounds(420,50,100,30);
      frame.add(date_of_journey_field);


      JLabel age_label= new JLabel("Add age");
      age_label.setBounds(10,80,120,30);
      frame.add(username_label);


      JTextField age_field = new JTextField();
      age_field.setBounds(130,80,100,30);
      frame.add(age_field);


      JLabel source_label= new JLabel("Source");
      source_label.setBounds(310,80,120,30);
      frame.add(source_label);


      JTextField source_field= new JTextField();
      source_field.setBounds(420,80,100,30);
      frame.add(source_field);

      JLabel gender_label= new JLabel("Gender");
     gender_label.setBounds(10,50,120,30);
      frame.add(gender_label);


      JTextField gender_field = new JTextField();
      gender_field.setBounds(130,50,100,30);
      frame.add(gender_field);


      JLabel mobile_label= new JLabel("Enter mobile");
      mobile_label.setBounds(130,310,120,30);
      frame.add(mobile_label);


      JTextField mobile_field= new JTextField();
      mobile_field.setBounds(420,50,100,30);
      frame.add(mobile_field);


      JLabel username_label= new JLabel("Add Username");
      username_label.setBounds(10,50,120,30);
      frame.add(username_label);


      JTextField username_field = new JTextField();
      username_field.setBounds(130,50,100,30);
      frame.add(username_field);


      JLabel date_of_journey_label= new JLabel("Add Username");
      date_of_journey_label.setBounds(310,50,120,30);
      frame.add(date_of_journey_label);


      JTextField ticket_price_field= new JTextField();
      ticket_price_field.setBounds(430,50,100,30);
      frame.add(ticket_price_field);
      
      
      
      frame.setSize(500,600);
      frame.setLayout(null);
      frame.setVisible(true);
      frame.getContentPane.getBackground(Color.GRAY);



      //update the data in database
      String updateQuery = "update ticketBookingTB set username=?,age=?,gender=? where bookingid=?";
      PreparedStatement ps = conn.prepareStatement(updateQuery);
      ps.setString(1,"Anjali");
      ps.setInt(2,24);
      ps.setString(3,"female");
      ps.setInt(4,1);
      ps.execute();
      System.out.println("record updated");


      //delete the data from table
      // String deleteQuery = "delete from ticketBookingTB where bookingid=?";
      // PreparedStatement  ps = conn.prepareStatement(deleteQuery);
      // ps.setInt(1,3);
      // ps.execute();
      // System.out.println("One Record is deleted");


      //add booking info
      // String insertQuery = "insert into ticketBookingTB(username,age,gender,mobile,email,doj,source,destination,ticketprice,seatpreference) values(?,?,?,?,?,?,?,?,?,?)";
      // PreparedStatement ps = conn.prepareStatement(insertQuery);
      // ps.setString(1,"Amodh");
      // ps.setInt(2,20);
      // ps.setString(3,"male");
      // ps.setString(4,"9569248173");
      // ps.setString(5,"mishramodh");
      // ps.setString(6,"2/2/2024");
      // ps.setString(7,"lucknow");
      // ps.setString(8,"delhi");
      // ps.setString(9,"390");
      // ps.setString(10,"up");
      // ps.execute();
      // System.out.println("your ticket booked");

   } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
   }
 }
}
