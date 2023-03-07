package com.parcial.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.parcial.springweb.models.Empleado;

import jakarta.validation.Valid;

@Controller
public class FormController{
    @GetMapping({"/", "", "/form"})
    public String form(Model model) {
        Empleado empleado = new Empleado();
        model.addAttribute("titulo", "Formulario");
        model.addAttribute("empleado", empleado);
        return "form";
    }

    @PostMapping("/form")
    public String procesar(@Valid Empleado empleado, BindingResult result, Model model){
        if (result.hasErrors()){
            model.addAttribute("titulo", "Resultado formulario");
            return "form";
        }
        return "resultado";
    }
}