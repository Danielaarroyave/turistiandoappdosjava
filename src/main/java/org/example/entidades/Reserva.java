package org.example.entidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class Reserva {
    private Integer id;
    private Usuario usuario;
    private Oferta oferta;
    private Double costoTotal;
    private LocalDate  fechaReserva;

    public Reserva() {
    }

    public Reserva(Integer id, Usuario usuario, Double costoTotal, LocalDate fechaReserva, Oferta oferta) {
        this.id = id;
        this.usuario = usuario;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
        this.oferta = oferta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        Double valorIva= (costoTotal*19) /100;
        this.costoTotal = costoTotal + valorIva;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) throws Exception {
        try {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.fechaReserva = LocalDate.parse(fechaReserva, formato);
        } catch (DateTimeParseException e) {
            throw new Exception("Ingrese una fecha de reserva válida (dd/mm/yyyy)");
        }
    }

}
