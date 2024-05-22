public class MostrarInfo {


    public static void mostrarInfo(Libro libro) {
        System.out.println("El autor es: " + libro.getAutor());
        System.out.println("El título es: " + libro.getTitulo());
        System.out.println("El año es: " + libro.getAnio());
        System.out.println("El número de páginas es: " + libro.getNumpaginas());
        System.out.println("La editorial es: " + libro.getEditorial());
    }


   public static void mostrar() {
        Libro libro = new Libro();
        mostrarInfo(libro);
    }
}


