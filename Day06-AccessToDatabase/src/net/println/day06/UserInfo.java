package net.println.day06;

import net.println.day06.annotations.Column;
import net.println.day06.annotations.Table;

/**
 * Created by benny on 6/19/16.
 */
@Table("userinfo")
public class UserInfo {
    @Column(name = "id", type = Integer.class)
    public int id;
    @Column(name = "username", type = String.class)
    public String username;
    @Column(name = "age", type = Integer.class)
    public int age;
    @Column(name = "passwd", type = String.class)
    public String passwd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfo userInfo = (UserInfo) o;

        if (id == userInfo.id) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
