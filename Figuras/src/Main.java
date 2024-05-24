public class Main {
    public static void main(String[] args) {

        Forma forma = new Circulo(1.0);
        double area =forma.area();
        System.out.println("area del circulo = " + area);
        double perimetro = forma.perimetro();
        System.out.println("perimetro del circulo  = " + perimetro);

        Forma forma2 = new Triangulo(5.0,2.0);
        double area2 = forma2.area();
        System.out.println("area del triangulo = " + area2);
        double perimetro2 = forma2.perimetro();
        System.out.println("perimetro del triangulo = " + perimetro2);

        Forma forma3 = new Cuadrado(3.0);

        double area3 = forma3.area();
        System.out.println("area del cuadrado  = " + area3);
        double perimetro3 = forma3.perimetro();
        System.out.println("perimetro del cuadrado = " + perimetro3);




    }
}