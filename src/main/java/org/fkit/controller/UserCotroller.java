package org.fkit.controller;


import org.fkit.converter.DateEditor;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/ConverTest")
public class UserCotroller
{
    @RequestMapping(value = "/{re}")
    public String loginForm(@PathVariable String re)
    {
        return re;
    }


    @RequestMapping("/register")
    public String register(
            @ModelAttribute User user,
            Model model
    )
    {
        model.addAttribute("user", user);
        return "success";
    }


    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        binder.registerCustomEditor(Date.class,new DateEditor());
    }
}
