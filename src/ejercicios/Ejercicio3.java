package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    /*
        Armar un programa que permita ingresar un numero y mostrar si es par o impar
     */
    public static void main(String[] args){
        int numero = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        numero = scanner.nextInt();

        if(validarNumero(numero)){
            return;
        }

        if(numero % 2 == 0){
            System.out.println("El numero " + numero + " es par");
        }else{
            System.out.println("El numero " + numero + " no es par");
        }

        scanner.close();

    }

    /**
     * Funcion para validar si el numero es negativo
     * @param numero de tipo de entero
     * @return retorna un booleado, true o false
     */
    public static boolean validarNumero(int numero){
        if(numero < 0){
            System.out.println("El numero es nagativo");
            return true;
        }
        return false;
    }

}
