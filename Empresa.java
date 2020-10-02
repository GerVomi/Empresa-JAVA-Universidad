package empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String razonSocial = "Empleados Company";
    private long cuit = 30171231230l;
    private ArrayList<Empleado> listaDeEmpleados = new ArrayList();

    public void agregarEmpleado(Empleado empleado) {
        this.listaDeEmpleados.add(empleado);
    }

    private float calcular() {
        float monto = 0;
        for (int i = 0; i < listaDeEmpleados.size(); i++) {
            monto += listaDeEmpleados.get(i).calcularSueldo(); // empleado.mostrarSueldo();
        }
        return monto;
    }

    public void montoTotal() {
        System.out.println("El monto total de las liquidaciones es de: $" + calcular());
    }

}
