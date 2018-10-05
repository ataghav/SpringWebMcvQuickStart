package com.me.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/* com.me.controllers
@Author:Peyman
Date: 04/10/2018
Time: 10:23 AM
Year: 2018
*/
@Controller
public class MainController {
    @RequestMapping("/")
    public String home(){
      return "hello";
    }
}
