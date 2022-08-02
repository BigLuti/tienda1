/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.entity.persona;
import com.tienda.service.IPpersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author luti
 */
public class personaController {
    @Autowired
    private IPpersonaService personaService;
    
    @GetMapping("/persona")
    public String index (Model model){
        List<persona> listaPersona = personaService.getAllpersona();
        model.addAttribute("titulo","Tabla Personas");
        model.addAttribute("personas", listaPersona);
        return "personas";
    }
    }
    
    

