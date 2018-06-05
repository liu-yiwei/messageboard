package club.leva.messageboard.controller;

import club.leva.messageboard.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/")
    public String My(Model model){
        User single = new User();//这里应该从数据库获取

        model.addAttribute("a","a");

        return "my";
    }
}
