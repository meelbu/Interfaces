package entidades;

import java.util.Scanner;

public class ImpOperacion implements Operacion, Suma{

    @Override
    public void Saludar() {
        System.out.println("Hola!");
    }

    @Override
    public void TipoOperacion() {
        System.out.println("Vamos a hacer una suma");
    }

    @Override
    public void Operacion() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer numero");
        int num1= input.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2= input.nextInt();

        System.out.println("El resultado es: " + (num1 + num2));
    }

}
