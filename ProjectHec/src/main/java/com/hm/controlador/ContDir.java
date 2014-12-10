/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.controlador;

import com.hm.modelo.DAODirl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class ContDir {
    
   @RequestMapping(value="/direccion", method=RequestMethod.GET, headers={"Accept=Applicaction/json"})
    public @ResponseBody String todos()throws Exception{
      DAODirl di=new DAODirl();
     
return di.obtenerTodos();
    }
    
}
