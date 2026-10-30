# P05. Integración Angular - Spring Boot - PostgreSQL

**Módulo:** M04 - Web 3.0 con Angular y Spring Boot Java 11  
**Experiencia Educativa:** Desarrollo de Sistemas Web  
**Instrumento de Evaluación:** R05 


## 1. Estructura del Repositorio
Este paquete contiene el incremento de Web 3.0 completamente integrado:

├── api-spring/          # Backend API REST (Java 11 / Spring Boot 2.7.18)
├── frontend-angular/    # Cliente Frontend (Angular 16.2.12)
├── sql/                 # Esquema y datos de prueba para PostgreSQL
├── openapi.yaml         # Contrato OpenAPI formal de la API
└── README.md            # Documentación reproducible del sistema

El sistema comparte el esquema en PostgreSQL (`pr01_inventario`) con tablas para `producto`, `movimiento`, `categoria`, `usuario` y `lectura_sensor` (reservada para Web 4.0)

## 2. Requisitos Previos
**Java 11** y **Maven** para el backend.
**Node.js** y **Angular CLI** para el frontend.
**PostgreSQL** (versión local o contenedor) con la base de datos configurada.

Ver el README de cada modulo (api-spring/README.md, frontend-angular/README.md) para variables de entorno y pasos de ejecucion.

## Orden de arranque
1. PostgreSQL con el esquema ya cargado.
2. `api-spring` (puerto 8081 por defecto).
3. `frontend-angular` (puerto 4200 por defecto, apunta a `api-spring`).

## Alcance de esta entrega (Práctica P05 / Rúbrica R05)
**API Spring funcional :** Endpoints de salud, consulta de catálogo/productos y registro de movimientos.
**Integración Angular :** Consumo de servicios HTTP y flujo de usuario en el cliente.
**Persistencia PostgreSQL :** Operaciones con restricciones y control de existencias sin saldos negativos.
**Errores y validación :** Manejo de casos inválidos (como salidas mayores al stock) con respuestas controladas y códigos HTTP coherentes (2xx/4xx).
**Pruebas y repositorio :** Contrato OpenAPI (`openapi.yaml`), estructura reproducible y trazabilidad completa.

**No** incluye RF09 (evento IoT simulado, Web 4.0) — ese incremento queda fuera de este alcance.

## Nota
Se usó IA como apoyo para redactar correctamente los README de cada módulo
(`api-spring/README.md`, `frontend-angular/README.md`).
