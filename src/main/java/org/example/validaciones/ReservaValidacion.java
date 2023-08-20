package org.example.validaciones;

import org.example.utilidades.Mensaje;

import org.example.utilidades.Util;

import java.time.LocalDate;

public class ReservaValidacion {
    private Util util= new Util();


    public LocalDate validarFechaReserva(String fechaReserva) throws Exception {
        LocalDate fecha = util.validarFomatoFechas(fechaReserva, "dd/MM/yyyy");
        if (fecha == null) {
            throw new Exception(Mensaje.FECHA_RESERVA.getMensaje());
        }else{
            return fecha;
        }

    }

    public Boolean validarNumeroPersonasReserva (Integer numeroPersonas) throws Exception{
        if(numeroPersonas > 4 || numeroPersonas <1 ){
            throw new Exception(Mensaje.NUMERO_PERSONAS_RESERVA.getMensaje());
        }else{
            return true;
        }
    }


}
