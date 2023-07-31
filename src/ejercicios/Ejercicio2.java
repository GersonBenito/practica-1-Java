package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    /*
    * Ejercicio 2: Armar un programa que permita ingresar tres numeros y mostrar cual es mayor y cual es el menor
    */
    public static void main(String[] args){
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        String mayor = "";
        String menor = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        numero1 = scanner.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        numero2 = scanner.nextInt();

        System.out.println("Ingresa el tercer numero: ");
        numero3 = scanner.nextInt();

        if(numerosIguales(numero1, numero2, numero3)){
            System.out.println("Los numeros son iguales");
            return;
        }

        mayor = numeroMayor(numero1, numero2, numero3);
        menor = numeroMenor(numero1, numero2, numero3);
        System.out.println(mayor);
        System.out.println(menor);


        scanner.close();
    }


    /**
     * Funcion para obtner el numero mayor de 3 numeros
     * @param numero1 numero 1 de tipo entero
     * @param numero2 numero 2 de tipo entero
     * @param numero3 numero 3 de tipo entero
     * @return retorna un string indicando el orden del numero primero, segundo o tercero, ademas del numero
     */
    public static String numeroMayor(int numero1, int numero2, int numero3){
        int numeroMayor = 0;
        String textMayor = "";

        // verificar el numero mayor
        if(numero1 >= numero2 && numero1 >= numero3){
            numeroMayor = numero1;
            textMayor = "primer";
        }else if(numero2 >= numero1 && numero2 >= numero3){
            numeroMayor = numero2;
            textMayor = "segundo";
        }else {
            numeroMayor = numero3;
            textMayor = "tercero";
        }

        return "El " + textMayor + " numero con valor " + numeroMayor + " es mayor";
    }

    /**
     * Funcion para obtner el numero menor de 3 numeros
     * @param numero1 numero 1 de tipo entero
     * @param numero2 numero 2 de tipo entero
     * @param numero3 numero 3 de tipo entero
     * @return retorna un string indicando el orden del numero primero, segundo o tercero, ademas del numero
     */
    public static String numeroMenor(int numero1, int numero2, int numero3){
        int numeroMenor = 0;
        String textMenor = "";

        // verificar el numero menor
        if(numero1 <= numero2 && numero1 <= numero3){
            numeroMenor = numero1;
            textMenor = "primero";
        }else if(numero2 <= numero1 && numero2 <= numero3){
            numeroMenor = numero2;
            textMenor = "segundo";
        }else {
            numeroMenor = numero3;
            textMenor = "tercero";
        }

        return "El " + textMenor + " numero con valor " + numeroMenor + " es manor";
    }

    /**
     * Funcio para verificar si los numeros son iguales
     * @param numero1 de tipo entero
     * @param numero2 de tipo entero
     * @param numero3 de tipo entero
     * @return retorna un booleano, si los numeros son iguales retorna true, si no retorna false
     */
    public static boolean numerosIguales(int numero1, int numero2, int numero3){
        return numero1 == numero2 && numero1 == numero3;
    }

}

