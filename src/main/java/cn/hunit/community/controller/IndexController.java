package cn.hunit.community.controller;

import cn.hunit.community.dto.PaginationDTO;
import cn.hunit.community.dto.QuestionDTO;
import cn.hunit.community.mapper.QuestionMapper;
import cn.hunit.community.mapper.UserMapper;
import cn.hunit.community.model.Question;
import cn.hunit.community.model.User;
import cn.hunit.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        //page页码
                        @RequestParam(name = "page",defaultValue = "1") Integer page,
                        //size每页的数量
                        @RequestParam(name = "size",defaultValue = "10") Integer size) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length != 0){
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")){
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if (user != null){
                        request.getSession().setAttribute("user",user);
                    }
                    break;
                }
            }
        }
        PaginationDTO pagination = questionService.list(page,size);
        model.addAttribute("pagination",pagination);
        return "index";
    }
}
