package clases;

public class CocheMain {
    public static void main(String[] args){
        String coche = "alfa romeo";
        Coche cocheObj = new Coche();
        Coche cocjeObj2 = new Coche("Rojo", "Honda", "Civic", 1500.99, 1534.34);

        cocjeObj2.acelarar(50);
        System.out.println(cocjeObj2);

        cocjeObj2.peso = 1234.67;
        System.out.println(cocjeObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.modelo = "Toyota";
        cocheElectrico.fabricante = "Corola";
        cocheElectrico.color = "Negro";

        System.out.println(cocheElectrico);

        CocheHibrido cocheHibrido = new CocheHibrido();
        cocheHibrido.motorHibrido = "Motor Hibrido";
        cocheHibrido.modelo = "Ejemplo modelo";
        cocheHibrido.fabricante = "BMW";
        cocheHibrido.color = "Verde";

        System.out.println(cocheHibrido);

        CocheElectrico cocheElectrico2 = new CocheElectrico("Morado", "Ferrari", "Aventador",165.34, 5656.23,"motor electrico coche 2");
        System.out.println(cocheElectrico2);
    }
}
