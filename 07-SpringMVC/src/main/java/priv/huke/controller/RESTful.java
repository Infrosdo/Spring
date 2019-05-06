package priv.huke.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("restful")
//@RestController=@Controller+@ResponseBody
@RestController
public class RESTful {

    @GetMapping("{id}")
    public void query(@PathVariable Integer id) {
        System.out.println("query"+id);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.POST)
    public void insert(@PathVariable Integer id) {
        System.out.println("insert"+id);
    }

    @PutMapping("{id}")
    @ResponseBody
    public void update(@PathVariable Integer id) {
        System.out.println("update"+id);
    }
}
