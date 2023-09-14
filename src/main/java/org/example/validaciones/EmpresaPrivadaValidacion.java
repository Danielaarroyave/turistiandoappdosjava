package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class EmpresaPrivadaValidacion {
    protected Util util= new Util();
    public boolean validarNombreRepresentanteLegal(String representanteLegal)throws Exception {

        if (representanteLegal.length() < 4) {
            throw new Exception(Mensaje.VALIDAR_NUMERO_CARACTERES_REPRESENTANTE.getMensaje());
        }else if(!util.validarExpresionRegular(representanteLegal,"^[A-Za-z ]+$")){ //2. NOMBRES SOLO PUEDEN TENER LETRAS
            throw new Exception(Mensaje.VALIDAR_NOMBRE_REPRESENTANTE .getMensaje());
        }else {
            return true;
        }
    }
}

