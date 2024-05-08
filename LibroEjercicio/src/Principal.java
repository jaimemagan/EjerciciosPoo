public class Principal {
    public static void main(String[] args) {
        // Crear un objeto de la clase Libro
        Libro miLibro = new Libro();

        // Utilizar los métodos setters para establecer los atributos del libro
        miLibro.setTitulo("Harry Potter y la piedra filosofal");
        miLibro.setAutor("J.K Rowling");
        miLibro.setEditorial("Bloomsbury");
        miLibro.setNumpag(223);
        miLibro.setFechapublic(1997);
        miLibro.setISBN("978-0-7475-3269-9");
        miLibro.setEdicion("Primera Edicion");
        miLibro.setGenero("Fantasia");




        // Utilizar los métodos getters para obtener los atributos del libro
        System.out.println("Título del libro:\n " + miLibro.getTitulo());
        System.out.println("Autor del libro: \n" + miLibro.getAutor());
        System.out.println("Editorial del libro:\n " + miLibro.getEditorial());
        System.out.println("Número de páginas del libro:\n " + miLibro.getNumpag());
        System.out.println("Año de publicación del libro: \n" + miLibro.getFechapublic());
        System.out.println("ISBN del libro: \n" + miLibro.getISBN());
        System.out.println("Edición del libro: \n" + miLibro.getEdicion());
        System.out.println("Género del libro: \n" + miLibro.getGenero());
    }
}
