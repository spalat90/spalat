# spalat
Workspace

Proyecto Spring Boot con Spring Data JPA y Spring Web
Este es un proyecto de demostración de Spring Boot que utiliza Spring Data JPA y Spring Web. El proyecto incluye una configuración básica para empezar a desarrollar una aplicación web.

Requisitos
Para ejecutar este proyecto, necesitarás tener instalado:

Java 17 (o una versión compatible)
Maven
Un entorno de desarrollo compatible con Spring (como Spring Tool Suite o IntelliJ IDEA)
Configuración
Este proyecto utiliza el sistema de gestión de dependencias Maven. Todas las dependencias están configuradas en el archivo pom.xml.

Asegúrate de que tienes todas las dependencias necesarias descargadas y configuradas antes de ejecutar la aplicación.

Ejecución
Para ejecutar la aplicación, puedes utilizar la función de Maven para ejecutar un proyecto Spring Boot:

bash
Copy code
mvn spring-boot:run
La aplicación se ejecutará en http://localhost:8080.

Desarrollo

  Enunciado:
  Construir una aplicación/servicio en SpringBoot que provea una end point rest de consulta  tal que:
    Acepte como parámetros de entrada: fecha de aplicación, identificador de producto, identificador de cadena.
    Devuelva como datos de salida: identificador de producto, identificador de cadena, tarifa a aplicar, fechas de aplicación y precio final a aplicar.
    Se debe utilizar una base de datos en memoria (tipo h2) e inicializar con los datos del ejemplo, (se pueden cambiar el nombre de los campos y añadir otros nuevos si se quiere, elegir el tipo de dato que se considere adecuado para los mismos).

  Solución:
  - Proyecto que contiene el servicio de consulta por fecha de aplicación, identificador de producto e identificador de cadena. 
  - Contiene H2, donde el create de la tabla se realiza con el fichero schema.sql y la información se inserta con el fichero data.sql.
  - Test unitarios e integrales.
  - Se agrega Swagger.
  - Pruebas locales con Postman.

- Test al endpoint rest que  validen las siguientes peticiones al servicio con los datos del ejemplo:
                                                                                       
-          Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
-          Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
-          Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
-          Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
-          Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)


Documentación
Este proyecto incluye una integración de Springdoc OpenAPI para documentación de API. Puedes acceder a la documentación de la API en http://localhost:8080/swagger-ui.html.

