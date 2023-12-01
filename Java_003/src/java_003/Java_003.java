/* Ejercicio_03: Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B */
package java_003;

import Servicios.ArregloService;

/* @author G96xyFast */
public class Java_003 {
    public static void main(String[] args) {
        double [] lista1= new double[50];
        double [] lista2= new double[20];
        ArregloService serv= new ArregloService();
        serv.InicializarA(lista1);
        serv.Mostrar(lista1);
        serv.Ordenar(lista1);
        serv.InicializarB(lista1, lista2);
    }   
}