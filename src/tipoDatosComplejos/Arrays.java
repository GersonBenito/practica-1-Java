package tipoDatosComplejos;

public class Arrays {
    public static void main(String[] args){

        // forma 1
        // arreglo se usa cuando se conoce la longuitud
        int arragloUno[] = new int[5];

        // asignar valores al arreglo
        arragloUno[0] = 1;
        arragloUno[1] = 2;
        arragloUno[2] = 3;
        arragloUno[3] = 4;
        arragloUno[4] = 5;

        // recorrer un arreglo
        for(int i : arragloUno){
            System.out.println("arrglo uno: " + i);
        }

        // forma 2
        int arregloDos[] = {1,2,3,4,5};
        String nombres[] = {"Pepe", "Grillo"};

        // recorrer arreglos
        for(int i : arregloDos){
            System.out.println("arreglo dos: " + i);
        }

        for(String nombre : nombres){
            System.out.println("nombre: " + nombre);
        }

        System.out.println("Longuitud del rreglo dos: " + arregloDos.length);
        System.out.println("Longuitud del arreglo de nombres: " + nombres.length);

        // forma 3
        // arreglo bidimincional
        int arregloBidi[][] = new int[2][4];

        arregloBidi[0][0] = 1;
        arregloBidi[0][1] = 2;
        arregloBidi[0][2] = 3;
        arregloBidi[0][3] = 4;

        arregloBidi[1][0] = 10;
        arregloBidi[1][1] = 20;
        arregloBidi[1][2] = 30;
        arregloBidi[1][3] = 40;

        int arregloBidiDos[][] = {
                {1,2,3,4},
                {10,20,30,40}
        };

        for (int i = 0; i < arregloBidi.length; i++){
            System.out.println("El valor de i: " + i);
            for(int j = 0; j < arregloBidi[i].length; j++){
                System.out.println("i = " + i + ", j = " + j);
                System.out.println("Bidi: " + arregloBidi[i][j]);
            }
        }

        // mutar arreglo
        String arrayNombres[] = {"Pepe", "Juan"};
        arrayNombres[0] = "Victor";
        arrayNombres[1] = "Paco";
        for (String nombre : arrayNombres){
            System.out.println(nombre);
        }
    }
}
