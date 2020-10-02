package empresa;

public class EmpleadoTemporario extends Empleado {

    private final float PAGO_POR_HORA = 200;

    public EmpleadoTemporario(int horasTrabajadas, int cantidadHijos, boolean casado) {
        super(horasTrabajadas, cantidadHijos, casado);
    }

    @Override
    public float calcularSueldo() {
        float sueldo;
        sueldo = (getHorasTrabajadas() * PAGO_POR_HORA) + getCantidadHijos() * getPAGO_POR_HIJO();
        if (isCasado() == true) {
            sueldo += getSI_ES_CASADO();
        } else {
        }
        return sueldo;
    }

}
