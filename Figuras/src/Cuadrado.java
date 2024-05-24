public class Cuadrado extends Forma {
    private double lado;
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public double area() {
        return lado * lado;
    }
    public double perimetro() {
        return lado * 4;
    }
}
