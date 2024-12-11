class EmpleadoGeneral extends Empleado {

    public EmpleadoGeneral(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento) {
        super(nombre, salarioBase, horasTrabajadas, tarifaHora, departamento);
    }

    @Override
    protected double ajustarPorDepartamento() {
        return 0; // Sin ajuste adicional para otros departamentos
    }
}