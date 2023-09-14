package org.example.validaciones;

import org.example.entidades.EntidadCultural;
import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EntidadCulturalValidacionTest {

    private EntidadCulturalValidacion entidadCulturalValidacion;

    @BeforeEach
    public void configurarPruebas(){
        this.entidadCulturalValidacion = new EntidadCulturalValidacion();
        System.out.println("iniciando prueba...");
    }

    @Test
    public void validarNombreSecretariaFuncionaCorrectamente(){
        String nombreSecretariaPrueba= "nombre de secretaria de prueba";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.entidadCulturalValidacion.validarNumeroCaracteresSecretaria(nombreSecretariaPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNombreSecretariaFuncionaIncorrecto(){
        String nombreSecretariaPrueba="prueba";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.entidadCulturalValidacion.validarNumeroCaracteresSecretaria (nombreSecretariaPrueba));
        Assertions.assertEquals(Mensaje.VALIDAR_NUMERO_CARACTERES_SECRETARIA .getMensaje(),respuesta.getMessage());
    }
}