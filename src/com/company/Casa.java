package com.company;

public class Casa extends Proyecto {

    private String superficie;
    private int cantidadBanios;
    private int cantidadDormitorios;


    public Casa(Construccion construccion, String superficie, int cantidadBanios, int cantidadDormitorios, String estado) {
        super(construccion, estado);
        this.superficie= superficie;
        this.cantidadBanios= cantidadBanios;
        this.cantidadDormitorios= cantidadDormitorios;

    }
}
