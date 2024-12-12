class EmpleadoSistemas extends EmpleadoBase {
    public EmpleadoSistemas(double salarioBase, int horasTrabajadas) {
        super(salarioBase, horasTrabajadas);
    }

    @Override
    protected double ajustarPorDepartamento() {
        return 20;
    }
}