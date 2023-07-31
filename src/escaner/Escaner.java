package escaner;

import java.util.Scanner;

public class Escaner {
    public static void main(String[] args){
        int numero1 = 0;
        int numero2 = 0;
        String nombre = "";
        double monto = 0d;
        boolean carro = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        numero1 = scanner.nextInt();

        System.out.println("Ingresa el seguno numero: ");
        numero2 = scanner.nextInt();

        // para evitar el salto de linea
        scanner.nextLine();
        System.out.println("Ingrese un nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese un monto: ");
        monto = scanner.nextDouble();

        System.out.println("Ingrese si o no: ");
        carro = scanner.nextBoolean();

        System.out.println("El numero 1 es: " + numero1);
        System.out.println("El numero 2 es: " + numero2);
        System.out.println("El nombre es: " + nombre);
        System.out.println("El monto es: " + monto);
        System.out.println("Tiene caro: " + carro);

        scanner.close();
    }
}
