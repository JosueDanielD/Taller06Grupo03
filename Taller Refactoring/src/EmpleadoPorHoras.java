public class EmpleadoPorHoras extends Empleado {
    private String genero;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento);
        super.setSalarioBase(calcularSalario());
        this.genero = genero;
    }

    //extract method
    public void imprimirDetalles() {
        imprimirNombre();
        imprimirGenero();
        imprimirSalario();
        imprimirHorasTrabajadas();
        imprimirDepartamento();
    }
    
    private void imprimirNombre() {
        System.out.println("Nombre: " + super.getNombre());
    }
    
    private void imprimirGenero() {
        System.out.println("Genero: " + this.genero);
    }
    
    private void imprimirSalario() {
        System.out.println("Salario: " + super.getSalarioBase());
    }
    
    private void imprimirHorasTrabajadas() {
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
    }
    
    private void imprimirDepartamento() {
        System.out.println("Departamento: " + super.getDepartamento());
    }
    

    //inline temp
    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * super.getTarifaHora();
    }

    // Más metodos
}