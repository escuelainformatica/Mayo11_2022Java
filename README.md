# Este es un archivo de comentario

## para crear una función

1. Crear una clase de "servicio". Una clase de servicio es una clase que queremos que tenga funciones.
2. Opcionalmente, la clase de servicio se crea en una carpeta que indique su tipo, ejemplo, en la carpeta servicio.
3. Opcionalmente, la clase de servicio, tiene un prefijo.

📁 servicio   
....📃 EncomiendaServicio.java  

1. Cuando creo la función, debo saber que valores necesito de entrada, y que valores voy a regresar.
2. Si una función regresa algo, es necesario regresar el valor.

```java
class MiClaseServicio {
   // no va a compilar
   public int suma(int n1,int n2) {

   } // fin de sumar
   // ok:
   public int suma(int n1,int n2) {
       int resultado=0;
       //todo: falta implementar

       return resultado;
   }  // fin de sumar
} // fin de la clase
```

## Como llamo a una función

```java
public static void main(String[] args) {
     // 1) creo una variable del tipo de la clase de servicio
    MiClaseServicio srv=new MiClaseServicio(); // donde srv, es nuestra variable
    
    int total=srv.suma(10,20);
    
}
```

## Que pasa si la función no regresa ningún valor?

1. Una función que no regresa nada, debe indicarse el valor "**void**"
2. La función que no regresa nada, no puede usarse "return"

```java
class MiClaseServicio {
  	public void mostrar(int numero) {
        //todo: aqui va el codigo
    }
     
}
```

## Ejemplo de función

```java
class MiClaseServicio {
 	// no regresa valor
    public void mostrar(String texto) {
        //todo: falta codigo aqui
    }
    // regresa un texto
    public string obtenerValor(int arg) {
        String resultado="";
        //todo: falta codigo aqui
        return resultado;
    }
    // sin argumentos
    public int funcion1() {
		int resultado=0;
        //todo: falta codigo aqui
        return resultadO;
    }
    // una funcion puede tener un objeto como argumento.
    // un objeto es una variable definida por una clase.
    public void mostrarCliente(Cliente cli) {
        //todo: falta codigo aqui
    }
    
    // una funcion que regresa un objeto y que sirve para crear el objeto, puede llamarse "factory"
    public Cliente factoryCliente() {
        Cliente cli=new Cliente();
         //todo: falta codigo aqui
        return cli;
    }
    
}
```

