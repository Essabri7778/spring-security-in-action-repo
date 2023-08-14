package com.essabri.ssiacha5ex1.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author FZ.ESSABRI
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String hello(Model model, Authentication a){
        /*SecurityContext context = SecurityContextHolder.getContext();
        Authentication a = context.getAuthentication();
        return "Hello, "+ a.getName() + "!";*/
        model.addAttribute("userName",a.getName());
        model.addAttribute("pageTitle", "Thymeleaf demo");
        return "home.html";
    }

    @GetMapping("/home")
    public String showStudents(Model model){

        model.addAttribute("students", List.of("Essabri fatima zahrae",
                                                            "Nassim Benmamoun",
                                                            "Meriem Lamsellek"));
        return "studentList.html";
    }

}
