public class Triangulo  extends Forma{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo: base=" + base + ", altura=" + altura;
    }

    @Override
    public double perimetro() {
        return (base * 2) + (altura * 2);
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }
}
