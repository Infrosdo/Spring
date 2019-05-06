package priv.huke.service;

import priv.huke.dao.UserDao;
import priv.huke.dao.UserDaoImpl;
import priv.huke.po.User;

public class UserService {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        User user = new User();
        user.setName("versionTest");
        user.setAge(1);
        user.setAddress("asd");
        userDao.addUser(user);
    }
}
