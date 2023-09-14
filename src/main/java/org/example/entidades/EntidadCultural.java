package org.example.entidades;

import org.example.entidades.interfaces.Ireporte;
import org.example.validaciones.EmpresaValidacion;
import org.example.validaciones.EntidadCulturalValidacion;

public class EntidadCultural extends Empresa implements Ireporte {
    private String secretaria;
    private String mision;
    private Double cobro;

    protected EntidadCulturalValidacion validacionEntidad = new EntidadCulturalValidacion();


    public EntidadCultural() {
    }

    @Override
    public Double cobro() {
        return (1200000 * 1.19) * 0.90 ;
    }

    public EntidadCultural(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String secretaria, String mision) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.secretaria = secretaria;
        this.mision = mision;
        this.cobro=cobro();
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {

        try{
            this.validacionEntidad.validarNumeroCaracteresSecretaria(secretaria);
            this.secretaria=secretaria;

        }catch (Exception error){
            System.out.println("\u001B[31m"+error.getMessage() +"\u001B[0m");
        }
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public Double getCobro() {
        return cobro;
    }

    public void setCobro(Double cobro) {
        this.cobro = cobro;
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
