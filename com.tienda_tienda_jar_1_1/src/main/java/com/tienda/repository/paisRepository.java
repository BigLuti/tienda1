/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.repository;

import com.tienda.entity.pais;
import com.tienda.entity.persona;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/*
 *
 * @author luti
 */
@Repository
public interface paisRepository extends CrudRepository<pais,Long>{

}
