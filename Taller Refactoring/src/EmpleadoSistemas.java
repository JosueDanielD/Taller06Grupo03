class EmpleadoSistemas extends Empleado {
    public EmpleadoSistemas(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento) {
        super(nombre, salarioBase, horasTrabajadas, tarifaHora, departamento);
    }

    @Override
    protected double ajustarPorDepartamento() {
        return 20;
    }
}