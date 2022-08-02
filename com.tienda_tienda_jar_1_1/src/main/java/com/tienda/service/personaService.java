/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.persona;
import com.tienda.repository.personaRepository;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luti
 */
@Service
public class personaService implements IPpersonaService {

    @Autowired
    private personaRepository personaRepository;

    @Override
    public List<persona> getAllpersona() {
        return (List<persona>) personaRepository.findAll();
    }
    
    @Override
    public void delete(long id) {
        personaRepository.deleteAllById(id);

    }

    @Override
    public persona getpersonaById() {
        return personaRepository.findById(id).orElse(null);   
    }

    @Override
    public void savepersona() {
        personaRepository.save (persona);   
    }

}
