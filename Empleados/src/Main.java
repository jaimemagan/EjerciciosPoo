public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Juan", "Perez", "123456789", 5000);
        gerente.mostrarInformacion();
        System.out.println("Salario: " + gerente.calcularSalario());

        Programador programador = new Programador("Pedro", "Lopez", "987654321", 4000);
        programador.mostrarInformacion();
        System.out.println("Salario: " + programador.calcularSalario());




    }
}