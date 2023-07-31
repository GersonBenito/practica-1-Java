package funciones;

public class Funciones {
    public static void main(String[] args){
        // opcion 1: funcion sin parametros y sin tipo de retorno
        showMenu();

        // opcion 2: funcion sin parametro y con tipo de retorno
        double price = getPrice();
        System.out.println("Precio: " + price);
        String texto = getMenu();
        System.out.println("Texto: " + texto);

        // opcion 3: funcion con parametros y sin tipo de retorno
        imprimirSaludo("Gerson Benito");

        // opcion 4: funcion con parametro y tipo de retorno
        String nombre = "Gerson";
        String apellido = "Benito";
        String saludo = obtenerSaludo(nombre, apellido);

        System.out.println(saludo);

        int resultadoSuma = suma(10, 30);

        System.out.println("Resultado suma: " + resultadoSuma);
    }

    // void indica que no retorno o devuelve nada
    public static void showMenu(){
        System.out.println("Bienvenidos al E-comerce de zapatillas:");
        System.out.println("1 - Ver zapatitllas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
    }

    // funcion con retorno
    public static double getPrice(){
        double price = 199.99;
        return price;
    }

    public static String getMenu(){
        String texto = "Este es un texto en el menu";
        return texto;
    }

    // funcion con parametro y sin retorno
    public static void  imprimirSaludo(String nombre){
        System.out.println("Hola " + nombre);
    }

    // funcion con parametro y tipo de retorno
    public static String obtenerSaludo(String nombre, String apellido){
        String saludo = "Hola " + nombre + " "+ apellido;
        return saludo;
    }

    public static int suma(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
}
