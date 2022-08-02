/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.persona;
import java.util.List;

/**
 *
 * @author luti
 */
public interface IPpersonaService {
    public List<persona> getAllpersona();
    public persona getpersonaById();
    public void savepersona();
    public void delete(long id);
    
    
    
}
