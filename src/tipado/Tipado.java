package tipado;

public class Tipado {
    public static void main(String[] args){

        // 1. Numeicos
        // 1.1 Enteros
        byte numberByte = 5;
        short numberShort = 3;
        int numberInt = 23;
        long numberLong = 200L;
        long numberLong2 = 54645654656L;

        // 1.2 Decimales
        float numberFloat = 5.5F;
        double numberDouble = 46.89;
        double numberDouble2 = 100d;
        double precioComputadora = 1100.99;

        // 2. Boleanos
        boolean isValid = true;
        boolean isNotValid = false;

        // 3. Textos
        String name = "Gerson Benito";
        char vowel = 'A';

        System.out.println("variable String: "+name);
        System.out.println("Variable byte: "+numberByte);
        System.out.println("Variable short: "+numberShort);
        System.out.println("Variable int: "+numberInt);
        System.out.println("Variable long: "+numberLong);
        System.out.println("Variable long 2: "+numberLong2);
        System.out.println("Variable float: "+numberFloat);
        System.out.println("Variable double: "+numberDouble);
        System.out.println("Variable double 2: "+numberDouble2);
        System.out.println("Precio computadora: "+precioComputadora);
        System.out.println("is valid: "+isValid);
        System.out.println("is not valid: "+isNotValid);
        System.out.println("Vowel: "+vowel);
    }
}
