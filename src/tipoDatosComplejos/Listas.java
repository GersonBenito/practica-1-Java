package tipoDatosComplejos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Listas {
    public static void main(String[] args){
        // declarar una lista
        ArrayList<String> lista = new ArrayList<String>();

        // agregar datos a una lista
        lista.add("Elemento A");
        lista.add("Elemeneto B");
        lista.add("Elemento C");

        // recorrer una lista
        for (String element : lista) {
            System.out.println(element);
        }

        // declarar una LinkedList
        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);

        for (String element : listaEnlazada){
            System.out.println("linkedList: "+element);
        }

    }
}
