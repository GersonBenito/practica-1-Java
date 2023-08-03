package tipoDatosComplejos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysLists {

    public static void main(String[] args){

        // capacidadVector = capacidadVector * 2;

        // CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5)
        ArrayList<String> lista = new ArrayList<>();

        // agregar valores a la lista
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        // eliminar un elemento de la lista
        lista.remove("Elemento B"); // se puede hacer referencia al elemento o al indice

        // ver el contenido de la lista
        System.out.println("Contenido de la lista: " + lista);

        // recorrer un ArrayList,forma corta
        for(String element : lista){
            System.out.println("Forma corta: " + element);
        }

        //recorrer un ArrayList, forma tradicional
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Forma tradicional: " + lista.get(i));
        }

        // asignar datos a un array tradicional
        String[] array = new String[lista.size()];

        for (int i = 0; i < lista.size(); i++){
            array[i] = lista.get(i);
        }

        // revisar e iterrar el arreglo
        System.out.println("Array: " + Arrays.toString(array));

        for (String element : array){
            System.out.println("array element: " + element);
        }
    }
}
