package priv.huke.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import priv.huke.dao.UserDao;
import priv.huke.pojo.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUserXml(int outId, int inId, int age) {
        userDao.updateUser(outId,-age);
        int i = 1 / 0;
        userDao.updateUser(inId,age);
    }

    @Override
    @Transactional
    public void updateUserAnno(int outId, int inId, int age) {
        userDao.updateUser(outId,-age);
        int i = 1 / 0;
        userDao.updateUser(inId,age);
    }
}
