[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pfJE6xdt)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=17198497&assignment_repo_type=AssignmentRepo)
# Práctica 3.0: Cadenas

# Título de la Actividad

## Identificación de la Actividad
- **ID de la Actividad:** Paractica 3.0: Cadenas
- **Módulo:** PROG
- **Unidad de Trabajo:** Unidad 3 Estructura de datos
- **Fecha de Creación:** 18-11-2024
- **Fecha de Entrega:** 18-11-2024
- **Alumno(s):**
    - **Nombre y Apellidos:** Adrian Fernandez Garrido
    - **Correo electrónico:** afergar613@g.educaand.es
    - **Iniciales del Alumno/Grupo:** AFG

## Descripción de la Actividad

- Se trabajan con cadenas para darles las vuelta compararlas y uso de metodos como count entre otras cosas.

## Instrucciones de Compilación y Ejecución
1. **Requisitos Previos:**
    - Python version: 3.11.9
    - IDE: Visual Studio Code

2. **Pasos para Compilar el Código:**

- Es python no se compila

3. **Pasos para Ejecutar el Código:**
   ```bash
   python [nombre.py]
   ```

4. **Ejecución de Pruebas:**
   ```bash
   pytest
   ```

## Desarrollo de la Actividad
### Descripción del Desarrollo

- Se realizan los ejercicios de cadenas con uso de funciones y respetando el principio de responsabilidad unica.

- Se separan entrada de procesamiento de salida.

### Código Fuente
- [Ejecicio Cadenas4](src/cadenas4.py)

```python

   ```

### Ejemplos de Ejecución
- **Entrada 1:**

- Se introduce una palabra y la letras que queremos contar en el codigo fuente

```python

   ```

- **Salida Esperada 1:**

- Saldra la cadena que queremos comprobar y la letra con el numero de veces que sale

```bash

   ```

### Resultados de Pruebas

- Se realizan test con pytest para comprobar las funciones principales de los programas.

```python

   ```

## Conclusiones

- Estos programas me ayudo a comprender un poco mejor el uso de cadenas y las posibilidades que hay.

- Tambien aprenderemos el uso de nuevas funciones como count.

## Referencias y Fuentes

[Revilofe](https://revilofe.github.io/section1/)


# Preguntas Sobre la actividad

## 1- Interpreta el significado del diagrama de clases
- a) Relación entre clases (Significado, Tipo, Multiplicidad
- b) Elementos de las clases (Tipos y propósito)
- c) Significado de agregarAlumno, inscribirse, mostrarInscrito (Funcionamiento)

### Respuesta

### Relación entre clases
- El diagrama nos muestra la relación entre Curso y Estudiante. Según la relación nos indica que curso contiene una especie de lista sobre estudiantes inscritos.
- La relación que hay entre ambas clases es de agregación indicada por el rombo vacío básicamente lo que nos quiere decir es que el curso tiene estudiantes, pero los estudiantes pueden existir independientemente del curso.
- La Clase Curso tiene una multiplicidad de 1 lo que quiere decir que cada estudiante está relacionado con un solo curso.
- La Clase Estudiante la multiplicidad es * que quiere decir muchos, por lo tanto, un curso puede tener muchos estudiantes.

### Elementos de las clases
- En la clase Curso encontramos 2 atributos nombre y código ambos de tipo string y privados representados por un -.
- nombre almacena el nombre del curso y código el identificador del curso.
- También contiene un método agregarAlumno público representado por +.
- El método agregarAlumno permite añadir un estudiante al curso.

- En la clase Estudiante encontramos 2 atributos nombre y dni ambos de tipo string y privados representados por un -.
- nombre almacena el nombre del estudiante y dni almacena el dni del estudiante
- También contiene 2 métodos inscribirse y mostrarInscritos ambos públicos representados por +.
- El método inscribirse permite que el estudiante se inscriba en el curso.
- El método mostrarInscritos muestra los estudiantes en un curso.

### Significado de los métodos

- agregarAlumno(alu)
  - Pertenece a la clase Curso.
  - Permite que curso agregue a un estudiante a una estructura de datos como por ejemplo una lista.
  - Se utilizará una mutable list para guardar los estudiantes.
  - al llamar al método el estudiante se agregará en la lista.

- inscribirse()
  - Pertenece a la clase Estudiante.
  - Permite a un estudiante inscribirse en un curso.
  - llama al método agregarAlumno de la clase Curso pasándose a sí mismo como parametro.

- mostrarInscritos()
  - Pertenece a la clase Estudiante.
  - muestra a los estudiantes inscritos mediante println.

## 2- Generación de código a partir del diagrama de clases

 - a) Crea las clases
 - b) Crea las relaciones
 - c) Crea un main para probar el sistemas
