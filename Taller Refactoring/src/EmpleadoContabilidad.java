class EmpleadoContabilidad extends Empleado {
    public EmpleadoContabilidad(double salarioBase, int horasTrabajadas) {
        super(salarioBase, horasTrabajadas);
    }

    @Override
    protected double ajustarPorDepartamento() {
        return 10;
    }
}