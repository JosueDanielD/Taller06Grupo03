public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    private String genero;

    // Constructor: Eliminamos horasTrabajadas, ya que no tiene sentido para un empleado fijo
    public EmpleadoFijo(String nombre, double salarioBase, String departamento, double bonoAnual, String genero) {

        super(nombre, salarioBase, 0, 0, departamento); // Aquí, 0 es utilizado para horasTrabajadas, que ya no tiene sentido
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }

    // Método principal que imprime los detalles del empleado
    public void imprimirDetalles() {
        imprimirNombre();       // Imprime el nombre
        imprimirGenero();       // Imprime el género
        imprimirSalarioBase();  // Imprime el salario base
        imprimirDepartamento(); // Imprime el departamento
        imprimirBonoAnual();    // Imprime el bono anual
        imprimirHorasTrabajadas();
    }

    // Método para imprimir el nombre del empleado
    private void imprimirNombre() {
        System.out.println("Nombre: " + super.getNombre());
    }
    public void imprimirHorasTrabajadas(){
        System.out.println("horas trabajadas: " + super.getHorasTrabajadas());
    }
    // Método para imprimir el género del empleado
    private void imprimirGenero() {
        System.out.println("Genero: " + genero);
    }

    // Método para imprimir el salario base del empleado
    private void imprimirSalarioBase() {
        System.out.println("Salario Base: " + super.getSalarioBase());
    }

    // Método para imprimir el departamento del empleado
    private void imprimirDepartamento() {
        System.out.println("Departamento: " + super.getDepartamento());
    }

    // Método para imprimir el bono anual del empleado
    private void imprimirBonoAnual() {
        System.out.println("Bono Anual: " + bonoAnual);
    }

    @Override
    protected double ajustarPorDepartamento() {
        return 10;
    }


    // Más métodos
}
