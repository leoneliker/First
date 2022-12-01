# Cambios realizados por Iker Iturralde

## Lo primero que verá el usuario al iniciar la app, será un splash a modo de carga, con el titulo de la aplicacion desvaneciendose mientras de fondo aparece una imagen de Messi, el principal simbolo.
## Para poder ver el código del splash, puede dirigirte aquí:
[Splash Java](https://github.com/leoneliker/First/blob/master/app/src/main/java/com/example/fundamentals/Splash.java)
[Splash Xml](https://github.com/leoneliker/First/blob/master/app/src/main/res/layout/activity_splash.xml)


##### Titulo desvaneciendose
![Titulo desapareciendo](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img.png)
##### Imagen apareciendo
![Imagen apareciendo](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_1.png)

## Cuando termine la pantalla de carga, se iniciará directamente el login de la aplicación
##
[Login Java](https://github.com/leoneliker/First/blob/master/app/src/main/java/com/example/fundamentals/LoginActivity.java)
[Login Xml](https://github.com/leoneliker/First/blob/master/app/src/main/res/layout/activity_login.xml)

![Login](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_2.png)

##### En el login, el usuario podrá registrarse haciendo uso de los TextInputLayout con un gran fondo transparente que se ajustan a la perfección a la estética minimalista de la app.
![TextInputLayout](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_3.png)


##### Previo a eso, se puede observar la imagen de icono haciendo un pequeño zoom repetitivo
![ZoomIn](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_4.png)
![ZoomOut](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_5.png)

##### Luego, encontramos dos botones, los cuales son transparentes hasta que el usuario mantiene el click sobre ellos
![Boton sin pulsar](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_6.png)
![Boton pulsado](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_7.png)

##### El boton de login, tiene funcionalidad, aunque lo veremos mas adelante, antes, comentaremos la funcionalidad que tiene la frase que se encuentra debajo de los botones, la cual nos lleva a:
[SingUp Java](https://github.com/leoneliker/First/blob/master/app/src/main/java/com/example/fundamentals/SingUpActivity.java)
[SingUp Xml](https://github.com/leoneliker/First/blob/master/app/src/main/res/layout/activity_sing_up.xml)
##### Y nos permite "registrarnos"
![Frase que nos permite movernos](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_8.png)

##Una vez hecho click, nos dirigimos a SingUp activity, donde, de forma muy simple el usuario podrá registrarse en la app, tiene un boton igual a los anteriores solo que, en este caso, el de cancelar te permite regresar al login.
![Sing up](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_9.png)

##### Si volvemos al login tenemos un ultimo boton que nos permite salir de la app.
![Salir](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_10.png)

##### Si hacemos click en login, nos cambiará a: 
[Main Java](https://github.com/leoneliker/First/blob/master/app/src/main/java/com/example/fundamentals/Main.java)
[Main Xml](https://github.com/leoneliker/First/blob/master/app/src/main/res/layout/activity_main.xml)


## Main activity
## Al hacer click en login, nos encontramos la funcion principal de la app, la cual carga un image view desde internet, en este caso una foto de una persona aleatoria gracias a [ThisPersonDoesntExist](https://thispersondoesnotexist.com/)
![Main](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_11.png)

##### Adicionalmente tenemos varias funciones
##### La primera es la flecha de la toolbar, que nos permite volver atras
![Flecha](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_12.png)

##### Si hacemos scroll hacia abajo, se recarga la pagina y sale otra imagen nueva
![Recarga](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_13.png)

##### Si mantenemos pulsado en la imagen, nos abrira un pequeño menu donde podremos copiar la imagen o descargarla
![Menu](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_14.png)

##### Adicionalmente, si elegimos la opción de copiar, saldra un "snackbar" diciendo si queremos revertir la accion
![Copiar](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_15.png)


##### Para terminar, comentar que cuando se realiza la descarga o la recarga de la imagen, sale un "Toast abajo"



# Funcionalidad extra
## La app se puede utilizar en horizontal
![Splash Land](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_16.png)
![Login Land](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_17.png)
![SingUp Land](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_18.png)
![Main Land](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_19.png)





# Se han realizado multiples cambios en la aplicación
## Cambio en el fondo y los colores principales

##### Ajustado el gradiente en el fondo del login y el sing up
![Gradiente_login](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_20.png)
![Gradiente singup](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_21.png)

## Cambios en el sing up y 
##### Hemos hecho cambios en la paleta de colores, por eso, se puede apreciar claramente que la app bar en el singup y main, ya no es azul:
![Colores app bar](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_22.png)

##### Para ver la nueva paleta, dirigete aqui: 
[Colores Xml](https://github.com/leoneliker/First/blob/master/app/src/main/res/values/colors.xml)

##### En adicion a los colores, se ha añadido un modo oscuro
[Colores oscuro Xml](https://github.com/leoneliker/First/blob/master/app/src/main/res/values-night/colors.xml)

#####     

![Colores oscuro](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_23.png)
![Colores oscuro](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_24.png)


## Cambios en el idioma

##### Se ha agregado de forma automatica la traducción al español del login y del sing up, para poder opter a ambos
##### Antiguo login en ingles
![Login](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_2.png)
##### Nuevo login en español
![Login español](https://github.com/leoneliker/First/blob/master/app/src/main/res/Imagenes/img_20.png)

