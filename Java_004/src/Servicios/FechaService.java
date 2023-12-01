/* Ejercicio_04: Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion
Oracle */
package Servicios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*  @author G96xyFast*/
public class FechaService {
    Scanner leer = new Scanner(System.in);

    public Date FechaNacimiento() {

        Date fecha = new Date();
        System.out.println("Ingrese el año: ");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = ComprobarMes();
        System.out.println("Ingrese el día: ");
        int dia = ComprobarDia(mes, anio);

        fecha.setDate(dia); // Seteamos el dia
        fecha.setMonth(mes); // Seteamos el mes
        fecha.setYear(anio - 1900); // Seteamos el anio

        return fecha;
    }

    public void Mostrar(Date fecha) {
        System.out.println("Fecha: " + fecha);
    }

    public Date FechaActual() {
        Date fechaActual = new Date();
        System.out.println("Fecha actual: " + fechaActual);
        return fechaActual;
    }
    
    // Inconcluso
    public void Diferencia(Date fechaNacimiento, Date fechaActual) {
        Calendar a= new GregorianCalendar();
        a.setTime(fechaNacimiento);
        Calendar b = new GregorianCalendar();
        b.setTime(new Date());
        int diferencia= a.getTime().getYear()- b.getTime().getYear();
        System.out.println("La diferencia en años es: " + Math.abs(diferencia));
    }

    public int ComprobarDia(int mes, int anio) {
        int dia = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dia = leer.nextInt();
                while (dia < 1 || dia > 31) {
                    System.out.println("Error. Ingrese un día válido(1-31): ");
                    dia = leer.nextInt();
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dia = leer.nextInt();
                while (dia < 1 || dia > 30) {
                    System.out.println("Error. Ingrese un día válido(1-30): ");
                    dia = leer.nextInt();
                }
                break;
            case 2: // Anio
                if (anio % 4 == 0) {
                    dia = leer.nextInt();
                    while (dia < 1 || dia > 29) {
                        System.out.println("Error. Ingrese un día válido(1-29): ");
                        dia = leer.nextInt();
                    }
                } else {
                    dia = leer.nextInt();
                    while (dia < 1 || dia > 28) {
                        System.out.println("Error. Ingrese un día válido(1-28): ");
                        dia = leer.nextInt();
                    }
                }
                break;
            default:
                System.out.println("Error.");
        }
        return dia;
    }

    public int ComprobarMes() {
        int mes = leer.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Error. Ingrese un mes válido");
            mes = leer.nextInt();
        }
        return mes;
    }
}
