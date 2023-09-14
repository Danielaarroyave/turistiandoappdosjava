package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadoValidacionTest {
    private AfiliadoValidacion afiliadoValidacion;

    @BeforeEach
    public  void configurarPruebas(){
        this.afiliadoValidacion=new AfiliadoValidacion();
    }

    @Test
    public void validarMensualidadCorrecto(){
        Integer mensualidadPrueba= 10000;
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.afiliadoValidacion.validarMensualidad (mensualidadPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public  void validarMensualidadIncorrecto(){
        Integer mensualidadPrueba=-10000;
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.afiliadoValidacion.validarMensualidad(mensualidadPrueba));
        Assertions.assertEquals(Mensaje.VALIDAR_COSTO_PERSONA .getMensaje(),respuesta.getMessage());

    }
    @Test
    public void validarMensualidadFuncionaIncorrectoPorValorSuperior(){
        Integer mensualidadPrueba = 150000;
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.afiliadoValidacion.validarMensualidad(mensualidadPrueba));
        Assertions.assertEquals(Mensaje.VALIDAR_MONTO_PERSONA .getMensaje(),respuesta.getMessage());
    }
}