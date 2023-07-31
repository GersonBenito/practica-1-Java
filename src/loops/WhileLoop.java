package loops;

public class WhileLoop {

    public static void main(String[] args){
        int count = 0;

        while(count < 10){
           count++;
           if(count == 6){
               //continue; // salta el valor 6 y continua a la siguiente iterracion
               break; // rompe el flujo de ejecucion
           }
           System.out.println("Count " + count);
        }

        System.out.println("Fin");
    }
}
