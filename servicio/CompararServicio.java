package servicio;

// que es una clase de servicio?
// es una clase, que (deberia solo) tener funciones.

// o se podria decir, que es una clase que hace algo.

public class CompararServicio {

    public void comparar1(int numero1, int numero2) {
        if (numero1 < numero2) {
            System.out.println("numero1 es menor que numero2");
        }
        if (numero1 > numero2) {
            System.out.println("numero1 es mayor que numero2");
        }
        if (numero1 == numero2) {
            System.out.println("son iguales");
        }
    }

    public void comparar2(int numero1, int numero2) {
        if (numero1 < numero2) {
            System.out.println("numero1 es menor que numero2");
        } else {
            if (numero1 > numero2) {
                System.out.println("numero1 es mayor que numero2");
            } else {
                System.out.println("son iguales");
            }
        }
    }

    public void comparar3(int numero1, int numero2) {
        if (numero1 < numero2) {
            System.out.println("numero1 es menor");
        } else {
            if (numero1 > numero2) {
                System.out.println("numero1 es mayor");
            } else {
                System.out.println("son iguales");
            }
        }
    }

    public String comparar4(int num1, int num2) {
        String resultado = "";
        // todo en ingles es tareas por hacer.
        // todo: pendiente
        if (num1 < num2) {
            resultado = "numero1 es menor";
        }
        if (num1 > num2) {
            resultado = "numero1 es mayor";
        }
        if (num1 == num2) {
            resultado = "son iguales";
        }

        return resultado;

    }
}
