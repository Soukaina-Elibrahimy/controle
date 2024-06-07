package com.example.controle.controller;

import com.example.controle.model.Affecter;
import com.example.controle.service.AffectationService;
import com.example.controle.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjetController {
    @Autowired
    private ProjetService projetService;
    @Autowired
    private AffectationService affectationService;

    @GetMapping("/affectation")
    public String affectationForm(Model model) {
        model.addAttribute("affectation", new Affecter());
        model.addAttribute("employes", projetService.findAll());
        model.addAttribute("projets", projetService.findAll());
        return "affectation-form";
    }

    @PostMapping("/affectation")
    public String saveAffectation(@ModelAttribute Affecter affectation) {
        affectationService.save(affectation);
        return "redirect:/affectation";
    }
}