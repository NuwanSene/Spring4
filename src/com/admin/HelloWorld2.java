package com.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld2 {
  
  private Login login;
   

  @RequestMapping("/nuwan")  
  public String helloWorld(ModelMap model) {   
    model.addAttribute("message", "nuwan");
    return "welcome";
  }  
  
  @RequestMapping("/login")  
  public String login(ModelMap model) { 
    model.addAttribute("login", new Login());
    return "login";
  }  
  
  @RequestMapping("/successLogin")  
  public String successLogin(@ModelAttribute("SpringWeb")Login login,ModelMap model) {    
    return "success";
  }  
  
  public Login getLogin() {
    return login;
  }

  public void setLogin(Login login) {
    this.login = login;
  }
 
}
