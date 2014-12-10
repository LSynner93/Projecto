
package com.hm.controlador;

import com.hm.modelo.DAOUsuarioImpl;
import com.hm.modelo.Usuario;
import java.util.ArrayList;


public class GenerarUsuarios {
    public static String obtenerUsuario()throws Exception{
        DAOUsuarioImpl du=new DAOUsuarioImpl();
        
   
        return du.obtenerTodos() ;
        
    }
}
