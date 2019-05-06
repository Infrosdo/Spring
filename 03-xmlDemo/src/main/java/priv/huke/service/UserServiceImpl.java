package priv.huke.service;

import priv.huke.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.huke.pojo.User;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
