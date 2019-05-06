import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import priv.huke.SpringConfiguration;
import priv.huke.bean.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
public class UserTest {

    @Autowired
    User user;

    @Test
    public void Test(){
        System.out.println(user);
    }

//    @Test
//    public void Test2(){
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        User user = context.getBean(User.class);
//        System.out.println(user);
//    }
}