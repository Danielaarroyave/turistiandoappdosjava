package org.example.entidades;

import org.example.entidades.interfaces.Ireporte;
import org.example.validaciones.AfiliadoValidacion;
import org.example.validaciones.OcasionalValidacion;

public class Ocasional extends Usuario implements Ireporte {
    private Integer valorEvento;
    private OcasionalValidacion validacion = new OcasionalValidacion();

    public Ocasional() {
    }

    @Override
    public Boolean registrar() {
        return null;
    }

    public Ocasional(Integer id, String documento, String nombres, String correo, Integer ubicacion, Integer valorEvento) {
        super(id, documento, nombres, correo, ubicacion);
        this.valorEvento = valorEvento;
    }

    public Integer getValorEvento() {
        return valorEvento;
    }

    public OcasionalValidacion getValidacion() {
        return validacion;
    }

    public void setValidacion(OcasionalValidacion validacion) {
        this.validacion = validacion;
    }

    public void setvalorEvento(Integer valorEvento) {
        try {
            this.validacion.validarMensualidad(valorEvento);
            this.valorEvento = valorEvento;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    @Override
    public void generarReporte() {

    }

    @Override
    public void editarReporte(Integer id, String datosNuevos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }
}