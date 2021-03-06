package com.springsource.petclinic.web;
import org.springframework.social.linkedin.api.Companies;
import org.springframework.social.linkedin.api.Company;
import org.springframework.social.linkedin.api.LinkedIn;
import org.springframework.social.linkedin.api.impl.LinkedInTemplate;
import org.springframework.social.linkedin.connect.LinkedInServiceProvider;
import org.springframework.social.oauth2.OAuth2Operations;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;



@Controller
public class NavigationController {

    private static String token;

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
        if(token == null) {
            getToken();
        }
        LinkedIn linkedin = new LinkedInTemplate(token);
        Companies comp = linkedin.companyOperations().search("jetbi.com");

        List<Company> companyList = comp.getCompanies();
        model.addAttribute("companyList", companyList);
        return "linkedin";
    }


    private void getToken() {
        LinkedInServiceProvider serviceProvider = new LinkedInServiceProvider(ACC_KEY, ACC_SECRET);
        OAuth2Operations template = serviceProvider.getOAuthOperations();
        token = template.authenticateClient().getAccessToken();
    }




}
