package com.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {    
  
      @RequestMapping("/welcome.do")
      public String helloWorld(ModelMap model) {   
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "welcome";
      }  
      
      @RequestMapping("/welcome2")
      public String welcome2(ModelMap model) {   
        model.addAttribute("message", "Hello Nuwan!");
        return "welcome";
      }  
}
