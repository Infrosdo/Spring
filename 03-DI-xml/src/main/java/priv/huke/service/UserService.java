package priv.huke.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import priv.huke.po.UserContructorDI;
import priv.huke.po.UserSetDI;
import priv.huke.po.UserSetRef;

public class UserService {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Contructor方式
        UserContructorDI userContructorDI = (UserContructorDI) applicationContext.getBean("userContructorDI");
        System.out.println(userContructorDI);
        //Set手动装配方式
        UserSetDI userSetDI = (UserSetDI) applicationContext.getBean("userSetDI");
        System.out.println(userSetDI);

        UserSetRef userSetRef = (UserSetRef) applicationContext.getBean("userSetRef");
        System.out.println(userSetRef);
    }
}
