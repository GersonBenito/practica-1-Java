package operadores;

public class Operadores {
    public static void main(String[] args){
        // ==== aritmeticos ===
        int numero1 = 10;
        int numero2= 20;

        int resultadoSuma = numero1 + numero2;
        System.out.println("La suma es: "+resultadoSuma);

        // Test con sintaxis variable + numero dentro de un System.out.println
        System.out.println("Resultado mas cantidad: " + resultadoSuma + 40.99);

        // Test con sintaxis (variable + numero) dentro de un System.out.println
        System.out.println("Resultado mas cantidad: "+ (resultadoSuma + 40.99));

        int resultadoResta = numero2 - numero1;
        System.out.println("Resultado resta: " + resultadoResta);

        // Test con sintaxis variable - numero dentro de un System.out.println
        //System.out.println("Resultado menos cantidad: " + resultadoResta - 2.99);

        // Test con sintaxis (variable - numero) dentro de un System.out.println
        System.out.println("Resultado menos cantidad: "+ (resultadoResta - 2.99));


        // ==== comparacion ====
        /*
        > mayor que
        < menor que
        >= mayor igual que
        <= menor igual que
        == igual que
        === IMPORTANTE: EN JAVA NO EXISTE!!!!
         */

        boolean resultadoMayor = numero1 > numero2;
        System.out.println("Resultado mayor: " +  resultadoMayor);

        boolean resultadoMenor = numero1 < numero2;
        System.out.println("Resultado mayor: " + resultadoMenor);

        boolean resultadoIgual = numero1 == numero2;
        System.out.println("Resultado igual: " +  resultadoIgual);

        // ==== Lógicos ====
        /*
        and &&
        or ||
         */

        boolean resultadoAnd = numero1 > 5 && numero2 < 30;
        System.out.println("Resultado And: " + resultadoAnd);

        boolean resultadoOr = numero1 > 25 || numero2 < 30;
        System.out.println("Resultado Or: " + resultadoOr);

        int edad = 15;
        boolean resultadoAnd2 = edad >= 18 && edad <= 100;
        System.out.println("Resultado And 2: " + resultadoAnd2);

        // ==== operadores ====
        // incremento ++
        // decremento --
        int count = 0;
        // count ++;
        // count --;
    }
}
