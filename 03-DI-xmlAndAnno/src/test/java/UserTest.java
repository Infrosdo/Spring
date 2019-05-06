import jdk.jfr.Name;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import priv.huke.bean.autowired.Scope;
import priv.huke.bean.autowired.Type;
import priv.huke.bean.value.BaseValueInject;
import priv.huke.bean.value.ConfigurationFileInject;
import priv.huke.bean.value.ValueDemo;

import javax.annotation.Resource;
import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class UserTest {

    //@Value注入
    //1.不通过配置文件的注入属性的情况
    @Autowired
    private BaseValueInject baseValueInject;

    @Test
    public void baseValueInject() {
        System.out.println(baseValueInject.toString());
    }

    //2.通过配置文件的注入属性的情况
    @Autowired
    private ConfigurationFileInject configurationFileInject;

    @Test
    public void configurationFileInject() {
        System.out.println(configurationFileInject.toString());
    }

    //3.# $区别
    @Autowired
    private ValueDemo valueDemo;

    @Test
    public void valueDemo() {
        System.out.println(valueDemo.toString());
    }

    //按类型注入域属性
    @Autowired
    private Type type1;

    @Inject
    private Type type2;

    @Test
    public void type() {
        System.out.println(type1.toString());
        System.out.println(type2.toString());
    }

    //按名称注入域属性
    @Autowired
    @Qualifier("name")
    private Type type4;

    @Inject
    @Name("name")
    private Type type5;

    @Resource(name="name")
    private Type type6;

    @Test
    public void type2() {
        System.out.println(type4.toString());
        System.out.println(type5.toString());
        System.out.println(type6.toString());
    }

    //scope
    @Autowired
    private Scope scope1;

    @Autowired
    private Scope scope2;

    @Test
    public void scope() {
        System.out.println(scope1.toString());
        System.out.println(scope2.toString());
    }
}