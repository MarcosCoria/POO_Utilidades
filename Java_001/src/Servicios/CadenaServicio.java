/* Ejercicio_01: Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática. Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no  */
package Servicios;

import Entidad.Cadena;
import java.util.Scanner;

/* @author G96xyFast */
public class CadenaServicio {

    public Cadena CrearFrase() {
        Cadena cad = new Cadena();
        System.out.println("Ingrese una frase: ");
        cad.setFrase(ComprobarFrase());
        System.out.println("Frase: " + cad.getFrase());
        System.out.println("Longitud: " + cad.getLongitud());
        return cad;
    }

    public void MostrarVocales(String frase) {
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase("a") || frase.substring(i, i + 1).equalsIgnoreCase("e") || frase.substring(i, i + 1).equalsIgnoreCase("i") || frase.substring(i, i + 1).equalsIgnoreCase("o") || frase.substring(i, i + 1).equalsIgnoreCase("u")) {
                cont++;
            }
        }
        System.out.println("La cantidad de vocales es: " + cont);
    }

    public void InvertirFrase(String frase) {
        String aux = "";
        for (int i = frase.length(); i > 0; i--) {
            System.out.println(" letra: " + frase.substring(i - 1, i));
            aux = aux + frase.substring(i - 1, i);
        }
        System.out.println("Frase invertida: " + aux);
    }

    public void VecesRepetido(String frase) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un carácter: ");
        String letra = ComprobarLetra();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        System.out.println("La letra '" + letra + "' se repite " + cont + " veces");
    }

    public void CompararLongitud(String frase) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String aux = ComprobarFrase();
        if (frase.length() == aux.length()) {
            System.out.println("Las frases ingresadas tienen la misma longitud");
        } else if (frase.length() > aux.length()) {
            System.out.println("La frase original tiene una longitud mayor");
        } else {
            System.out.println("La frase ingresada recientemente tiene una mayor longitud");
        }
    }

    public void UnirFrases(String frase) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String aux = ComprobarFrase();
        frase = frase + aux;
        System.out.println("Nueva frase: " + frase);
    }

    public void Reemplazar(String frase) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un carácter a reemplazar en cada letra 'a': ");
        String aux = ComprobarLetra();
        String nueva = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase("a")) {
                nueva = nueva + aux;
            } else {
                nueva = nueva + frase.substring(i, i + 1);
            }
        }
        System.out.println("Nueva frase: " + nueva);
    }

    public void Contiene(String frase) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un carácter: ");
        String aux = ComprobarLetra();
        boolean var = false;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(aux)) {
                var = true;
            }
        }
        if (var == true) {
            System.out.println("Sí contiene el carácter '" + aux +  "'");
        } else {
            System.out.println("No contiene el carácter '" + aux +  "'");
        }
    }

    public String ComprobarFrase() {
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        boolean var = false;
        while (var == false) {
            boolean aux = false;
            for (int i = 0; i < frase.length(); i++) {
                if (!frase.substring(i, i + 1).equals(" ")) {
                    aux = true;
                }
            }
            if (aux == false) {
                System.out.println("Error. Ingrese una nueva frase: ");
                frase = leer.nextLine();
            } else {
                var = true;
            }
        }
        return frase;
    }
    
    public String ComprobarLetra() {
        Scanner leer = new Scanner(System.in);
        boolean var= false;
        String letra = leer.nextLine();
        while (var== false) {
            if (letra.length()>1) {
                System.out.println("Error. Inrgese un sólo carácter: ");
                letra= leer.nextLine();
            } else if(letra.equals(" ") || letra.equals("")) {
                System.out.println("Error. Inrgese un carácter válido: ");
                letra= leer.nextLine();
            } else {
                var= true;
            }
        }
        return letra;
    }

    public void Menu(Cadena cad) {
        Scanner leer = new Scanner(System.in);
        boolean var = false;
        while (var == false) {
            System.out.println("\nMENÚ\n1-Mostrar vocales\n2-Invertir frase\n3-Cantidad de veces repetido\n4-Compara longitud\n5-Unir frases\n6-reemplazar\n7-Si contiene un carácter\n8-Salir");
            int opt = leer.nextInt();
            switch (opt) {
                case 1:
                    MostrarVocales(cad.getFrase());
                    break;
                case 2:
                    InvertirFrase(cad.getFrase());
                    break;
                case 3:
                    VecesRepetido(cad.getFrase());
                    break;
                case 4:
                    CompararLongitud(cad.getFrase());
                    break;
                case 5:
                    UnirFrases(cad.getFrase());
                    break;
                case 6:
                    Reemplazar(cad.getFrase());
                    break;
                case 7:
                    Contiene(cad.getFrase());
                    break;
                case 8:
                    System.out.println("Finalizando. Gracias por utilizar el programa");
                    var = true;
                    break;
                default:
                    System.out.println("Error. Ingrese un carácter válido");
                    ;
            }
        }
    }
}
