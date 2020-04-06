package com.example.demo.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class GreetingController {

    @RequestMapping(value = "/current-date", method = RequestMethod.GET)
    @ResponseBody
    public String getCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date(); 
        return "Current date: " + formatter.format(date);
    }

    @PostMapping(path = "/welkom")
    public String test(@RequestBody String naam, HttpServletResponse response) {
        return "Welkom " + naam + "!";
    }
}
