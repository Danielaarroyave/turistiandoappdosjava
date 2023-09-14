package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaPrivadaValidacionTest {

    private EmpresaPrivadaValidacion empresaPrivadaValidacion;

    @BeforeEach
    public void configurarPruebas(){
        this.empresaPrivadaValidacion=new EmpresaPrivadaValidacion();
        System.out.println("iniciando prueba...");
    }

    @Test
    public void validarNumeroCaracteresRepresentanteLegalFuncionaCorrectamente(){
        String nombreRepresentanteLegalPrueba= "nombre de representante legal de prueba";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.empresaPrivadaValidacion.validarNombreRepresentanteLegal (nombreRepresentanteLegalPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNumeroCaracteresRepresentanteLegalFuncionaIncorrectamente(){
        String nombreRepresentanteLegalPrueba="dan";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.empresaPrivadaValidacion.validarNombreRepresentanteLegal(nombreRepresentanteLegalPrueba));
        Assertions.assertEquals(Mensaje.VALIDAR_NUMERO_CARACTERES_REPRESENTANTE .getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarNombresFuncionanIncorrectoPorCaracteresInvalidos(){
        String nombreRepresentanteLegalPrueba="dani-ela12345678";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.empresaPrivadaValidacion.validarNombreRepresentanteLegal (nombreRepresentanteLegalPrueba));
        Assertions.assertEquals(Mensaje.VALIDAR_NOMBRE_REPRESENTANTE.getMensaje(),respuesta.getMessage());

    }


}