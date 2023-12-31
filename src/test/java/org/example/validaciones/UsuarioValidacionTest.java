package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioValidacionTest {
    //craer un objeto de la clase que quiero probar

    private UsuarioValidacion validacion;

    //prepara las pruebas que vamos a realizar

    @BeforeEach
    public  void configuarPruebas(){
        this.validacion= new UsuarioValidacion();
        System.out.println("inicando prueba...");

    }
    //programamos nuestras pruebas unitarias
    @Test
    public void validarNombresFuncionaCorrectamente(){
        String nombrePrueba="Daniela Arroyave Correa";//PREPARO LA FUNCION
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public  void  validarNombresFuncionanIncorrectoPorNumeroCaracteres(){
        String nombrePrueba="Dani";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba)) ;
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(),respuesta.getMessage());


    }

    @Test
    public void validarNombresFuncionanIncorrectoPorCaracteresInvalidos(){
        String nombrePrueba="dani-ela12345678";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
         Assertions.assertEquals(Mensaje.NOMBRE_INVALIDO.getMensaje(),respuesta.getMessage());

    }
    @Test
    public void validarCorreoFuncionaCorrectamente() {
        String correoPrueba = "daniela2758arroyave@gmail.com";
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> this.validacion.validarCorreo(correoPrueba));
        Assertions.assertTrue(respuesta);
    }


    @Test
    public void validarCorreoFuncionaIncorrectoPorFormato() {
        String correoPrueba = "dani";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> this.validacion.validarCorreo(correoPrueba));
        Assertions.assertEquals(Mensaje.CORREO_INVALIDO.getMensaje(), respuesta.getMessage());
    }
    @Test
    public void validarUbicacionCorrecta(){
        Integer ubicacionPrueba= 4;
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarUbicacionIncorrecta(){
        Integer ubicacionPrueba= 5;
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertEquals(Mensaje.UBICACION_INVALIDA.getMensaje(), respuesta.getMessage());
    }

    static class OcasionalValidacionTest {
        OcasionalValidacion ocasionalValidacion= new OcasionalValidacion();

        private OcasionalValidacion validacion;

        @BeforeEach
        public  void configurarPruebas(){
            this.ocasionalValidacion=new OcasionalValidacion();
            System.out.println("iniciar prueba...");
        }

        @Test
        public void validarOcacionaFuncionalCorrecto(){
            Integer mensualidadPrueba= 10000;
            Boolean respuesta= Assertions.assertDoesNotThrow(()->this.ocasionalValidacion.validarMensualidad (mensualidadPrueba));
            Assertions.assertTrue(respuesta);
        }

        @Test
        public  void validarOcacionalIncorrectoMontoNegativo(){
            Integer mensualidadPrueba=-10000;
            Exception respuesta=Assertions.assertThrows(Exception.class,()->this.ocasionalValidacion.validarMensualidad(mensualidadPrueba));
            Assertions.assertEquals(Mensaje.VALIDAR_COSTO_PERSONA .getMensaje(),respuesta.getMessage());

        }
        @Test
        public void validarOcasionalValorFuncionaIncorrectoPorMonto(){
            Integer mensualidadPrueba=250000;
            Exception respuesta=Assertions.assertThrows(Exception.class,()->this.ocasionalValidacion.validarMensualidad(mensualidadPrueba));
            Assertions.assertEquals(Mensaje.VALIDAR_MONTO_PERSONA .getMensaje(),respuesta.getMessage());
        }

    }
}
