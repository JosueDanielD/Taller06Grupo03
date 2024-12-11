import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void contratarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void despedirEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    //método a refactorizar: Usando el extract method y Stream API
    public List<Empleado> obtenerEmpleadosPorHorasTrabajadasaPartirDe(int horas) {
        return filtrarEmpleadosPorHoras(horas);
    }

    private List<Empleado> filtrarEmpleadosPorHoras(int horas){
        return empleados.stream()
                .filter(empleado -> empleado.getHorasTrabajadas()>horas)
                .toList(); //más limpio que crear manualmente la lista.

    }

    // Más metodos
}

