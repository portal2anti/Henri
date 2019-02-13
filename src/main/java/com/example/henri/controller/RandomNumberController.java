package com.example.henri.controller;

import com.example.henri.model.RandomModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RandomNumberController {

    private RandomModel randomModel = new RandomModel();

    @RequestMapping("/randomNumber")
    public String getRandomPage(Model model) {
        model.addAttribute("randomNumber", randomModel.getRandomNumber());

        return "randomNumberPage";
    }


}
