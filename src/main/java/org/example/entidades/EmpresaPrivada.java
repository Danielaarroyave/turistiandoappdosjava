package org.example.entidades;

import org.example.entidades.interfaces.Ireporte;
import org.example.validaciones.EmpresaPrivadaValidacion;
import org.example.validaciones.EntidadCulturalValidacion;

public class EmpresaPrivada extends Empresa implements Ireporte {
    private String representanteLegal;
    private Double cobro;

    protected EmpresaPrivadaValidacion validacionEmpresaPriva = new EmpresaPrivadaValidacion();
    public EmpresaPrivada() {
    }

    @Override
    public Double cobro() {
        return 2200000 * 1.19  ;
    }

    public EmpresaPrivada(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String representanteLegal, Double cobro) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.representanteLegal = representanteLegal;
        this.cobro = cobro;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal)
    {
        try{
            this.validacionEmpresaPriva.validarNombreRepresentanteLegal (representanteLegal);
            this.representanteLegal=representanteLegal;

        }catch (Exception error){
            System.out.println("\u001B[31m"+error.getMessage() +"\u001B[0m");
        }
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
