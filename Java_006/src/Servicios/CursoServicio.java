/* Ejercicio_06: Un profesor particular está dando cursos para grupos de cinco alumnos
y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los
siguientes métodos:
a) Un constructor por defecto. b) Un constructor con todos los atributos como parámetro. c) Métodos getters y setters de cada atributo.
d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro  */
package Servicios;

import Entidad.Curso;
import java.util.Scanner;

/* @author G96xyFast */
public class CursoServicio {
    Scanner leer = new Scanner(System.in);
    public Curso CrearCurso(){
        Curso curso= new Curso();
        System.out.println("Ingrese nombre del curso: ");
        curso.setNombreCurso(ComprobarString());
        System.out.println("Ingrese cantidad de horas por día: ");
        curso.setCantHorasDias(ComprobarInt());
        System.out.println("Ingrese cantidad de días a la semana: ");
        curso.setCantDiasSemanas(ComprobarInt());
        System.out.println("Ingrese turno(M/T): ");
        curso.setTurno(true); // Verificar
        System.out.println("Ingrese precio por hora: ");
        curso.setPrecioHora(ComprobarDouble());
        curso.setAlumnos(CargarAlumnos());
        return curso;
    }
    public String [] CargarAlumnos(){
        System.out.println("Ingrese cantidad de alumnos(min= 1, max= 5): ");
        int num= CantAlumnos();
        String aux []= new String [num];
        for (int i = 0; i < aux.length; i++) {
            System.out.println("Ingrese un nombre: ");
            aux[i]= ComprobarString();
        }
        return aux;
    }
    public void CalcularGananciaSemanal(Curso curso){
        double sueldo= curso.getCantHorasDias()* curso.getCantDiasSemanas()* curso.getPrecioHora()* curso.getAlumnos().length;
        System.out.println("La ganancia por semana es: " + sueldo);
    }
    public int ComprobarInt(){
        int num= leer.nextInt();
        while (num<=0) {
            System.out.println("Error. Ingrese un valor válido: ");
            num= leer.nextInt();
        }
        return num;
    }
    public double ComprobarDouble(){
        double num= leer.nextDouble();
        while (num<=0) {
            System.out.println("Error. Ingrese un valor válido: ");
            num= leer.nextDouble();
        }
        return num;
    }
    public String ComprobarString(){
        String nombre= leer.next();
        boolean var= false;
        while (var== false) {
            boolean aux= false;
            for (int i = 0; i < nombre.length(); i++) {
                if (!nombre.substring(i, i+1).equals(" ") && !nombre.substring(i, i+1).equals("")) {
                    aux= true;
                }
            }
            if (aux== true) {
                var= true;
            } else {
                System.out.println("Error. Ingrese un nombre válido: ");
                nombre= leer.next();
            }
        }
        return nombre;
    }
    
    public int CantAlumnos(){
        int num= leer.nextInt();
        while (num<=0 || num>5) {
            System.out.println("Error. Ingrese un número válido(1-5): ");
            num= leer.nextInt();
        }
        return num;
    }
}
