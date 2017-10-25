package com.springsource.petclinic.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class NavigationController {
    @RequestMapping("/second")
    public String showService(Model model) {
        model.addAttribute("date", "second");
        return "main";
    }
    @RequestMapping("/")
    public String showMain(Model model) {
        model.addAttribute("date", "main");
        return "main";
    }
}
