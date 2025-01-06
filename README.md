
# Conversor de Monedas

Este proyecto es una aplicación sencilla en Java que permite convertir montos entre diferentes monedas utilizando una API REST para obtener las tasas de cambio actualizadas.

<p align="center">
  <img src="Badge-Conversor.png" alt="Insignia de Oracle">
</p>

## Características

- Conversión entre las siguientes monedas:
  - COP a USD y viceversa.
  - COP a EUR y viceversa.
  - COP a ARS y viceversa.
- Menú interactivo que permite:
  - Seleccionar la operación deseada.
  - Ingresar el monto a convertir.
  - Ver el resultado de la conversión en tiempo real.

## Requisitos Previos

1. Tener instalada una versión de Java Development Kit (JDK) 11 o superior.
2. Agregar la dependencia de Gson para manejar JSON:
   - Puedes descargarla desde [Maven Repository](https://mvnrepository.com/artifact/com.google.code.gson/gson).
3. Obtener una API Key desde [ExchangeRate-API](https://www.exchangerate-api.com/) y configurarla en el código.

## Configuración

Reemplaza `<YOUR_API_KEY>` en el código del request HTTP con tu clave personal proporcionada por ExchangeRate-API:

```java
String url = "https://v6.exchangerate-api.com/v6/<YOUR_API_KEY>/pair/" + monedaBase + "/" + monedaObjetivo;
```

## Ejemplo de Uso

1. Al iniciar el programa, verás un menú como el siguiente:
   ```
   Seleccione una opción para convertir monedas:
   1. COP a USD
   2. USD a COP
   3. COP a EUR
   4. EUR a COP
   5. COP a ARS
   6. ARS a COP
   0. Salir
   Opción: 1
   ```

2. Ingresa el monto que deseas convertir:
   ```
   Ingrese el monto a convertir: 100000
   ```

3. El programa mostrará el resultado:
   ```
   Resultado: 25.34 USD
   ```

## Estructura del Proyecto

- **ConsultaMonedas:** Clase encargada de realizar las solicitudes HTTP a la API y devolver las tasas de cambio.
- **MenuConversor:** Clase que gestiona el menú interactivo y la lógica de selección.
- **Main:** Clase principal que inicializa y ejecuta el programa.

## Autor

Creado por Nicolas Camacho.

