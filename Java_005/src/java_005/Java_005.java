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
package java_005;

import Entidad.Persona;
import Servicios.PersonaService;

/* @author G96xyFast */
public class Java_005 {
    public static void main(String[] args) {
        PersonaService serv= new PersonaService();
        Persona pers= serv.CrearPersona();
        int diferencia= serv.CalcularEdad(pers.getFechaNacimiento());
        System.out.println("La diferencia en años es: " + diferencia);
        boolean var= serv.MenorQue(pers, serv.ComprobarEdad());
        if (var==true) {
            System.out.println("\nLa persona es menor que la edad ingresada");
        } else {
            System.out.println("\nLa persona no es menor a la edad ingresada");
        }
        serv.MostrarPersona(pers);
    }   
}