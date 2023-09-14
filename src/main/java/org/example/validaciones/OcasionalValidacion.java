package org.example.validaciones;

import org.example.utilidades.Mensaje;

    public class OcasionalValidacion {
    public Boolean validarMensualidad(Integer valorMensual) throws  Exception{
        if(valorMensual <=0 )
        {
            throw new Exception(Mensaje.VALIDAR_COSTO_PERSONA .getMensaje());

        }else if (valorMensual >200000){
            throw new Exception(Mensaje.VALIDAR_MONTO_PERSONA.getMensaje());
        }
        else {
            return true;
        }


    }

}
