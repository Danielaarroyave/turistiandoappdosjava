package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {
    //craer un objeto de la clase que quiero probar

    private OfertaValidacion validacion;

    //prepara las pruebas que vamos a realizar

    @BeforeEach
    public void configurarPruebas(){
        this.validacion=new OfertaValidacion();
        System.out.println("inicando prueba...");
    }
    @Test
    public void validarTituloFuncionaCorrecto(){
        String tituloPrueba="Esta es una prueba";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarTitulo(tituloPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarTituloFuncionaIncorrectoPorNumeroDeCaracteres(){
        String tituloPrueba="Esta  es una prueba con mas cantidad de caracteres permitidos";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarTitulo(tituloPrueba));
        Assertions.assertEquals(Mensaje.VALIDAR_TITULO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarFechaInicioFuncionaCorrecto(){
        String fechaPrueba= "01/03/2023";
        LocalDate respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarFechaInicio(fechaPrueba));
        Assertions.assertNotNull(respuesta);
    }

    @Test
    public void validarFechaInicioFuncionaInCorrecto(){
        String fechaPrueba="01/23/03";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarFechaInicio (fechaPrueba)) ;
        Assertions.assertEquals(Mensaje.VALIDAR_FECHA_INICIO .getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarFechaFinFuncionaCorrecto(){
        String fechaPrueba= "01/03/2022";
        LocalDate respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarFechaFin(fechaPrueba));
        Assertions.assertNotNull(respuesta);
    }

    @Test
    public void validarFechaFinFuncionaInCorrecto(){
        String fechaPrueba="01/22/03";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarFechaFin(fechaPrueba)) ;
        Assertions.assertEquals(Mensaje.VALIDAR_FECHA_FIN .getMensaje(),respuesta.getMessage());
    }


    @Test
    public void validarRangoFechasFuncionaCorrecto(){
        LocalDate fechaIncio = LocalDate.of(2020, 1, 8);
        LocalDate fechaFin = LocalDate.of(2022, 1, 8);
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarRangoFechas(fechaIncio, fechaFin));
        Assertions.assertTrue(respuesta);

    }

    @Test
    public void validarRangoFechasFuncionaIncorrectoPorRango(){
        LocalDate fechaIncio = LocalDate.of(2022, 1, 8);
        LocalDate fechaFin = LocalDate.of(2020, 1, 8);
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarRangoFechas(fechaIncio,fechaFin));
        Assertions.assertEquals(Mensaje.VALIDAR_RANGO_FECHA .getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarCostoPersonaFuncionaCorrecto(){
        Double costoPrueba= 3.000;
        Boolean respuesta=Assertions.assertDoesNotThrow(()->this.validacion.validarCostoPersona (costoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCostoPersonaFuncionaIncorrectoPorValoresNegativos(){
        Double costoPrueba= -3.000;
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarCostoPersona(costoPrueba)) ;
        Assertions.assertEquals(Mensaje.VALIDAR_COSTO_PERSONA.getMensaje(),respuesta.getMessage());

    }
}