package empresa;

public abstract class Empleado {

    protected int horasTrabajadas;
    protected final float PAGO_POR_HIJO = 200f;
    protected int cantidadHijos;

    private boolean casado;
    private final float SI_ES_CASADO = 100f;

    public Empleado(int horasTrabajadas, int cantidadHijos, boolean casado) {
        this.horasTrabajadas = horasTrabajadas;
        this.cantidadHijos = cantidadHijos;
        //this.antiguedad = antiguedad;
        this.casado = casado;
    }

    protected int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    protected float getPAGO_POR_HIJO() {
        return PAGO_POR_HIJO;
    }

    protected int getCantidadHijos() {
        return cantidadHijos;
    }

    protected boolean isCasado() {
        return casado;
    }

    protected float getSI_ES_CASADO() {
        return SI_ES_CASADO;
    }

    protected abstract float calcularSueldo();

}
