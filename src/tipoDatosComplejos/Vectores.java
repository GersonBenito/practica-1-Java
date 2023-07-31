package tipoDatosComplejos;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args){

        // los vectores son array dinamicos y pueden creder dinamicamente

        // declarar un vector
        // la capacidad inciial es opcional y la capacidad
        Vector<Integer> vector = new Vector<>(120, 5);

        // agregar datos a un vector
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("vector: " + vector);

        // eliminar un dato del vector
        vector.remove(2);

        System.out.println("nuevo vector: " + vector);

        // tamaño y capacidad de un vector
        System.out.println("Tamaño del vector: " + vector.size() + " y capacidad: " + vector.capacity());

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector2.add(4);
        vector2.add(5);

        // verificar si los vectores son iguales
        boolean resultado = vector.equals(vector2);

        System.out.println("Son iguales? " + resultado);

        // recorrer un vector de la forma corta
        for (int element : vector2){
            System.out.println("Valor del vector 2 forma corto: " + element);
        }

        // recorrer un vector de la forma larga(tradicional)
        for(int i = 0; i < vector2.size(); i++){
            System.out.println("Valor del vector 2 forma largo: " + vector2.get(i));
        }

        // limpiar memoria de un vector
        Vector<Integer> vector3 = new Vector<>(16);
        vector3.add(1);
        vector3.add(2);
        vector3.add(3);
        vector3.add(4);
        vector3.add(5);
        System.out.println("Capacidad vector 3: " + vector3.capacity() + " tamaño: " + vector3.size());

        // metodo para liberar espacio del vector
        vector3.trimToSize();
        System.out.println("Capacidad vector 3: " + vector3.capacity() + " tamaño: " + vector3.size());
    }
}
