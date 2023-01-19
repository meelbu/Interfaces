import entidades.ImpVehiculo;

public class Main {
    public static void main(String[] args) {


        ImpVehiculo auto1 = new ImpVehiculo();
        System.out.println("AUTO");
        auto1.Marca();
        auto1.Patente();
        auto1.Color();
        auto1.Velocidad();
        auto1.MarcaCubierta();

        System.out.println("");

        ImpVehiculo moto1 = new ImpVehiculo();
        System.out.println("MOTO");
        moto1.Marca();
        moto1.Patente();
        moto1.Color();
        moto1.Velocidad();
        moto1.MarcaCubierta();


    }
}