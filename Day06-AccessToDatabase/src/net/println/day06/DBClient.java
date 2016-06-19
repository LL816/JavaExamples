package net.println.day06;


import java.sql.*;
import java.util.ArrayList;

/**
 * Created by benny on 6/19/16.
 */
public class DBClient {
    public static void main(String... args) {
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

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from userinfo");

            ArrayList<UserInfo> userInfoArrayList = new ArrayList<>();
            while(resultSet.next()){
                UserInfo userInfo = new UserInfo();
                userInfo.id = resultSet.getInt("id");
                userInfo.age = resultSet.getInt("age");
                userInfo.username = resultSet.getString("username");
                userInfo.passwd = resultSet.getString("passwd");
                userInfoArrayList.add(userInfo);
            }

            for (UserInfo userInfo : userInfoArrayList) {
                System.out.println(userInfo);
            }

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
