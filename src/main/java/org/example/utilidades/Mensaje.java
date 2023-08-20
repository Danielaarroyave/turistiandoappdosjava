package org.example.utilidades;

public enum Mensaje {
    NUMERO_CARACTERES_INVALIDO("EL NUMERO DE CARACTERES ES INVALIDO"),
    NOMBRE_INVALIDO("El nombre solo acepta letras y espacios"),

    CORREO_INVALIDO("El correo es invalido"),
    UBICACION_INVALIDA("Esa no es una ubicacion valida"),


    VALIDAR_NIT("El campo nit debe tener solo 10 dígitos"),

    VALIDAR_NUMEROS_NIT("Solo se aceptan numeros"),

    VALIDAR_NOMBRE_EMPRESA("El nombre de la empresa no puede sobrepasar los 30 caracteres"),

    VALIDAR_TITULO("El titulo de la oferta no puede sobrepasar los 20 caracteres"),

    VALIDAR_FECHA_INICIO ("La fecha de inicio no puede ser mayor que la fecha de fin"),

    VALIDAR_FECHA_FIN ("Ingrese una fecha final  válida (dd/mm/yyyy)"),

    VALIDAR_RANGO_FECHA("La fecha de inicio no puede ser mayor que la fecha de fin"),
    VALIDAR_COSTO_PERSONA ("El costo por persona no puede ser negativo"),


    FECHA_RESERVA("Ingrese una fecha  válida con el siguiente formato (dd/mm/yyyy)"),

    NUMERO_PERSONAS_RESERVA("El número de personas por reserva es invalido, no puede ser mayor a cuatro o menor a uno");





    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
