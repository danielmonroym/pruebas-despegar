# Plan de pruebas: Despegar
La página web que probamos, [despegar](https://www.despegar.com.co/), consiste en un sistema de búsqueda de viajes, donde se nos permite seleccionar las fechas de ida y regreso, la ciudad de origen y destino, cantidad de personas, si es sólo ida, ida y regreso, entre otras funcionalidades. El sistema nos muestra diferentes ofertas donde puedes elegir alguna para seguir con el proceso de compra o simplemente comparar para elegir la mejor opción. 

## Objetivo general
Explorar la obtención de casos de prueba e implementar  las herramientas de automatización de pruebas funcionales utilizando el patrón Screenplay.

## Objetivos específicos
* Implementar la técnica de diseño de casos de prueba de caja negra.
* Realizar un plan de pruebas con mínimo tres casos de prueba.
* Realice la automatización de un caso de prueba basado en Screenplay (java).

## Alcances de la prueba
Para el alcance se tendrá en cuenta la función principal del sitio web que es la búsqueda de viajes teniendo en cuenta los siguientes criterios:
* Fecha de ida
* Fecha de regreso
* Ida y vuelta
* Solo ida
* Origen
* Destino
* Pasajeros

## Estrategia de la prueba
Para la obtención de casos de prueba se realizará una prueba basada en la especificación o prueba de caja negra, haciendo uso de las clases de equivalencia de forma habitual que consiste en los datos de entrada para el sistema.

### Ejemplo de búsqueda
En este ejemplo se realizará la búsqueda de un viaje que va desde una ciudad a otra en un solo viaje o con algunas paradas (multidestino), el usuario podrá elegir si desea que el vuelo sea de solo ida o ida y vuelta, también debe definir las fechas de ida y regreso si es el caso.  

* Fecha ida: Valor mayor o igual a la fecha actual.
* Fecha regreso: Valor mayor o igual a la fecha de ida o campo bloqueado si solo ida es seleccionado.
* Solo ida: seleccionado si ida y vuelta no seleccionado y multidestino no seleccionado.
* ida y vuelta: seleccionado si solo ida no seleccionado y multidestino no seleccionado.
* Multidestino: seleccionado si solo ida no seleccionado y ida y vuelta no seleccionado.
* Origen: Ciudad de origen, debe ser el nombre de una ciudad válida.
* Destino: Ciudad de destino, debe ser el nombre de una ciudad válida.
* Pasajeros: valor numérico mayor o igual a  1.
* Tramo: Valor mayor a 1 si es multidestino seleccionado. 

### Clases de equivalencia válidas (CEv):
* solo ida = seleccionado		    (1)
* Pasajeros = 1			            (2)
* Origen = Bogotá, destino = Cartagena, ida y vuelta = seleccionado, fecha ida >= fecha actual, fecha regreso >= fecha ida	(3)

### Clases de equivalencia no válidas (CEnv):
* Pasajeros = 0	o >1			    (4)
* Origen = valor numérico 		    (5)
* Destino = Valor string no válido	(6)
* Multidestino

## Casos de prueba

| ID | Nombre | Valor | Esperado |
| ------------- | ------------- | ------------- | ------------- |
| CP01 | Solo ida  | Seleccionado | fecha regreso = bloqueado, ida y vuelta = no seleccionado, multidestino = no seleccionado. |
| CP02 | PasajerosCorrectos | = 1 | Campos de búsqueda accesibles |
| CP03 | Búsqueda | Origen = Bogotá, destino = Cartagena, ida y vuelta = seleccionado, fecha ida >= fecha actual, fecha regreso >= fecha ida | Opciones de vuelos |
| CP04 | PasajerosIncorrectos | < 1 | No válido |
| CP05 | malOrigen | numérico | No válido |
| CP06 | malDestino | Ciudad inexistente | No válido |
| CP07 | Selección de un vuelo | Seleccionado | Pantalla de llenado de datos personales |

Nota: Se realizó la automatización con Screenplay para el CP03.