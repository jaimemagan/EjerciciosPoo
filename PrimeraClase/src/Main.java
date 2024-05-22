//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Automovil mazda = new Automovil();

        mazda.fabricante = "mazda";
        mazda.modelo = "speed 3";
        mazda.color="negro";
        mazda.cilindradad=2.5;

        Automovil bmw = new Automovil();


        bmw.fabricante = "BMW";
        bmw.modelo = "760LI";
        bmw.color="Blanco";
        bmw.cilindradad=6.4;

        System.out.println(mazda.detalle());
        System.out.println( bmw.detalle());



        }
    }
