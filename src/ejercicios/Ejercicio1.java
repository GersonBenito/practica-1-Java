package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    /*
        Ejericio 1: Crear un programa que verifique la edad de una persona, si la edad es mayor o igual a 18 años
        es mayor de edad, de lo contrario es mejor de edad, ademas validar que la edad no sea negativo
     */
    public static void main(String[] args){
        int edad = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad: ");
        edad = scanner.nextInt();

        if(!validarEdad(edad)){
            if (edad >= 18){
                System.out.println("Eres mayor de edad");
            }else{
                System.out.println("Eres menor de edad");
            }
        }

        scanner.close();
    }

    public static Boolean validarEdad(int edad){
        if(edad < 0){
            System.out.println("La edad no puede ser negativo");
            return true;
        }

        return false;
    }
}
