package priv.huke.dao;

import priv.huke.pojo.User;

public interface UserDao {
    void saveUser(User user);
    void updateUser(User user);

    void updateUser(int id, int age);
}
