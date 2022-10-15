package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Construccion construccion = new Construccion("calle 20", "2020-17-06", "2022-17-06", "2022-17-06");
        Construccion construccion2= new Construccion("calle10", "2020-17-01", "2022-06-30", "2022-06-17" );

        Casa casa1= new Casa(construccion, "10m", 5,6, "finalizado");
        System.out.println(casa1.finalizaEnFecha());

        Departamento departamento1 = new Departamento(construccion2, 16,2, "finalizado");
        Departamento departamento2 = new Departamento(construccion2, 16,2, "finalizado");


        if (departamento1.compareTo(departamento2)==1){
            System.out.println("el departamento 1 es mayor");
        }
        if (departamento1.compareTo(departamento2)==-1){
            System.out.println("el departamento 2 es mayor");
        }

        else{
            System.out.println("son iguales");
        }
        System.out.println(departamento1.esRascacielos());


        //System.out.println(departamento1.finalizaEnFecha();

    }
}
