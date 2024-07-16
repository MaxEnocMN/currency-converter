package com.challenge.conversordemonedas.principal;

import com.challenge.conversordemonedas.calculos.TipoDeCambio;
import com.challenge.conversordemonedas.modelos.Moneda;

import java.util.Scanner;

public class Conversor {
    private TipoDeCambio tipoDeCambio;
    int opcion = 0;

    public Conversor(TipoDeCambio tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }
    public static void main(String[] args) {
        Moneda moneda = new Moneda("Dólar", "USD", 0.78); // Se inicializa el objeto Moneda 
        TipoDeCambio tipoDeCambio = new TipoDeCambio(moneda);
        Conversor conversorMoneda = new Conversor(tipoDeCambio);
        conversorMoneda.Menu();
    }

    public void Menu(){
        String menu = """
                **********************************************
                \nBinvenido/a Conversor de Monedas
                \n1) Dólar =>> Peso argentino.
                2) Peso argentino =>> Dólar.
                3) Dólar =>> Real brasileño.
                4) Real brasileño =>> Dólar.
                5) Dólar =>> Peso colombiano.
                6) Peso colombiano =>> Dólar.
                7) Dólar =>> Peso mexicano.
                8) Peso Mexicano =>> Dólar.
                9) Salir.
                \n Seleccione un número de las opciones anteriores:
                """;
        Scanner teclado = new Scanner(System.in);

        while (opcion !=9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    double cantidad1 = teclado.nextDouble();
                    String resultado1 = convertirYRedondear("USD", "ARS", cantidad1);
                    System.out.println("Tu tipo de cambio de dólar a peso argentino es: " + resultado1 + " ARS.");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    double cantidad2 = teclado.nextDouble();
                    String resultado2 = convertirYRedondear("ARS", "USD", cantidad2);
                    System.out.println("Tu tipo de cambio de peso argentino a dólar es: " + resultado2 + " USD.");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    double cantidad3 = teclado.nextDouble();
                    String resultado3 = convertirYRedondear("USD", "BRL", cantidad3);
                    System.out.println("Tu tipo de cambio de dólar a real brasileño es: " + resultado3 + " BRL.");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    double cantidad4 = teclado.nextDouble();
                    String resultado4 = convertirYRedondear("BRL", "USD", cantidad4);
                    System.out.println("Tu tipo de cambio de real brasileño a dólar es: " + resultado4 + " USD.");
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    double cantidad5 = teclado.nextDouble();
                    String resultado5 = convertirYRedondear("USD", "COP", cantidad5);
                    System.out.println("Tu tipo de cambio de dólar a peso colombiano es: " + resultado5 + " COP.");
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    double cantidad6 = teclado.nextDouble();
                    String resultado6 = convertirYRedondear("COP", "USD", cantidad6);
                    System.out.println("Tu tipo de cambio de peso colombiano a dólar es: " + resultado6 + " USD.");
                    break;
                case 7:
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    double cantidad7 = teclado.nextDouble();
                    String resultado7 = convertirYRedondear("USD", "MXN", cantidad7);
                    System.out.println("Tu tipo de cambio de dólar a peso mexicano es: " + resultado7 + " MXN.");
                    break;
                case 8:
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    double cantidad8 = teclado.nextDouble();
                    String resultado8 = convertirYRedondear("MXN", "USD", cantidad8);
                    System.out.println("Tu tipo de cambio de peso mexicano a dólar es: " + resultado8 + " USD.");
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestro conversor de moneda, que tengas un feliz día (^-^).");
                    break;
                default:
                    System.out.println("La opción que has seleccionado no es correcta, por favor de verificar.");
            }
        }
    }
    private String convertirYRedondear(String monedaOrigen, String monedaDestino, double cantidad) {
        double resultado = tipoDeCambio.obtenerTasaDeCambio(monedaOrigen, monedaDestino) * cantidad;
        return String.format("%.4f", resultado);
    }
}
