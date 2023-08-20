package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {

    private LocalValidacion validacion;

    @BeforeEach
    public  void configuarPruebas() {
        this.validacion = new LocalValidacion();
        System.out.println("inicando prueba...");
    }
    @Test
    public void validarNitFuncionaCorrectamente(){
        String nitPrueba= "1234567891";//PREPARO LA FUNCION
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarNit (nitPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public  void  validarNitFuncionanIncorrectoPorTipodeDato(){
        String nitPrueba="123";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarNit(nitPrueba)) ;
        Assertions.assertEquals(Mensaje.VALIDAR_NIT .getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarNitFuncionaIncorrectoPorCaracteresEspeciales(){
        String nitPrueba= "123P456789";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarNit(nitPrueba)) ;
        Assertions.assertEquals(Mensaje.VALIDAR_NUMEROS_NIT .getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarNombreEmpresaFuncionaCorrectamente(){
        String nombreEmpresaPrueba= "nombre de empresa prueba";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarNombre (nombreEmpresaPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombreEmpresaFuncionaIncorrectoPorNumerosCaracteres() {
        String nombreEmpresaPrueba = "probando nombre de la empresa con mas caracteres de los permitidos";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> this.validacion.validarNombre(nombreEmpresaPrueba));
        Assertions.assertEquals(Mensaje.VALIDAR_NOMBRE_EMPRESA.getMensaje(), respuesta.getMessage());
    }


}