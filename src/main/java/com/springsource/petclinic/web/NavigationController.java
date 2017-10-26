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

import static javafx.css.StyleOrigin.USER_AGENT;


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
        LinkedIn linkedin = new LinkedInTemplate(token);
        Companies comp = linkedin.companyOperations().search("jetbi.com");

        List<Company> companyList = comp.getCompanies();
        model.addAttribute("companyList", companyList);
        return "linkedin";
    }



    public NavigationController() {
        LinkedInServiceProvider serviceProvider = new LinkedInServiceProvider(ACC_KEY, ACC_SECRET);
        OAuth2Operations template = serviceProvider.getOAuthOperations();
        this.token = template.authenticateClient().getAccessToken();
    }


    // HTTP GET request
    private void sendGet() throws Exception {

        String url = "http://www.google.com/search?q=mkyong";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        String USER_AGENT = "Mozilla/5.0";
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }


}
