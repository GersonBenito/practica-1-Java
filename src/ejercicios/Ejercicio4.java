package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    // Autor: Gerson Benito

    /*
        Armar un programa que permita que muestre los 100 primeros numeros primeros
        Ejemplo: 1,2,3,5,7,11,13...
     */
    public static void main(String[] arg){

        int numeros = 0;
        int numero = 2;
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cantida de numeros: ");
        numeros = scanner.nextInt();

        System.out.println("Los primeros " +  numeros + " numeros primeros son:");

        while (contador < numeros){
            if(verificarNumero(numero)){
                System.out.println("["+(contador + 1)+"]: "+numero + ", ");
                contador++;
            }
            numero++;
        }

        scanner.close();

    }

    public static boolean verificarNumero(int numero){
        if(numero <= 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(numero); i++){
            if(numero % i == 0){
                return false;
            }
        }

        return true;
    }
}
