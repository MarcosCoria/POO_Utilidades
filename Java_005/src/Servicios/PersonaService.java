/* Ejercicio_05: Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada  */
package Servicios;

import Entidad.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* @author G96xyFast */
public class PersonaService {
    Scanner leer = new Scanner(System.in);

    public Persona CrearPersona() {
        Persona pers = new Persona();
        System.out.println("Ingrese nombre: ");
        pers.setNombre(ComprobarNombre());
        System.out.println("Ingrese fecha de nacimiento: ");
        pers.setFechaNacimiento(CrearFecha());
        return pers;
    }

    public int CalcularEdad(Date fechaNacimiento) {
        Calendar a= new GregorianCalendar();
        a.setTime(fechaNacimiento);
        Calendar b = new GregorianCalendar();
        b.setTime(new Date());
        int diferencia= a.getTime().getYear()- b.getTime().getYear();
        return Math.abs(diferencia);
    }

    public boolean MenorQue(Persona pers, int edad) {
        boolean var = false;
        if (CalcularEdad(pers.getFechaNacimiento())<edad) {
            var=true;
        }
        return var;
    }

    public void MostrarPersona(Persona pers) {
        System.out.println("Nombre: " + pers.getNombre());
        System.out.println("Fecha de Naciemiento: " + pers.getFechaNacimiento());
    }

    public String ComprobarNombre() {
        boolean var = false;
        String nombre = leer.nextLine();
        while (var == false) {
            boolean aux = false;
            for (int i = 0; i < nombre.length(); i++) {
                if (!nombre.substring(i, i + 1).equals(" ") && !nombre.substring(i, i + 1).equals("")) {
                    aux = true;
                }
            }
            if (aux == true) {
                var = true;
            } else {
                System.out.println("Error. Ingrese otro nombre: ");
                nombre = leer.nextLine();
            }
        }
        return nombre;
    }

    public Date CrearFecha() {
        Date fecha = new Date();
        System.out.println("Ingrese un año: ");
        int anio = leer.nextInt();
        System.out.println("Ingrese un mes: ");
        int mes = ComprobarMes();
        System.out.println("Ingrese un día: ");
        int dia = ComprobarDia(mes, anio);
        fecha.setDate(dia);
        fecha.setMonth(mes);
        fecha.setYear(anio-1900);
        return fecha;
    }

    public int ComprobarMes() {
        int mes = leer.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Error. Ingres un mes válido: ");
            mes = leer.nextInt();
        }
        return mes;
    }

    public int ComprobarDia(int mes, int anio) {
        int dia = leer.nextInt();
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                while (dia < 1 || dia > 31) {
                    System.out.println("Error. Ingrese un día válidao(1-31): ");
                    dia = leer.nextInt();
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                while (dia < 1 || dia > 30) {
                    System.out.println("Error. Ingrese un día válidao(1-30): ");
                    dia = leer.nextInt();
                }
                break;
            case 2:
                if (anio % 4 == 0) {
                    while (dia < 1 || dia > 29) {
                        System.out.println("Error. Ingrese un mes válido(1-29): ");
                        dia = leer.nextInt();
                    }
                } else {
                    while (dia < 1 || dia > 28) {
                        System.out.println("Error. Ingrese un mes válido(1-28): ");
                        dia = leer.nextInt();
                    }
                }
                break;
            default:
                System.out.println("Error");
                ;
        }
        return dia;
    }
    
    public int ComprobarEdad(){
        System.out.println("Ingrese una edad: ");
        int edad= leer.nextInt();
        while (edad<=0) {
            System.out.println("Error. Ingrese una edad válida: ");
            edad= leer.nextInt();
        }
        return edad;
    }
}
