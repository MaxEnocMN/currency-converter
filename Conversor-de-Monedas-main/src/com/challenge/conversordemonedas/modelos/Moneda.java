package com.challenge.conversordemonedas.modelos;

public class Moneda {
    private String nombre;
    private String codigo;
    private double tasaDeCambio;
    private double dolarAPesoArgentino;
    private double pesoArgentinoADolar;
    private double dolarARealBrasileño;
    private double realBrasileñoADolar;
    private double dolarAPesoColombiano;
    private double pesoColombianoADolar;
    private double dolarAPesoMexicano;
    private double pesoMexicanoAdolar;



    public Moneda(String nombre, String codigo, double tasaDeCambio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tasaDeCambio = tasaDeCambio;
    }

    public double getDolarAPesoArgentino() {
        return 871.84; //tasa de cambio al 21/04/2024
    }

    public double getPesoArgentinoADolar() {
        return 0.0011; //tipo de cambio al 21/04/2024
    }

    public double getDolarARealBrasileño() {
        return 5.21;
    }

    public double getRealBrasileñoADolar() {
        return 0.19;
    }

    public double getDolarAPesoColombiano() {
        return 3908.10;
    }

    public double getPesoColombianoADolar() {
        return 0.00026;
    }

    public double getDolarAPesoMexicano() {
        return 17.08;
    }

    public double getPesoMexicanoAdolar() {
        return 0.058;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getTasaDeCambio() {
        return tasaDeCambio;
    }

    public void setTasaDeCambio(double tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }
}
