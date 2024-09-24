import java.text.DecimalFormat;

public class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador() {
    }

    public Desarrollador(String cedula, String nombre, double salario, String lenguaje) {
        super(cedula, nombre, salario);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Desarrollador{" +
                "lenguaje='" + lenguaje + '\'' +
                '}';
    }

    DecimalFormat df = new DecimalFormat("0.0");
    @Override
    public void mostrarDetalles(){
        System.out.println("Cedula: "+cedula+"\nNombre: "+nombre+"\nSalario: $"+salario);

    }

    @Override
    public double calcularBonificaciones(){
        return salario*0.1;
    }
}
