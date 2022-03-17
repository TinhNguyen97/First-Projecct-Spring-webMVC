package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //là annotation để đánh dấu lớp GreetingController là một controller (đối tượng sẽ xử lý các request)
public class GreetingController {
@GetMapping("/greeting" )
    public String greeting(@RequestParam(required = false) String name, Model model)
{
    model.addAttribute("name",name);
    return "index"; //ten file muon hien thi
}
}
