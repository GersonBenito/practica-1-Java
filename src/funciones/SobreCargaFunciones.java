package funciones;

public class SobreCargaFunciones {
    public static void main(String[] args){
        saludar();
        saludar("Gerson");
        String saludo = saludar("Gerson", "Benito");
        System.out.println(saludo);
    }

    public static void saludar(){
        String saludo = "Hola Gerson Benito";
        System.out.println(saludo);
    }

    public static void saludar(String name){
        System.out.println("Hola " + name);
    }

    public static String saludar(String name, String lastName){
        String saludo = "Hola "+ name + " "+ lastName;
       return saludo;
    }
}
