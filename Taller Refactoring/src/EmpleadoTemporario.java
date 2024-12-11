public class EmpleadoTemporario extends Empleado {
    private String nombre;
    private String genero;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
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

    // Más metodos
}
