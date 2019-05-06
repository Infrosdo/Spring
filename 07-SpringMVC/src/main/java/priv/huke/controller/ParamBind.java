package priv.huke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import priv.huke.pojo.User;

@Controller
@RequestMapping("paramBind")
public class ParamBind {

    @RequestMapping("custom")
    public String custom(Integer id){
        System.out.println("获取到的参数是"+id);
        return "success";
    }

    @RequestMapping("pojo")
    public String custom(User user){
        System.out.println("获取到的参数是"+user);
        return "success";
    }

    @RequestMapping("custom2")
    public String custom2(@RequestParam(value = "itemId", required = false, defaultValue = "2") Integer id){
        System.out.println("获取到的参数是"+id);
        return "success";
    }
}
