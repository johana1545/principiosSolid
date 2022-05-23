package com.solid.srp.ejercicio.incorrecta;

class vehiculo {
    private String _marca;
    private String $color;
    private String nombreDueñoVehiculo;
    private String APELLIDODUEÑOVEHICULO;
    private String n0mbre;
    private int apellido25_2022;
    private double CostoCombustible = 2500;
    private final int ComMax;
    private Integer Combustiblerestante;

    public vehiculo(final int ComMax) {
        this.ComMax = ComMax;
        Combustiblerestante = ComMax;
    }

    public vehiculo(final int ComMax, String _marca, String $color, String nombreDueñoVehiculo, String APELLIDODUEÑOVEHICULO, String n0mbre, int apellido25_2022) {
        this.ComMax = ComMax;
        this._marca = _marca;
        this.$color = $color;
    }

    public void cargarCombustible() {
        Combustiblerestante = ComMax;
    }

    public double CobrarCombustible() {
        return CostoCombustible * ComMax;
    }

    public int getComMax() {
        return ComMax;
    }

    public int getCombustiblerestante() {
        return Combustiblerestante;
    }

    public void setCombustiblerestante(int Combustiblerestante) {
        this.Combustiblerestante = Combustiblerestante;
    }

    public void acelerar() {
        Combustiblerestante--;
    }

    public void GUARDAR_VEHICULO_DB(vehiculo carro) {
        // Funcion de almacenamiento en la DB
    }

    public void actualizarVehiculoDB(vehiculo carro) {
        // Funcion de actualizacion en la DB
    }
}
