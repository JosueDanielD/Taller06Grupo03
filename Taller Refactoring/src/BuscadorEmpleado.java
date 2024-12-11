import java.util.List;

public class BuscadorEmpleado {
    //buscarEmpleadoPorNombre será refactorizado usando el método Extract Method
    //para tener una mejor legibilidad y permitir la reutilización al extraer la lógica del a búsqueda.

    public static Empleado buscarEmpleadoPorNombre(String nombre, List<Empleado> empleados) {
        return empleados.stream()
                .filter(empleado -> empleado.getNombre().equals(nombre)) //predicado: nombre de empleado coincide con parámetro nombre
                .findFirst()
                .orElse(null);
    }

    // Más metodos
}
