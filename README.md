# Este es un archivo de comentario

## para crear una funci贸n

1. Crear una clase de "servicio". Una clase de servicio es una clase que queremos que tenga funciones.
2. Opcionalmente, la clase de servicio se crea en una carpeta que indique su tipo, ejemplo, en la carpeta servicio.
3. Opcionalmente, la clase de servicio, tiene un prefijo.

馃搧 servicio   
....馃搩 EncomiendaServicio.java  

1. Cuando creo la funci贸n, debo saber que valores necesito de entrada, y que valores voy a regresar.
2. Si una funci贸n regresa algo, es necesario regresar el valor.

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

## Como llamo a una funci贸n

```java
public static void main(String[] args) {
     // 1) creo una variable del tipo de la clase de servicio
    MiClaseServicio srv=new MiClaseServicio(); // donde srv, es nuestra variable
    
    int total=srv.suma(10,20);
    
}
```

## Que pasa si la funci贸n no regresa ning煤n valor?

1. Una funci贸n que no regresa nada, debe indicarse el valor "**void**"
2. La funci贸n que no regresa nada, no puede usarse "return"

```java
class MiClaseServicio {
  	public void mostrar(int numero) {
        //todo: aqui va el codigo
    }
     
}
```

## Ejemplo de funci贸n

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

# Logica

```java
if(var1 == var2) {
    // esto se ejecuta si la expresion var1 == var2 es verdadera.
}

if(var1 == var2) {
    // se ejecuta si son iguales
} else {
    // se ejecuta si no son iguales
}

if(true) {
    // esto se ejecuta siempre
}

```



## Operadores l贸gicos binarios

> Cuando me refiero a operadores binarios, me refiero a operadores que trabajan con dos valores

| Condici贸n | Descripci贸n                     |
| --------- | ------------------------------- |
| ==        | igualdad, ejemplo 1==2          |
| <         | menor, ejemplo 1<2              |
| >         | mayor, ejemplo 1>2              |
| <=, >=    | menor igual o mayor igual 1 <=2 |
| !=        | no igual, ejemplo 1 != 2        |
| true      | VERDADERO                       |
| false     | FALSO                           |

## Operador l贸gico unitario

```java
boolean condicion=true;
if(condicion) {
    // aqui va el codigo si condicion es igual a true
}
if(!condicion) {
    // ! es una negacion, por lo tanto, esto se ejecutaria si la condicion es false
}
```

## "Y" y "O" l贸gicos

```java
int num1=1;
int num2=2;
int num3=1;
// quiero saber si los 3 son iguales
if( num1==num2 && num2==num3) { // && es un "y" logico.
    // todos son iguales
}
if(num1 == num2) {
    if(num2 == num3) {
        // todos son iguales.
    }
}
// quiero saber si algunos de ellos son iguales
if(num1==num2 || num2==num3 || num1==num3) { // || o logico. "pipes" al lado izquierdo del teclado, donde esta el numero "1"
    // algunos son iguales.
}

```

## L贸gicas con "banderas"

```java
```

