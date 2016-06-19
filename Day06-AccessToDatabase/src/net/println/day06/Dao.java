package net.println.day06;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by benny on 6/19/16.
 */
public class Dao {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    Connection connection;

    public Dao() {
        try {
            connection =
                    DriverManager.getConnection("jdbc:mysql://localhost/user?" +
                            "user=root&password=");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public boolean insert(UserInfo userInfo) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT into userinfo(username, passwd, age) VALUES (?,?,?)");
            preparedStatement.setInt(3, userInfo.age);
            preparedStatement.setString(2, userInfo.passwd);
            preparedStatement.setString(1, userInfo.username);
            int count = preparedStatement.executeUpdate();
           return count > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public UserInfo query(Object id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from userinfo where id=?");
            preparedStatement.setObject(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                UserInfo userInfo = new UserInfo();
                userInfo.id = resultSet.getInt("id");
                userInfo.age = resultSet.getInt("age");
                userInfo.username = resultSet.getString("username");
                userInfo.passwd = resultSet.getString("passwd");
                return userInfo;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<UserInfo> query(String columnName, Object value){
        ArrayList<UserInfo> userInfoArrayList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from userinfo where "+columnName+"=?");
            preparedStatement.setObject(1, value);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                UserInfo userInfo = new UserInfo();
                userInfo.id = resultSet.getInt("id");
                userInfo.age = resultSet.getInt("age");
                userInfo.username = resultSet.getString("username");
                userInfo.passwd = resultSet.getString("passwd");
                userInfoArrayList.add(userInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userInfoArrayList;
    }
}
