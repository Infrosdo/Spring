package priv.huke.dao;

import priv.huke.po.User;
import priv.huke.util.Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    public void addUser(User user) {
        Connection conn = Jdbc.getConn();

        String sql = "INSERT INTO user(name, age, address) values (?,?,?)";
        PreparedStatement pstmt;

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getName());
            pstmt.setInt(2, user.getAge());
            pstmt.setString(3, user.getAddress());
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
