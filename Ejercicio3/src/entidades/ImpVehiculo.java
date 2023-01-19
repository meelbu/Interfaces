package entidades;

import java.util.Scanner;

public class ImpVehiculo implements Auto, Moto{

    @Override
    public void Velocidad() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la velocidad");
        int vel = input.nextInt();
        System.out.println("Velocidad: " + vel);
    }

    @Override
    public void Color() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el color");
        String color = input.nextLine();
    }

    @Override
    public void Patente() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la patente");
        int pat = input.nextInt();
    }

    @Override
    public void Marca() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la marca");
        String marca = input.nextLine();
    }

    @Override
    public void MarcaCubierta() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la marca cubierta");
        String mc = input.nextLine();
    }

}
