package entidades;

public class ImpTransporte implements Transporte{

    @Override
    public void TipoTransporte() {
        System.out.println("Auto");
    }

    @Override
    public void Velocidad() {
        System.out.println("Velocidad alternativa");
    }

    @Override
    public void Asientos() {
        System.out.println("Asientos: 5");
    }
}
