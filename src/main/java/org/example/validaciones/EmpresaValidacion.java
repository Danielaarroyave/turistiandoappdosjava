package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class EmpresaValidacion {
    protected Util util= new Util();

    public EmpresaValidacion(){
    }

    public boolean validarNit(String nit) throws Exception {
        //1.VALIDAR QUE EL NIT SOLO TENGA 10 DIGITOS
        if (nit.length() != 10) {
            throw new Exception(Mensaje.VALIDAR_NIT.getMensaje());

        }else if(!util.validarExpresionRegular(nit,"^[0-9]+(-[0-9]+)?$"))
        {
            throw new Exception(Mensaje.VALIDAR_NUMEROS_NIT.getMensaje());

        }else {
            return true;
        }
    }

    //2.El nombre de la empresa no puede sobrepasar los 30 caracteres
    public boolean validarNombre(String nombre) throws Exception {

        if (nombre.length() > 30) {
            throw new Exception(Mensaje.VALIDAR_NOMBRE_EMPRESA.getMensaje());

        }else {
            return true;
        }
    }

}
