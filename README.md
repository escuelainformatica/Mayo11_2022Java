# Este es un archivo de comentario

## para crear una funcion

* 1) Crear una clase de "servicio". Una clase de servicio es una clase que queremos que tenga funciones.
* 2) Opcionalmente, la clase de servicio se crea en una carpeta que indique su tipo, ejemplo, en la carpeta servicio.
* 3) Opcionalmente, la clase de servicio, tiene un prefijo.

📁 servicio   
....📃 EncomiendaServicio.java  

* 4) Cuando creo la funcion, debo saber que valores necesito de entrada, y que valores voy a regresar.

* 5) Si una funcion regresa algo, es necesario regresar el valor.

```java
   // no va a compilar
   public int suma(int n1,int n2) {

   }
   // ok:
   public int suma(int n1,int n2) {
       int resultado=0;
       //todo: falta implementar

       return resultado;
   }   

```

