package com.essabri.ssiacha5ex1.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FZ.ESSABRI
 */
@RestController
public class HomeController {
    @GetMapping("/")
    public String hello(){
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication a = context.getAuthentication();
        return "Hello, "+ a.getName() + "!";
    }
}
