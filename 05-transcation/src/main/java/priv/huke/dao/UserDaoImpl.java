package priv.huke.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import priv.huke.pojo.User;

import javax.sql.DataSource;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

//    @Autowired
//    public void setJb(JdbcTemplate jb) {
//        super.setJdbcTemplate(jb);
//    }

    @Autowired
    public void setDs(DataSource dataSource) {
        super.setDataSource(dataSource);
    }

    @Override
    public void saveUser(User user) {
        String sql = "insert into user (name,age,address) values (?,?,?)";
        int update = this.getJdbcTemplate().update(sql, user.getName(), user.getAge(), user.getAddress());
        System.out.println(update);
    }

    @Override
    public void updateUser(User user) {
        String sql = "update user set name=?,age=?,address=? where id=?";
        int update = this.getJdbcTemplate().update(sql,user.getName(),user.getAge(),user.getAddress(),user.getId());
        System.out.println(update);
    }

    @Override
    public void updateUser(int id, int age) {
        String sql = "update user set age=age+? where id=?";
        int update = this.getJdbcTemplate().update(sql,age,id);
        System.out.println(update);
    }
}
