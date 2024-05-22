public class Libro {

    public String autor;
    public String titulo;
    public int anio;
    public int numpaginas;
    public String editorial;

    public Libro() {
        this.autor = autor;
        this.titulo = titulo;
        this.anio = anio;
        this.numpaginas = numpaginas;
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
