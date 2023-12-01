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
package Servicios;

import java.util.Arrays;

/* @author G96xyFast */
public class ArregloService {
    public void InicializarA(double lista1[]){
        for (int i = 0; i < lista1.length; i++) {
            lista1[i]= Math.random()*10;
        }
    }
    public void Mostrar(double lista[]){
        System.out.println("Lista: " + Arrays.toString(lista));
    }
    public void Ordenar(double lista[]){
        double [] aux= new double[50];
        Arrays.sort(lista); // Ordenamos el original
        int j= lista.length-1; // Valor más alto que puede tomar 'j'
        for (int i = 0; i < lista.length; i++) {
            aux[j]= lista[i]; // Asignamos el valor más bajo a la última posición
            j--; // Decrementamos el valor de 'j'
        }
        System.out.println("Nueva lista: " + Arrays.toString(aux));
    }
    public void InicializarB(double[]lista1, double [] lista2){
        for (int i = 0; i < 20; i++) {
            if (i<10) {
                lista2[i]= lista1[1];
            } else {
                lista2[i]= 0.5;
            }
        }
        /* Usando 'Arrays.fill' 
        Arrays.fill(lista2, 10, 20, (double)(0.5));
        */
        System.out.println("Lista B: "+ Arrays.toString(lista2));
    }
}