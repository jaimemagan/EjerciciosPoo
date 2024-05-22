public class Gato  extends Animal {
    private String raza;
    private String color;

    public Gato() {
    }

    public Gato(String raza, String color) {
        this.raza = raza;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void sonido() {
        System.out.println("Miau");
    }

    @Override
    void comer() {
        super.comer();
    }

    @Override
    void dormir() {
        super.dormir();
    }

    @Override
    void moverse() {
        super.moverse();
    }
}