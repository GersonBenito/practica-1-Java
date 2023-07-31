package tipoDatosComplejos;

public class Cadenas {
    public static void main(String[] args){
        String cadena = "Mensaje DE textO";

        // conocer la longuitud de la cadena
        int cadenaLen = cadena.length();
        System.out.println("La longuitud de la cadena es: " + cadenaLen);

        // pasar a minuscula una cadena
        String candenaMinuscula = cadena.toLowerCase();
        System.out.println("Cadena minuscula: " + candenaMinuscula);

        // pasar a mayuscula una cadena
        String candenaMayuscula = cadena.toUpperCase();
        System.out.println("Cadena mayuscula es: " + candenaMayuscula);

        // revisar si una cadena inicia con una palabra
        boolean iniciaCon = cadena.startsWith("Men");
        if(iniciaCon){
            System.out.println("La cadena si inicia con la palabra");
        }else{
            System.out.println("La cadena no inicia con la palabra");
        }

        // revusar si una cadena termina con una palabra
        boolean finalizaCon = cadena.endsWith("tO");
        if(finalizaCon){
            System.out.println("La cadena si finaliza con la palabra");
        }else{
            System.out.println("la cadena no finaliza con la palabra");
        }

        // buscar un caracter del string
        char letraInicial = cadena.charAt(0);
        System.out.println("La palabra inicia con: " + letraInicial);

        // recorrer un string
        for(int i = 0; i < cadena.length(); i++){
            System.out.println("Caracter: " +  cadena.charAt(i));
        }
    }
}
