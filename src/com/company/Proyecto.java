package com.company;

import java.util.Objects;

public abstract class Proyecto {

    private int numero;
    private String nombre;
    private String ciudad;
    private String estado;
    private Construccion construccion;

    public Proyecto( Construccion construccion, String estado){
        this.construccion = construccion;
        this.estado= estado;
    }

    public boolean finalizaEnFecha(){

        if(construccion.getFechaFinReal().equals(construccion.getFechaFinPrevista()) && estado.equals("finalizado")){
            return true;
        }
        else{
            return false;
        }
    }

}
