/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.controlador;


import com.hm.modelo.DAOUsu;
import com.hm.modelo.Direc;
import com.hm.modelo.UsuDirec;
import com.hm.modelo.Usu;
import java.util.List;


import org.codehaus.jackson.map.ObjectMapper;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

@RequestMapping("/")
public class Pedorrin {

    
    
    @RequestMapping(value="/LOCOCHON", method=RequestMethod.GET, headers={"Accept=application/json"})
    public @ResponseBody String hola()throws Exception{
    
        return CrearUsus.obtenerUsuario();
    }
    
    
    
   
    
}
