# Conversor de Monedas - Java

## Descripción
Aplicacion del conversor de monedas desarrollado en Java usando las funciones de IntelliJ. 
El objetivo de este proyecto es crear una interfaz con el usuario por medio de la consola en donde este pueda obtener el tipo de cambio de una moneda a otra.
Para ello existen 2 clases dentro del paquete principal en donde el usuario puede hacer la conversión de estas monedas; una de ellas funciona de manera de 
loop en donde se despliega un menú de opciones donde el usuario selecciona una de las opciones disponibles e ingresa la cantidad que desea convertir, solo
que esta clase usa una tasa fija la cual no se encuentra actualizada solo muestra el funcionamiento de la conversión y de la lógica implementada en Java para
poder hacer el cálculo de las tasas. Mientras que la otra clase hace uso del API Exchange Rate en donde también se ingresan datos a través de la consola y en 
ella se ingresa el código de las monedas que se desea hacer la conversión en base a la ISO 4217 y se obtiene el tipo de cambio en tiempo real. Estos conversores 
permiten al usuario convertir una cantidad de una moneda a otra.
 
Durante el desarrollo de este proyecto, se implementaron varios conceptos fundamentales de la programación en Java, incluyendo:

- Uso de **setters y getters** para el manejo de datos.
- Organización del código en **paquetes** para una mejor estructura y legibilidad.
- Creación de **clases** y **constructores** para definir objetos y su comportamiento.
- Implementación de **APIs** para obtener datos en tiempo real.
- Uso de la biblioteca **Gson** para la manipulación de datos en formato JSON.
- Uso de **HttpClient**, **HttpRequest**, y **HttpResponse** para realizar solicitudes HTTP y manejar las respuestas.

Este proyecto es una excelente oportunidad para entender cómo estos conceptos se aplican en un proyecto real.

## Características
- Soporte para múltiples monedas (dólar, euro, yen, etc.).
- Interfaz de usuario intuitiva.
- Actualizaciones de tasas de cambio en tiempo real.

## Requisitos
- Java 17 o superior
- IntelliJ IDEA

## Uso
Para utilizar el conversor de monedas con la clase Conversor, sigue estos pasos:

1. Abre la aplicación.
2. Selecciona una de las opciones disponibles colocando el número correspondiente a la opción deseada.
3. Introduce la cantidad que deseas convertir.
4. Presiona Enter.
5. La aplicación mostrará el resultado de la conversión.
6. Sal de la aplicación usando la opción 9.

Para utilizar el conversor de monedas por medio de la API con la clase ApiConversorDeMonedas, sigue los siguientes pasos:

1. Abre la aplicación.
2. Escribe el código de moneda de origen; ejemplo si son dólares sería USD, para euros EUR, para reales brasileños BRL, etc.
3. Escribe el código de la moneda de destino, siguiendo la misma regla de antes.
4. Introduce la cantidad que deseas convertir.
5. Presiona Enter.
6. La aplicación mostrará el resultado de la conversión.

## Nota
Este proyecto fue desarrollado como parte de un Challenge dentro del programa One de Alura Latam, más específicamente para la rama de BackEnd con fines educativos
Att. Max Enoc Moreno Navarrete


