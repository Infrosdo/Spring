package priv.huke.bean.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("name")
public class Type {
    @Value("12")
    private int id;
    @Value("James")
    private String name;

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
