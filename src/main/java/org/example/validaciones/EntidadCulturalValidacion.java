package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class EntidadCulturalValidacion {
    public boolean validarNumeroCaracteresSecretaria(String secretaria) throws Exception {

        if (secretaria.length() < 10) {
            throw new Exception(Mensaje.VALIDAR_NUMERO_CARACTERES_SECRETARIA.getMensaje());

        }else {
            return true;
        }
    }
}
