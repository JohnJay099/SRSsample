/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author bilca
 */
public class tables {

    
    public static void  main (String []args ){
        try{
            Connection con = (Connection) ConnectionProvider.getCon();
            Statement st = con.createStatement();
       // st.executeUpdate("create table addStudents(appuser_Pk int AUTO_INCREMENT primary key,userRole varchar(200), id varchar(200),username  varchar(200),email varchar(50),password varchar(200),name varchar(50),dob varchar(50),address varchar(50))");
      // st.executeUpdate("insert into addStudents(userRole,id, username,email, password,name,dob,address) values ('admin','01','admin','john@gamil.com','12345','Jan','jan12004','Tiptip')");
     st.executeUpdate("create table viewSub(username varchar(50),SubID int(20), Semester varchar(50), Hours varchar(50), Subjects varchar(50), Days varchar(50))");
          JOptionPane.showMessageDialog(null,"Table Created Successfully");
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
