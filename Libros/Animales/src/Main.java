
public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro();
        Gato gato = new Gato();

        Perro perro1 = new Perro("Chihuahua", "Cafe");
        Gato gato1 = new Gato("Siames", "Negro");
        Perro perro2 = new  Perro("Pitbull", "Blanco");
        Gato gato2 = new Gato("Persa", "Cafe");

        ImpresoraSonida ip = new ImpresoraSonida();

        

        ip.imprimirSonido(perro);
        ip.imprimirSonido(gato);
        ip.imprimirSonido(perro1);
        ip.imprimirSonido(gato1);
        ip.imprimirSonido(perro2);
        ip.imprimirSonido(gato2);

    }
}