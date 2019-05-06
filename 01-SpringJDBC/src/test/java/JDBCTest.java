import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JDBCTest {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Test
    public void run() {
        jdbcTemplate.update("insert into user VALUES (null,?,?,?)", "米波大神", 12, "hdmd");
    }

    @Test
    // 查询一条记录
    public void demo4() {
        User user = jdbcTemplate.queryForObject("select * from user where id =?", new BeanMapper(), 16);
        System.out.println(user);
    }


}
