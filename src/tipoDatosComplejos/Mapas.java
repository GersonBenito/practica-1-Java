package tipoDatosComplejos;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args){

        // Declarar un mapa
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();

        // asignar datos a un mapa
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.put("clave3", 40);

        System.out.println(mapa);

        // acceder a un solo valor del mapa
        System.out.println("valor: " + mapa.get("clave2"));

        // uso del metodo replace de los mapas
        // si la clave no existe no se va ha a crear
        mapa.remove("clave4", 190);
        System.out.println("mapa: " + mapa);

        // recorrer un mapa
        for(Map.Entry elemento : mapa.entrySet()){
            // obtener llave / valor
            System.out.println("La llave es: " + elemento.getKey());
            System.out.println("El valor es: " + elemento.getValue());
        }
    }
}
