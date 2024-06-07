package com.example.controle.controller;

import com.example.controle.model.Employe;
import com.example.controle.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeRestController {

        @Autowired
        private EmployeService employeService;

        @GetMapping("/employes")
        public List<Employe> getEmployes() {
            return employeService.findAll();
        }
}

