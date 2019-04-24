package com.mvc.controller;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FreeMarkerController {

    @GetMapping("/freemarker")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", "yes, this is message.");
        return "welcome";
    }
}
