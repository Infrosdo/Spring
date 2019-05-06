package priv.huke.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
        this.getJdbcTemplate().update(sql,user.getName(),user.getAge(),user.getAddress());
        System.out.println("save user");
    }
}
