package org.example.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    public boolean validarExpresionRegular(String cadena,String expresionregular){
        Pattern patron = Pattern.compile(expresionregular);
        Matcher coincidencia = patron.matcher(cadena);
        if (coincidencia.matches()){//SI HAY COINCIDENCIA SE RETORNA UN TRUE SINO UN FALSE
            return true;
        } else{
            return false;
        }
    }

    public LocalDate validarFomatoFechas(String fecha, String patronFecha){
        try {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern(patronFecha);
            return LocalDate.parse(fecha, formato);
        } catch (DateTimeParseException e) {
            return null;
        }

    }

}

