package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.time.LocalDate;

public class OfertaValidacion {

    protected Util util= new Util();
    public OfertaValidacion() {
    }


    public boolean validarTitulo(String titulo) throws Exception {
    //El titulo de la oferta no puede sobrepasar los 20 caracteres
         if (titulo.length() > 20) {
            throw new Exception(Mensaje.VALIDAR_TITULO.getMensaje());

        }else {
            return true;
        }
    }
    public LocalDate validarFechaInicio(String fechainicio) throws Exception {
        LocalDate fecha = util.validarFomatoFechas(fechainicio, "d/MM/yyyy");
        if (fecha == null) {
            throw new Exception(Mensaje.VALIDAR_FECHA_INICIO.getMensaje());
        }
        return fecha;
    }

    public LocalDate validarFechaFin(String fechaFin) throws Exception {
        LocalDate fecha = util.validarFomatoFechas(fechaFin, "d/MM/yyyy");
        if (fecha == null) {
            throw new Exception(Mensaje.VALIDAR_FECHA_FIN.getMensaje());
        }
        return fecha;
    }


    public Boolean validarRangoFechas(LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        if (fechaInicio.isAfter(fechaFin)) {
            throw new Exception(Mensaje.VALIDAR_RANGO_FECHA.getMensaje());
        }
        return true;
    }


    public boolean validarCostoPersona(Double costoPersona) throws Exception {
        //- El costo por persona no puede ser negativo
        if (costoPersona <=0 ) {
            throw new Exception(Mensaje.VALIDAR_COSTO_PERSONA.getMensaje());

        }else {
            return true;
        }
    }

}
