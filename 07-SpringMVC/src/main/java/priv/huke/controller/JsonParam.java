package priv.huke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import priv.huke.pojo.User;

@Controller
public class JsonParam {

    @RequestMapping(value = "/requestJson",method = RequestMethod.POST)
    @ResponseBody
    public User requestJson(@RequestBody User user) {
        System.out.println(user);
        return user;
    }
}