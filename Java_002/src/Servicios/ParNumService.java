/* Ejrcicio_02: Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número */
package Servicios;

import Entidad.ParNumeros;
import java.util.Scanner;

/* @author G96xyFast */
public class ParNumService {

    Scanner leer = new Scanner(System.in);

    public ParNumeros CrearNumeros() {
        ParNumeros par = new ParNumeros();
        par.setNum1(Math.random() * 10 + 1);
        par.setNum2(Math.random() * 10 + 1);
        return par;
    }

    public void MostrarValores(ParNumeros par) {
        System.out.println("Número 1: " + par.getNum1());
        System.out.println("Número 2: " + par.getNum2());
    }

    public void DevolverMayor(ParNumeros par) {
        if (par.getNum1() == par.getNum2()) {
            System.out.println("Lo números son iguales");
        } else if (par.getNum1() > par.getNum2()) {
            System.out.println("El primer número es más grande: " + par.getNum1());
        } else {
            System.out.println("El segundo número es más grande: " + par.getNum2());
        }
    }

    public void CalcularPotencia(ParNumeros par) {
        if (par.getNum1() >= par.getNum2()) {
            System.out.println("La potencia de " + (int)par.getNum1() + "^" + (int)par.getNum2() + " es: " + Math.pow((int) par.getNum1(), (int) par.getNum2()));
        } else {
            System.out.println("La potencia de " + (int)par.getNum2() + "^" + (int)par.getNum1() + " es: " + Math.pow((int) par.getNum2(), (int) par.getNum1()));
        }
    }

    public void CalcularRaiz(ParNumeros par) {
        if (par.getNum1() <= par.getNum2()) {
            System.out.println("La raíz cuadrada de " + (int)par.getNum1() + " es: " + Math.sqrt(Math.abs(par.getNum1())));
        } else {
            System.out.println("La raíz cuadrada de " + (int)par.getNum2() + " es: " + Math.sqrt(Math.abs(par.getNum2())));
        }
    }

    public void Menu(ParNumeros par) {
        boolean var = false;
        while (var == false) {
            System.out.println("\nMENÚ:\n1-Mostrar valores\n2-Devolver mayor\n3-Calcular potencia\n4-Calcular raíz\n5-Salir");
            int opt = leer.nextInt();
            switch (opt) {
                case 1:
                    MostrarValores(par);
                    break;
                case 2:
                    DevolverMayor(par);
                    break;
                case 3:
                    CalcularPotencia(par);
                    break;
                case 4:
                    CalcularRaiz(par);
                    break;
                case 5:
                    System.out.println("Finalizando. Gracias por usar el programa");
                    var= true;
                    break;
                default:
                    System.out.println("Error. Ingrese una opción válida ");
            }
        }
    }

}
