package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {
    private  ReservaValidacion validacion;

    @BeforeEach
    public void configurarPruebas(){
        this.validacion= new ReservaValidacion();
        System.out.println("Iniciando prueba...");
    }

    @Test
    public void validarFechaReservaFuncionaCorrecto(){
        String fechaReservaPrueba= "01/03/2023";
        LocalDate respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarFechaReserva(fechaReservaPrueba));
        Assertions.assertNotNull(respuesta);
    }

    @Test
    public void validarFechaReservaFuncionaIncorrectoPorFormato(){
        String fechaReservaPrueba= "01/2023/20";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarFechaReserva (fechaReservaPrueba)) ;
        Assertions.assertEquals(Mensaje.FECHA_RESERVA .getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarNumeroPersonasReservaFuncionaCorrecto(){
        Integer numeroPersonasReservaPrueba= 4;
        Boolean respuesta =Assertions.assertDoesNotThrow(()->this.validacion.validarNumeroPersonasReserva (numeroPersonasReservaPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNumeroPersonasReservaFuncionaIncorrectoPorCantidad(){
        Integer numeroPersonasReservaPrueba= 8;
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarNumeroPersonasReserva (numeroPersonasReservaPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_PERSONAS_RESERVA.getMensaje(),respuesta.getMessage());
    }
}