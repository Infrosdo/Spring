package priv.huke;//spring容器初始化时，会调用配置类的无参构造函数

import org.springframework.context.annotation.*;
import priv.huke.bean.User;

//1.@Configuration
@Configuration
//2.@ComponentScan : <context:component-scan>
@ComponentScan(basePackages = "priv.huke")
//3.@PropertySource : <context:property-placeholder>
@PropertySource("classpath:")
@Import({OtherConfig.class})
public class SpringConfiguration {

    public SpringConfiguration() {
        System.out.println("容器启动初始化。。。");
    }

    //4.@Bean : <bean>
    @Bean
    @Scope("prototype")
    public User User() {
        return new User(1,"asd");
    }

    //5

}