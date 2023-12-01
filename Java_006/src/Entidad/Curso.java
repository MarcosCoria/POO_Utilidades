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
package Entidad;

/* @author G96xyFast */
public class Curso {
    private String NombreCurso;
    private int CantHorasDias, CantDiasSemanas;
    private String [] alumnos; // Sólo 5 alummnos
    private boolean turno; // Mañana o tarde
    private double PrecioHora;

    public Curso() {
    }

    public Curso(String NombreCurso, int CantHorasDias, int CantDiasSemanas, String[] alumnos, boolean turno, double PrecioHora) {
        this.NombreCurso = NombreCurso;
        this.CantHorasDias = CantHorasDias;
        this.CantDiasSemanas = CantDiasSemanas;
        this.alumnos = alumnos;
        this.turno = turno;
        this.PrecioHora = PrecioHora;
    }

    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }

    public int getCantHorasDias() {
        return CantHorasDias;
    }

    public void setCantHorasDias(int CantHorasDias) {
        this.CantHorasDias = CantHorasDias;
    }

    public int getCantDiasSemanas() {
        return CantDiasSemanas;
    }

    public void setCantDiasSemanas(int CantDiasSemanas) {
        this.CantDiasSemanas = CantDiasSemanas;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public double getPrecioHora() {
        return PrecioHora;
    }

    public void setPrecioHora(double PrecioHora) {
        this.PrecioHora = PrecioHora;
    }

    @Override
    public String toString() {
        return "Curso{" + "NombreCurso=" + NombreCurso + ", CantHorasDias=" + CantHorasDias + ", CantDiasSemanas=" + CantDiasSemanas + ", alumnos=" + alumnos + ", turno=" + turno + ", PrecioHora=" + PrecioHora + '}';
    }
    
}