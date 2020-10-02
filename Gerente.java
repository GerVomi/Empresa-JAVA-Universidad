package empresa;

public class Gerente extends EmpleadoPermanente {

    private final float PAGO_POR_HORA = 400f;
    private final float PAGO_POR_ANTIGUEDAD = 150f;
    private int antiguedad;

    public Gerente( int horasTrabajadas, int cantidadHijos, boolean casado, int antiguedad) {
        super(horasTrabajadas, cantidadHijos, casado, antiguedad);
        this.antiguedad = antiguedad;
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
