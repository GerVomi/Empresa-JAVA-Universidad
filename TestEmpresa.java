package empresa;

public class TestEmpresa {

    public static void main(String[] args) {
        Empleado juanTemporario = new EmpleadoTemporario(80, 0, true);
        Empleado luisPermanente = new EmpleadoPermanente(80, 2, true, 6);
        //Empleado josePermanente1 = new EmpleadoPermanente(160, 0, false, 4);
        Empleado julioGerente = new Gerente(160,1,true,10);
        
        
        Empresa empresa = new Empresa();
        empresa.agregarEmpleado(julioGerente);
        empresa.agregarEmpleado(luisPermanente);
        //empresa.agregarEmpleado(josePermanente1);
        empresa.agregarEmpleado(juanTemporario);
        

        empresa.montoTotal();

    }
}
