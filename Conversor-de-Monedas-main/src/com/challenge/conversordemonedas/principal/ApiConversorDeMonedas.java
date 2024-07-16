package com.challenge.conversordemonedas.principal;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.URI;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ApiConversorDeMonedas {
    private static final String API_KEY = "9d621a1a34332adefa1b757c";
    private static final HttpClient httpClient = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();
    private static final DecimalFormat redondeo = new DecimalFormat("#.####");

    public static double getExchangeRate(String fromCurrency, String toCurrency) throws IOException, InterruptedException {
        String uri = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + fromCurrency;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // Parse the response as JSON using Gson
        JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
        double exchangeRate = jsonObject.getAsJsonObject("conversion_rates").get(toCurrency).getAsDouble();

        return exchangeRate;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println("\nImportante!! El código moneda es el identificador de la moneda, ejemplo: para dólar es USD;en peso mexicano es MXN.");
        System.out.println("\nEscriba el código de la moneda de origen que desea convertir:");
        String fromCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Escriba el código de la moneda de destino que desea obtener:");
        String toCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Ingrese la cantidad a convertir:");
        double amount = scanner.nextDouble();

        double exchangeRate = getExchangeRate(fromCurrency, toCurrency);
        double convertedAmount = amount * exchangeRate;

        System.out.println("\nHaz convertido $ " + redondeo.format(amount) + " " + fromCurrency + " que equivalen a $ " + redondeo.format(convertedAmount) + " " + toCurrency + ".");
        System.out.println("\n*********************************************");
    }
}
