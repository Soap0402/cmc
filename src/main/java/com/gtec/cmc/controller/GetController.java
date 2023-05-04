package com.gtec.cmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController
{
    @GetMapping("loginp")
    public String loginp(){
        return "loginp!";
    }
}
