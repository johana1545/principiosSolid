package com.solid.srp.ejercicio.correcta;

public class PropietarioVehiculo {
    private String nombre;
    private String apellido;

    public PropietarioVehiculo(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
