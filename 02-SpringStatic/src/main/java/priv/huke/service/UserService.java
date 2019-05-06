package priv.huke.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import priv.huke.dao.UserDao;
import priv.huke.po.User;

public class UserService {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.addUser(user);
    }
}
