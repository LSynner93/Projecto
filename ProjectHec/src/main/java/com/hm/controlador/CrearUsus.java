
package com.hm.controlador;

import com.hm.modelo.DAOUsu;
import com.hm.modelo.Usu;
import java.util.ArrayList;



public class CrearUsus {
    public static String obtenerUsuario()throws Exception{
        DAOUsu du=new DAOUsu();
        
   
        return du.obtenerTodos() ;
        
    }
}
