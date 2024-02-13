package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticleController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/addArticle")
    public String addArticle(){
        return "addArticle";
    }

    @PostMapping("/addArticle")
    public String addArticle(@RequestParam String title, @RequestParam String content, @RequestParam String author){
        System.out.println(title);
        System.out.println(content);
        System.out.println(author);
        return "";
    }
}
