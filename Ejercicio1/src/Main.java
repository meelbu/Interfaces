import entidades.ImpLibro;
import entidades.Libro;

public class Main {
    public static void main(String[] args) {

        ImpLibro libro1 = new ImpLibro();
        libro1.Titulo();
        libro1.autor();
        libro1.CantPaginas();
    }
}