public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindradad;


    public String detalle(){

        StringBuilder sb = new StringBuilder();

        sb.append("\n" + this.fabricante);
        sb.append("\n" + this.modelo);
        sb.append( "\n" + this.color);
        sb.append( "\n" +this.cilindradad );

        return sb.toString();
    }











}