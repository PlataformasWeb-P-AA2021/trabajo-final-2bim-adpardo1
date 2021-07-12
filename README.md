# Trabajo Final Segundo Bimestre

* El siguiente trabajo se lo realizará de forma grupal (grupos de máximos dos personas). Cada estudiante clonará el repositorio de forma individual.

## Tema:

Aplicación conceptos de herencia y polimorfismo

## Problemática

Las empresas de telefonía celular pueden ofrecer los siguientes planes. Todos los planes al menos debe tener las siguientes características:

### PlanCelular
- propietario tipo (Persona: nombres, apellido, identificación)
- Ciudad propietario (tipo cadena)
- marca de celular
- modelo del celular
- numero celular
- pago mensual (para obtener el valor, se debe operar en cada subclase)

Los planes se caracterizan y clasifican así:

### PlanPostPagoMinutos
- minutos nacionales 
- costo minuto nacional
- minutos internacionales
- costo minuto internacional

### PlanPostPagoMegas
- megas expresado en gigas
- costo por cada gigas
- tarifa base 

### PlanPostPagoMinutosMegas
- minutos
- costo minutos
- megas expresado en gigas
- costo por cada gigas

### PlanPostPagoMinutosMegasEconomico
- minutos
- costo minutos
- megas expresado en gigas
- costo por cada gigas
- porcentaje de descuento (Ejemplo: 10%)


## Tareas:

En una clase Principal usted debe:

- Generar un método main que permita ingresar múltiples tipos de objetos de Planes de celular. 
- Se debe calcular el valor mensual a pagar de acuerdo a su contexto.
- Guardar la información de cada objeto en un archivo serializado.
- Obtener la información del archivo serializado y presentar la información de cada objeto haciendo uso
  del método toString
- Generar un diagrama que involucre las clases del polimorfismo.

## Recomendaciones:

- Analizar la problemática.
- Realizar el diagrama (carpeta diagramas)
- Crear la solcución en Java (carpeta lenguaje-programacion)

## Proceso a seguir:

- En el método (main) de la clase a Ejecutar. En un ciclo repetitivo el usuario puede decidir que tipo de Plan desea crear para la empresa de acuerdo a las opciones: PlanPostPagoMinutos, PlanPostPagoMegas, PlanPostPagoMinutosMegas, PlanPostPagoMinutosMegasEconomico.
- De acuerdo a la opción, el usuario ingresa por teclado los datos necesarios para crear el objeto.
- Luego de crear el objeto; se debe guardar el mismo en un archivo llamado: planes.data
- Finalizado el ciclo (cuando lo decida el usuario); se debe presentar todos los objetos guardados en el archivo.

## Fecha de presentación

Miércoles 28 de julio de 2021
