package com.company;

public class Departamento extends Proyecto implements Comparable<Departamento>{

    private int cantidadPisos;
    private int departamentosPorPiso;



    public Departamento(Construccion construccion, int cantidadPisos, int departamentosPorPiso, String estado) {
        super(construccion, estado);
        this.cantidadPisos= cantidadPisos;
        this.departamentosPorPiso= departamentosPorPiso;

    }


    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public int getDepartamentosPorPiso() {
        return departamentosPorPiso;
    }

    @Override
    public int compareTo(Departamento departamento) {
        int departamentosTotales = cantidadPisos * departamentosPorPiso;
        if (departamentosTotales > departamento.getCantidadPisos()*departamento.getDepartamentosPorPiso()) {
            return 1;
        }
        if (departamentosTotales < departamento.getCantidadPisos()*departamento.getDepartamentosPorPiso()) {
            return -1;
        } else {
            return 0;
        }
    }


        public boolean esRascacielos(){
                return  this.cantidadPisos>15;


        }



    }

