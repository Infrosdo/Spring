import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BeanMapper implements RowMapper<User> {
        public User mapRow(ResultSet rs, int arg1) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setAge(rs.getInt("age"));
            user.setName(rs.getString("name"));
            user.setAddress(rs.getString("address"));
            return user;
        }
}
