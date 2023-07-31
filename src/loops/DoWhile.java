package loops;

public class DoWhile {

    public static void main(String[] args){
        int count = 0;

        do{
            if(count == 1){
                System.out.println("contador es: " + count);
            }
            count++;
            System.out.println("contador: "+count);
        }while (count < 10);
    }
}
