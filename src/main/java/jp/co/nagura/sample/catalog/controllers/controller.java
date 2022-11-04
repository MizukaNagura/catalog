package jp.co.nagura.sample.catalog.controllers;

//import java.security.KeyStore.Entry.Attribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name, Model model, String attributeName) {
        model.addAttribute(attributeName, name);
        return "test";
    }

}
