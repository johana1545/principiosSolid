package com.solid.srp.ejercicio.correcta;

class Vehiculo {
    private String marca;
    private String color;

    private int combustibleMaximo;
    private Integer combustibleRestante;

    public Vehiculo(){

    };

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehiculo(int combustibleMaximo, Integer combustibleRestante ) {
        this.combustibleMaximo = combustibleMaximo;
        this.combustibleRestante = combustibleRestante;
    }

    public Vehiculo(int combustibleMaximo, String marca, String color) {
        this.combustibleMaximo = combustibleMaximo;
        this.marca = marca;
        this.color = color;
    }



    public int getcombustibleMaximo() {
        return combustibleMaximo;
    }

    public int getcombustibleRestante() {
        return combustibleRestante;
    }

    public void setcombustibleRestante(int combustibleRestante) {
        this.combustibleRestante = combustibleRestante;
    }

    public void acelerar() {
        combustibleRestante--;
    }

}
