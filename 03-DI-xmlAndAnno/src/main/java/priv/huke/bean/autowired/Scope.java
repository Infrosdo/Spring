package priv.huke.bean.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@org.springframework.context.annotation.Scope(value = "prototype")
@Component
public class Scope {
    @Value("23")
    private int id;
    @Value("Durant")
    private String name;

    @PostConstruct
    public void post(){
        System.out.println("创建user实例");
    }

    @Override
    public String toString() {
        return "Scope{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
