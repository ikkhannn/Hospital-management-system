/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_Mgt_System;

import java.sql.*;
/**
 *
 * @author me
 */
public class sahidb {
     public static Connection getConnection() throws Exception{
    try{
        
        String url="jdbc:ucanaccess://C:\\Users\\me\\Documents\\NetBeansProjects\\oop2\\project.accdb";
       
        
        
        
        Connection conn=DriverManager.getConnection(url);
        System.out.println("connected");
        return conn;
    }catch(Exception e){
        System.out.println(e);
       
    }
return null;
}
}
