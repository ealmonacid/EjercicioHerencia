import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("123456","Andres",18000000,"TI");

        Desarrollador d1 = new Desarrollador("6666","Laura",2500000,"Java");

        g1.mostrarDetalles();
        System.out.println("Bonificacion: "+g1.calcularBonificaciones()+"\n");

        d1.mostrarDetalles();
        System.out.println("Bonificacion: "+d1.calcularBonificaciones());
    }
}