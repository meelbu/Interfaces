package entidades;

public class ImpLibro implements Libro{

    @Override
    public void Titulo() {
        System.out.println("Libro: Variaciones en rojo");
    }

    @Override
    public void autor() {
        System.out.println("Autor: Rodolfo Walsh");
    }

    @Override
    public void CantPaginas() {
        System.out.println("Paginas: 174");
    }
}
