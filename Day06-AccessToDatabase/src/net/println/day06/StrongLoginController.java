package net.println.day06;

import java.sql.*;

/**
 * Created by benny on 6/19/16.
 */
public class StrongLoginController {


    public boolean login(String username, String passwd){
        if("".equals(username) || "".equals(passwd)){
            return false;
        }
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }

        Connection conn = null;
        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/user?" +
                            "user=root&password=");
            String sql = "select * from userinfo where username=? and passwd=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, passwd);
            System.out.println(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return true;
            }
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return false;
    }

}
