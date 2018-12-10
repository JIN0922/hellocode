package org.fkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController
{
//
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("message","jin");
//        mv.setViewName("/WEB-INF/content/jin.jsp");
//        return mv;
//    }


//    @ModelAttribute
//    public void useMode(String a, String b, String c, ModelMap modelMap)
//    {
//        User user = new User();
//        user.setLoginname(a);
//        user.setPassword(b);
//        modelMap.addAttribute("user", user);
//    }
//
//    @RequestMapping("/hello")
//    public String hello(ModelMap modelMap)
//    {
//        User user = (User) modelMap.get("user");
//        System.out.print(user);
//        user.setUsername("eee");
//
//        return "jin";
//    }

}
