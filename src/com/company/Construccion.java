package com.company;

public class Construccion {

    private String direccion;
    private String fechaInicio;
    private String fechaFinPrevista;
    private String fechaFinReal;

    public Construccion(String direccion, String fechaInicio, String fechaFinPrevista, String fechaFinReal) {
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        this.fechaFinPrevista = fechaFinPrevista;
        this.fechaFinReal = fechaFinReal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFinPrevista() {
        return fechaFinPrevista;
    }

    public String getFechaFinReal() {
        return fechaFinReal;
    }
}
