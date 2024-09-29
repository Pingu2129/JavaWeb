package org.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SessionController {

    @GetMapping("/setSession")
    public String setSession(HttpSession session, @RequestParam String value) {
        session.setAttribute("myAttribute", value);
        return "Session value set!";
    }

    @GetMapping("/getSession")
    public String getSession(HttpSession session) {
        return "Session value: " + session.getAttribute("myAttribute");
    }
}
