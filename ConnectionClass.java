/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectivity;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dinithi W
 */
public class ConnectionClass {
    public Connection connection;
    public Connection getConnection() throws ClassNotFoundException, SQLException{
       
        String dbName = "sample";
        String userName = "root";
        String password = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);
        return connection;
    }
}
