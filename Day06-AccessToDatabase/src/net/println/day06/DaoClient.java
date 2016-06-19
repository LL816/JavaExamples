package net.println.day06;

import java.util.List;

/**
 * Created by benny on 6/19/16.
 */
public class DaoClient {
    public static void main(String... args) {
        Dao dao = new Dao();
//        UserInfo userInfo = new UserInfo();
//        userInfo.age = 23;
//        userInfo.username = "才璐";
//        userInfo.passwd = "2323";
//        System.out.println(dao.insert(userInfo));

        UserInfo userInfo = dao.query(4);
        System.out.println(userInfo);

        List<UserInfo> userInfos = dao.query("username", "benny");
        for (UserInfo info : userInfos) {
            System.out.println(info);
        }
    }
}
