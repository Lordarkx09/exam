# PetStore Prueba Tecnica

## Author
**Pablo Rodriguez Fajardo**

## Características del proyecto:
i. Tipo de configuración: Gradle - Groovy  
ii. Lenguaje: Java  
iii. Versión de SpringBoot: 3.2.7  
iv. Packaging: Jar  
v. Java: 17  
vi. Dependencias: SpringWeb  



## Requisitos del proyecto:

- Crear una estructura de carpetas que permita organizar el código de la
   siguiente forma:  
   a. Clases para definir APIs REST  
   b. Clases para implementar lógica de negocio  
   c. Clases para conectarse a APIs de terceros  
   d. Clases para almacenamiento de datos en objetos  


- Desarrollar las siguiente API REST: GET /api/pet/{petid}  
   a. Parametros de Entrada: "idPet" - Path Parameter  
   b. Parametros de Salida: "id", "name", "status"


- Para obtener la información que regresará el API GET/api/pet/{petld}   
a. Será necesario consumir la siguiente API externa:  
GET/pet/{petld} de https://petstore.swagger.io/#/


- Desarrollar una capa Service que permita pintar la información obtenida en la
consola, antes de regresarla coimo response del API. 


- Ejecutar el proyecto y realizar pruebas del mismo.


- Desarrollar las siguiente API REST: POST /api/pet  
a. Parametros de Entrada: "id", "status". "name"  
b. Parametros de Salida: "transactionld", "dateCreated", "status", "name"  


- Los datos debarán almacenarse en un sistema externo, por lo que:  
a. Será necesario consumir la siguiente API externa:  
POST/pet de https://petstore.swagger.io/#/  


- Desarrollar una capa Service que permita:  
   a. Pintar la información obtenida en la consola, antes de regresarla coimo
   response del API.  
   b. Generar el campo del response "transactionld" con un formato de
   UUIDv4 en la capa service.  
   C. Generar el campo del response "dateCreated" usando la fecha actual
   del sistema.  


- Ejecutar el proyecto y realizar pruebas del mismo.  

