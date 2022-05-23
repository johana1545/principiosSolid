package com.solid.srp.ejercicio.correcta;

public class Gasolinera {

    private double costoCombustible = 2500;
    private int combustibleRecarga = 0;

    public Gasolinera(){

    };

    public Gasolinera(double costoCombustible, int combustibleRecarga) {
        this.costoCombustible = costoCombustible;
        this.combustibleRecarga = combustibleRecarga;
    }

    public double getCostoCombustible() {
        return costoCombustible;
    }

    public void setCostoCombustible(double costoCombustible) {
        this.costoCombustible = costoCombustible;
    }

    public int getCombustibleRecarga() {
        return combustibleRecarga;
    }

    public void setCombustibleRecarga(int combustibleRecarga) {
        this.combustibleRecarga = combustibleRecarga;
    }

    public double cargarCombustible(int combustibleRecarga ) {
        combustibleRecarga = combustibleRecarga;
        return combustibleRecarga;
    }

    public double cobrarCombustible( int combustibleRecarga ) {
        return costoCombustible * combustibleRecarga;
    }

}
