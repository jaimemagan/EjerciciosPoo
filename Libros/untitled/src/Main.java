
public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();

        libro.setAutor("J. K. Rowling");
        libro.setTitulo("Harry Potter y la piedra filosofal");
        libro.setAnio(1997);
        libro.setNumpaginas(400);
        libro.setEditorial("Salamandra");



        Libro libro2 = new Libro();
        libro2.setAutor("J. K. Rowling");
        libro2.setTitulo("Harry Potter y la camara secreta ");
        libro2.setAnio(1997);
        libro2.setNumpaginas(400);
        libro2.setEditorial("Salamandra");



Libro libro3 = new Libro();
        libro3.setAutor("J. K. Rowling");
        libro3.setTitulo("Harry Potter y el caliz de fuego ");
        libro3.setAnio(1997);
        libro3.setNumpaginas(400);
        libro3.setEditorial("Salamandra");




Libro libro4 = new Libro();
        libro4.setAutor("J. K. Rowling");
        libro4.setTitulo("Harry Potter y la orden del fenix");
        libro4.setAnio(1997);
        libro4.setNumpaginas(400);
        libro4.setEditorial("Salamandra");


        MostrarInfo.mostrarInfo(libro);
        System.out.println(" ============================== ");
        MostrarInfo.mostrarInfo(libro2);
        System.out.println(" ============================== ");
        MostrarInfo.mostrarInfo(libro3);
        System.out.println(" ============================== ");
        MostrarInfo.mostrarInfo(libro4);


    }
}