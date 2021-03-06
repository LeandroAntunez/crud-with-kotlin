# Aplicaci贸n CRUD en Kotlin 

_Este proyecto es una aplicaci贸n CRUD utilizando el lenguaje de programaci贸n Kotlin_.

## Comenzando 馃殌

_Estas instrucciones te permitir谩n obtener una copia del proyecto en funcionamiento en tu m谩quina local para prop贸sitos de desarrollo y pruebas._

_Simplemente clona el proyecto del repositorio en tu directorio favorito,
y luego sigue las instrucciones de instalaci贸n._

### Pre-requisitos 馃搵

_Que cosas necesitas para instalar el software y como instalarlas_

* Un IDE - [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/download/) o similares
* [Postman](https://www.postman.com/downloads)
* [DBeaver](https://dbeaver.io/down) - o cualquier gestor de base de datos PostgreSQL.

_Solo desc谩rgalas y las instalas en tu OS preferido,
siguiendo las instrucciones de cada herramienta._

### Instalaci贸n 馃敡

_Una serie de instrucciones paso a paso
que te dice lo que debes ejecutar para tener
un entorno de desarrollo ejecut谩ndose._

####_Con la IDE_

```
Ejecuta el main CrudWithKotlinApplication.kt
```

####_Con el gestor DB_

Crea una base de datos PostgreSQL con la siguientes caracteristicas:

```
url: jdbc:postgresql://localhost:5432/postgres
nombre: postgres
contrase帽a: admin
puerto: 5432
```
Luego, crea la tabla _Personas_. La cual tiene las siguientes columnas:

```
CREATE TABLE public.persona (
	id serial NOT NULL,
	nombre varchar NULL,
	apellido varchar NULL,
	direccion varchar NULL,
	telefono varchar NULL,
	CONSTRAINT persona_pk PRIMARY KEY (id)
);

```
## Haciendo las pruebas manualmente 鈿欙笍

### Con Postman 馃敥

_Una vez creada la tabla Persona, y levantada la app en el puerto :8080,
se pueden realizar las siguientes pruebas._

#### Crear Persona

_Probamos que se crea una persona con la url_

```
http://localhost:8080/api/v1/save
```

_Para el body, ingresamos los siguientes datos en formato JSON:_

```
{
    "nombre": "Chris",
    "apellido": "Redfield",
    "direccion": "Raccoon St 4257",
    "telefono": "1152497475"
}
```

#### Ver todas las personas

_Probamos que se pueden ver todas las personas con la url_

```
http://localhost:8080/api/v1/all
```

#### Borrar persona

_Probamos que se puede eliminar los datos de una persona con la url_
```
http://localhost:8080/api/v1/all/{id}
```
_En el par谩metro /{id}, iria el ID de la persona a borrar, por ejemplo:_
```
http://localhost:8080/api/v1/all/83932
```

## Construido con 馃洜锔?

_Las herramientas que utilic茅 para crear mi proyecto._

* [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/download/) para la IDE.
* [Postman](https://www.postman.com/downloads) para las pruebas.
* [DBeaver](https://dbeaver.io/down) para almacenar la base de datos.
* [Kotlin](https://kotlinlang.org/) el lenguaje de programaci贸n utilizado.
* [Spring Boot](https://spring.io/) me permiti贸 levantar r谩pidamente la app con Spring Framework.

## Basado en 鉁掞笍

* [4SoftwareDevelopers](https://github.com/4SoftwareDevelopers) con su tutorial [CRUD API REST Kotlin & Spring Boot](https://www.youtube.com/watch?v=zNnkLSaSiic&t=1343s).

## Licencia 馃搫

Este proyecto est谩 bajo la Licencia GPL-3.0 (mira el archivo [LICENSE](LICENSE) para detalles).

---
Programado 鈱笍  con 鉂わ笍 por [LeandroAntunez](https://github.com/LeandroAntunez) 馃槉
