package com.gtec.cmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Controller
public class PageController {
    @GetMapping("/funeral")
    public String funeralgpage(){
        return "funeral";
    }
    @GetMapping("/newyear")
    public String newyearpage(){
        return "newyear";
    }
//    @GetMapping("/survey")
//    public String surveyPage(){ return "survey";}
}

