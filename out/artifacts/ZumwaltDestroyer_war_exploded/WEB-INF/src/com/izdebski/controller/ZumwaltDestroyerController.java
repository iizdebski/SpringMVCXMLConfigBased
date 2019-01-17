package com.izdebski.controller;

import com.izdebski.service.ZumwaltDestroyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class ZumwaltDestroyerController {

    @Autowired
    private ZumwaltDestroyerService zumwaltDestroyerService;

    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView welcome(){
        return new ModelAndView("welcomePage", "welcomeMessage",
                zumwaltDestroyerService.welcomeMessage());
    }
    @RequestMapping(value="welcomeagain" ,method=RequestMethod.GET)
    public ModelAndView welcomeAgain(){
        return new ModelAndView("welcomePage", "welcomeMessage",
                zumwaltDestroyerService.welcomeAgainMessage());
    }
}