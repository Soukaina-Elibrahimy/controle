package com.example.controle.controller;

import com.example.controle.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeController {
    @Autowired
    private EmployeService employeService;

    @GetMapping("/employes")
    public String listEmployes(Model model) {
        model.addAttribute("employes", employeService.findAll());
        return "employe-list";
    }
}
