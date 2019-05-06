package priv.huke.bean.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueDemo {

    @Value("#{configProperties['key1']}")
    private String value1;

//    @Value("${key2}")
//    private String value2;

    public String getValue1() {
        return value1;
    }

//    public String getValue2() {
//        return value2;
//    }

    @Override
    public String toString() {
        return "ValueDemo{" +
                "value1='" + value1 + '\'' +
                '}';
    }
}
