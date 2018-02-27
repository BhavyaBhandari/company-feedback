/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author BHAVYA
 */
public class Confac {
    
    public static Connection getcon()
    { 
        Connection con=null;
        
        try{ 
            Driver driver=new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            con=DriverManager.getConnection("jdbc:mysql:///feedback","root","");
        }
        catch(Exception e)
        {
            System.out.println("error"+e.toString());
        }
        return(con);
    }
    
    
    
    
}
