import java.text.DecimalFormat;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente() {
    }

    public Gerente(String cedula, String nombre, double salario, String departamento) {
        super(cedula, nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                '}';
    }

    DecimalFormat df = new DecimalFormat("0.0");
    @Override
    public void mostrarDetalles(){
        System.out.println("Cedula: "+cedula+"\nNombre: "+nombre+"\nSalario: $"+df.format(salario));

    }

    @Override
    public double calcularBonificaciones(){
        return salario*0.2;
    }
}
