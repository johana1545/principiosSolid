package com.solid.srp.ejercicio.correcta;

public class Menu {
    public static void main (String args[]){
        Gasolinera gasolinera=new Gasolinera();
        Vehiculo vehiculo = new Vehiculo(10,"Chevrolet","Negro");

        System.out.println("usted va a recargar "+ gasolinera.cargarCombustible(10)+" unidades");
        System.out.println("----------------------------");
        System.out.println("total a pagar $"+ gasolinera.cobrarCombustible(10)+" pesos * recarga de gasolina ");
        System.out.println("----------------------------");
        System.out.println("Color Vehiculo "+ vehiculo.getColor());
        System.out.println("Marca Vehiculo "+ vehiculo.getMarca());
        System.out.println("Marca Combustible Máximo "+ vehiculo.getcombustibleMaximo()+" galones");
    }

}
