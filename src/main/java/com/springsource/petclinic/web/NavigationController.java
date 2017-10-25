package com.springsource.petclinic.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("/")
@Controller
public class NavigationController {
    @RequestMapping(method = RequestMethod.GET)
    public String showMain(Model model) {
        model.addAttribute("date", "asdasdsa");
        return "main";
    }
}
