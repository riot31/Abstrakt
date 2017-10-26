package com.springsource.petclinic.web;
import org.springframework.social.linkedin.api.Companies;
import org.springframework.social.linkedin.api.Company;
import org.springframework.social.linkedin.api.LinkedIn;
import org.springframework.social.linkedin.api.impl.LinkedInTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;



@Controller
public class NavigationController {

    public static String token;

    private static final String ACC_KEY = "771efm4ji87uw6";
    private static final String ACC_SECRET = "UOht0NEI1yvDld8Z";

    @RequestMapping("/google")
    public String showService(Model model) {
        model.addAttribute("date", "second");
        return "google";
    }

    @RequestMapping("/")
    public String showMain(Model model) {
        model.addAttribute("date", "main");
        return "main";
    }

    @RequestMapping("/linkedin")
    public String showLinkedin(Model model) {
        LinkedIn linkedin = new LinkedInTemplate(ACC_KEY);
        Companies comp = linkedin.companyOperations().search("jetbi.com");

        List<Company> companyList = comp.getCompanies();
        model.addAttribute("companyList", companyList);
        return "linkedin";
    }




}
