# Práctica 2. Juego de la vida


# README #

_Este readme sirve como explicación de que he escrito en el código y cual es el objetivo del mismo._

## Resumen ##
_Con este programa es posible conseguir El juego de la vida el cual muestra cómo se reproducen unas células siguiendo unas sencillas reglas. Fue creado por el matemático John Horton Conway en 1970._

## ¿Como funciona este juego ? 🍭
_El juego se desarrolla sobre una grilla cuadriculada. Cada cuadrado de la grilla representa un espacio que puede estar vacío u ocupado por una célula (en este caso, el casillero está marcado). 
A partir de una posición inicial, el juego evoluciona de acuerdo a las siguientes reglas:_

a) Si una célula está viva y dos o tres de sus vecinas también lo están,
entonces continúa viva en el estado siguiente.

b) Si una célula está muerta y tres de sus vecinas están vivas, entonces pasa a estar viva en el estado siguiente.

c) El resto de células pasan a estar muertas en el estado siguiente


## Requisitos 📋

_Que programas y versiones deberá disponer para ejecutar el programa_

_Lenguaje de programación utilizado:_
```
java version "11.0.12"
```
_Editor de código:_

```
git version 2.33
```

## Comandos para comprobar y ejecutar el programa ⚙️

_En primer lugar se deberá comprobar que compila correctamente mediante el comando que ofrece nuestro makefile.
Tenemos que estar situados en el directorio donde esta el makefile_

```
make compilar  
```
_Una vez compilado el archivo y observado que todo funciona bien utilizamos otro comando establecido en el makefile para ejecutar el programa_
```
make ejecutar
```



---
## Autor del código:✒️


* **Juan García-Obregón**


## Licencia 📄

Este proyecto está bajo la Licencia Apache License, version 2.0 (The "License")

![](https://www.deividart.com/blog/wp-content/uploads/2020/05/creative-commons-by.jpg)

