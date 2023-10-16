package com.example.demo12.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping(value = "/test")
    public String test() {
        return "test";
    }

    @GetMapping(value = "/info")
    public String info() {
        return "info";
    }

    @GetMapping(value = "/data")
    public String data(@RequestParam(value = "param1",required=true)String param1, Model model) {
        model.addAttribute("data", "우와"+param1);
        return "data";
    }
    @GetMapping("/param1")
    public String param1(@RequestParam String name, Model model) {
        model.addAttribute("data", "데이터");
        model.addAttribute("name", name);
        return "param1";
    }
}