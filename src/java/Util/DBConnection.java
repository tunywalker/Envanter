package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public Connection connect() {
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/envanter?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8", "envanter", "envanter44");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("*************************" + e.getMessage());
        }

        /*
        String databaseURL = "jdbc:mysql://localhost:3306/sakila?useSSL=false";
        Connection c = null;

        try {
            Properties props = new Properties();
            props.put("user", "sakila");
            props.put("password", "s4423");
            c = DriverManager.getConnection(databaseURL, props);
            //System.out.println(c);
            
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }
         */
        return c;
    }
}
