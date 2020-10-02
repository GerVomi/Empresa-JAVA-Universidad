package empresa;

public class EmpleadoPermanente extends Empleado {

    private final float PAGO_POR_HORA = 300f;
    private final float PAGO_POR_ANTIGUEDAD = 100f;
    private int antiguedad;

    public EmpleadoPermanente(int horasTrabajadas, int cantidadHijos, boolean casado, int antiguedad) {
        super(horasTrabajadas, cantidadHijos, casado);
        this.antiguedad=antiguedad;
    }

    @Override
    public float calcularSueldo() {
        float sueldo;
        sueldo = (getHorasTrabajadas() * PAGO_POR_HORA) + getCantidadHijos() * getPAGO_POR_HIJO() + antiguedad * PAGO_POR_ANTIGUEDAD;
        if (isCasado() == true) {
            sueldo += getSI_ES_CASADO();
        } else {
        }
        return sueldo;
    }

}
