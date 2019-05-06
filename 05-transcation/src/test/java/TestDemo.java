import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import priv.huke.pojo.User;
import priv.huke.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestDemo {

    @Autowired
    UserService userService;

    @Test
    public void testSaveXml() {
        userService.updateUserXml(39,41,5);
    }

    @Test
    public void testSaveAnno() {
        userService.updateUserAnno(39,41,5);
    }

}
