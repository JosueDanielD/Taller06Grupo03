public class EmpleadoTemporario extends Empleado {

    private int mesesContrato;
    private String genero;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0.0, departamento); // Llama al constructor de la clase base
        this.mesesContrato = mesesContrato;
        this.genero = genero;
    }

    public void imprimirDetalles() {
        imprimirInformacionGeneral();
        imprimirDetalleContrato();
    }

    private void imprimirInformacionGeneral() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);  // Se arregló el uso incorrecto de super.getNombre()
        System.out.println("Salario: " + salarioBase);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
    }

    private void imprimirDetalleContrato() {
        System.out.println("Departamento: " + departamento);
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    @Override
    protected double ajustarPorDepartamento() {
        return 50;
    }

    // Más metodos
}
