package com.challenge.conversordemonedas.calculos;

import com.challenge.conversordemonedas.modelos.Moneda;

public class TipoDeCambio {
    private Moneda moneda;

    public TipoDeCambio(Moneda moneda) {
        this.moneda = moneda;
    }

    public double obtenerTasaDeCambio(String monedaOrigen, String monedaDestino) {
        if (monedaOrigen.equals("USD")) {
            switch (monedaDestino) {
                case "ARS":
                    return moneda.getDolarAPesoArgentino();
                case "BRL":
                    return moneda.getDolarARealBrasileño();
                case "COP":
                    return moneda.getDolarAPesoColombiano();
                case "MXN":
                    return moneda.getDolarAPesoMexicano();
                default:
                    return 0; // Retorna 0 si la moneda no es válida
            }
        } else if (monedaDestino.equals("USD")) {
            switch (monedaOrigen) {
                case "ARS":
                    return moneda.getPesoArgentinoADolar();
                case "BRL":
                    return moneda.getRealBrasileñoADolar();
                case "COP":
                    return moneda.getPesoColombianoADolar();
                case "MXN":
                    return moneda.getPesoMexicanoAdolar();
                default:
                    return 0; // Retorna 0 si la moneda no es válida
            }
        } else {
            return 0; // Retorna 0 si la moneda no es válida
        }
    }
}
