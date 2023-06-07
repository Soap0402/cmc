package com.gtec.cmc.controller;

import com.gtec.cmc.dto.SurveyDto;
import com.gtec.cmc.service.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SurveyController {
    private final SurveyService surveyService;

    @GetMapping("/survey_wedding")
    public String surveyForm(){
        return "survey_wedding";
    }

    @PostMapping("wedding")
    public String save(@ModelAttribute SurveyDto surveyDto){
        System.out.println("surveyController.save");
        System.out.println("surveyDto = " + surveyDto);
        surveyService.save(surveyDto);

        return  "redirect:/wedding";
    }

    @GetMapping("/wedding")
    public String findAll(Model model){
        List<SurveyDto> surveyDtoList = surveyService.findAll();
        model.addAttribute("surveyList",surveyDtoList);
        return "wedding";
    }
}
