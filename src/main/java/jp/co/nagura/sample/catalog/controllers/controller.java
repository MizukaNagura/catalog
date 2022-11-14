package jp.co.nagura.sample.catalog.controllers;

import java.util.ArrayList;
import java.util.List;
//import java.security.KeyStore.Entry.Attribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.nagura.sample.catalog.bean.Animal;
import jp.co.nagura.sample.catalog.bean.Person;

@Controller
public class controller {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name, Model model, String attributeName) {
        model.addAttribute(attributeName, name);
        return "test";
    }

    @GetMapping("/lists")
    public String lists(Model model) {
        // 動物
         List<Animal> animals = new ArrayList<>();
         animals.add(new Animal(01, "CAT")); 
         animals.add(new Animal(02, "DOG")); 

         
          // 投稿者
        List<Person> lists = new ArrayList<>();
        //lists.add(new Person(personId:1,personName;桜木花道,めがね君引退が伸びたな、この天才のおかげで,new Animal(01, "CAT"),1,null,null)); 
        //lists.add(new Person(personId:2,桜木花道,めがね君引退が伸びたな、この天才のおかげで,new Animal(01, "CAT"),1,null,null)); 
        lists.add(new Person(1, "桜木花道", "めがね君引退が伸びたな、この天才のおかげで", new Animal(01, "CAT"), null, null));
        lists.add(new Person(2, "三井寿", "くそ…… なぜオレはあんなムダな時間を……", new Animal(02, "DOG"), null, null));


        //model.addAttribute(attributeName: "animals", animals); 
        //model.addAttribute(attributeName: "persons", lists); 
        model.addAttribute("animals", animals);
        model.addAttribute("lists", lists);
    
        return "list";
    }

}
