package entidades;

public class EstudianteProfesor implements Profesor, Estudiante{

    @Override
    public void Saludar() {
        System.out.println("Buenas tardes");
    }

    @Override
    public void TomarLista() {
        System.out.println("Presente");
    }

    @Override
    public void Estudiar() {
        System.out.println("Estoy estudiando");
    }
}
