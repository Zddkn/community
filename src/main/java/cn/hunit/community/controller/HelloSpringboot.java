package cn.hunit.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class HelloSpringboot {
    @RequestMapping("/Hello")
    public String Hello(@RequestParam(name = "name",required = false,defaultValue = "Hi") String name, Model model){
        model.addAttribute("name",name);
        return "Hello";
    }
}
