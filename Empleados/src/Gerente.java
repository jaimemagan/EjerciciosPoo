public class Gerente extends Empleado {
    private String nombre;
    private String apellido;
    private String Dui;
    private double SalarioBase;

    public Gerente(String nombre, String apellido, String dui, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        Dui = dui;
        SalarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDui() {
        return Dui;
    }

    public void setDui(String dui) {
        Dui = dui;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        SalarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return SalarioBase + (SalarioBase * 0.1);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Dui: " + Dui);
    }
}
