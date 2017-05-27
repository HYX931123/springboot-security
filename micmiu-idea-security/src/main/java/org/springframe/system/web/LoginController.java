package org.springframe.system.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by HeYixuan on 2017/4/14.
 */
@Controller
public class LoginController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        return "login";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(){
        return "403";
    }

    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public String Not_Found(){
        return "404";
    }

    @RequestMapping(value = "/500", method = RequestMethod.GET)
    public String SERVER_ERROR(){
        return "500";
    }

    @RequestMapping(value = "/extra_lock1", method = RequestMethod.GET)
    public String extra_lock1(){
        return "extra_lock1";
    }

    @RequestMapping(value = "/extra_lock2", method = RequestMethod.GET)
    public String extra_lock2(){
        return "extra_lock2";
    }
}
